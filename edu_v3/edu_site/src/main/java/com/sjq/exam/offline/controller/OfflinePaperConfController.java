package com.sjq.exam.offline.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.xssf.usermodel.XSSFDataValidation;
import org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint;
import org.apache.poi.xssf.usermodel.XSSFDataValidationHelper;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.sjq.detail.service.ExamDetailService;
import com.sjq.detail.vo.ExamDetailVo;
import com.sjq.knowledge.search.BaseKnowledgeSearch;
import com.sjq.knowledge.service.BaseKnowledgeService;
import com.sjq.knowledge.vo.BaseKnowledgeVo;
import com.sjq.offpaperconf.search.OffPaperConfSearch;
import com.sjq.offpaperconf.servlet.OffPaperConfService;
import com.sjq.offpaperconf.vo.OffPaperConfBean;
import com.sjq.type.search.QuestionTypeSearch;
import com.sjq.type.service.QuestionTypeService;
import com.sjq.type.vo.QuestionTypeVo;
import com.sjq.util.MyLogger;
import com.sjq.utils.PoiExcelUtil;

@Controller
@RequestMapping(value = "/exam/offline/paperconf")
public class OfflinePaperConfController {
	
	//jsp跳转目录
	private static final String PAGE_FOLDER="exam/offline/";
	
	//线下下载基础数据模版页面
	private static final String PAGE = "exam_offline_imp_and_exp_conf";
	
	@Autowired
	private ExamDetailService examDetailService;
	
	@Autowired
	private QuestionTypeService questionTypeService;
	
	@Autowired
	private BaseKnowledgeService baseKnowledgeService;
	
	@Autowired
	private OffPaperConfService offPaperConfService;
	
	//记录日志对象
    private static final MyLogger LOGGER = new MyLogger(OfflinePaperConfController.class);
    
    /**
     * 
     * @MethodName:cascadeRequest
     * @Description:TODO
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
	@RequestMapping(value = "/list")
	public ModelAndView cascadeRequest(HttpServletRequest request, HttpServletResponse response,String examName,Long examDetailId,String examTypeName,String examMethod) throws Exception {
		ModelAndView mav = new ModelAndView();
		ExamDetailVo examDetailVo = examDetailService.queryExamDetailById(examDetailId);
		mav.addObject("examName", examName);
		mav.addObject("examMethod", examMethod);
		mav.addObject("examTypeName", examTypeName);
		mav.addObject("examDetailVo", examDetailVo);
		mav.setViewName(PAGE_FOLDER + PAGE);
        return mav;
	}
	
	@Transactional
	@ResponseBody
    @RequestMapping(value = "/batchimport",method = RequestMethod.POST)
    public Map<String,String> batchimport(@RequestParam(value="filename") MultipartFile file,OffPaperConfSearch search,
            HttpServletRequest request,HttpServletResponse response) throws IOException{
    	LOGGER.info("导入试卷配置...");
    	Map<String,String> map = new HashMap<String,String>();
        String Msg = null;
        boolean b = false;
        //判断文件是否为空
        if(file == null){
            Msg ="文件是为空！";
            map.put("msg",Msg);
            return map;
        }
        //获取文件名
        String name = file.getOriginalFilename();
        //创建处理EXCEL
        PoiExcelUtil readExcel = new PoiExcelUtil();
        //进一步判断文件是否为空（即判断其大小是否为0或其名称是否为null）验证文件名是否合格
        long size = file.getSize();
        if(name == null || ("").equals(name) && size == 0 && !PoiExcelUtil.validateExcel(name)){
            Msg ="文件格式不正确！请使用.xls或.xlsx后缀文档。";
            map.put("msg",Msg);
            return map;
        }
        //解析excel，获取考生信息集合。
        List<OffPaperConfBean> offPaperConfBeanList = readExcel.getPaperConfInfo(file,name,search);
        if(offPaperConfBeanList != null && offPaperConfBeanList.size() > 0){
            b = true;
        }
        if(b){
        	offPaperConfService.deleteOffPaperConfBatch(search.getExamId(), search.getExamDetailId());
        	offPaperConfService.insertOffPaperConfBatch(offPaperConfBeanList);
        	Msg ="批量导入EXCEL成功！";
        	map.put("msg",Msg); 
        }else{
        	Msg ="批量导入EXCEL失败！";
        	map.put("msg",Msg);
        } 
        return map;
    }
    
    /**
     * 下载Excel模板
     * @param fileName
     * @param request
     * @param response
     * @return
     * @throws UnsupportedEncodingException 
     */
    @RequestMapping("/paperconfdownload")
    public String download(HttpServletRequest request,HttpServletResponse response,String gradeId,String gradeName, Long subjectId,String subjectName) throws Exception {
        String fileName = PoiExcelUtil.processFileName(request, "试卷配置.xlsx");
        response.setCharacterEncoding("utf-8");
        response.setContentType("multipart/form-data");
        response.setHeader("Content-Disposition", "attachment;fileName="+ fileName);
        try {
        	//模板存放路径
        	InputStream inputStream = getClass().getClassLoader().getResourceAsStream("/com/sjq/template/试卷配置.xlsx");
            //读取excel模板  
            XSSFWorkbook wb = new XSSFWorkbook(inputStream);  
            //读取了模板内所有sheet内容  
            XSSFSheet sheet = wb.getSheetAt(0);
            //根据考试编码及学科编码，获取对应学科的所有知识模块
            BaseKnowledgeSearch baseKnowledgeSearch = new BaseKnowledgeSearch();
            baseKnowledgeSearch.setGradeId(gradeId);
            baseKnowledgeSearch.setSubjectId(subjectId.toString());
            baseKnowledgeSearch.setParentId(0l);
            List<BaseKnowledgeVo> baseKnowledgeVoList = baseKnowledgeService.queryBaseKnowledgeBySearch(baseKnowledgeSearch);
            String [] pointAry = new String[baseKnowledgeVoList.size()];
            for (int i = 0; i < baseKnowledgeVoList.size(); i++) {
            	pointAry[i] = baseKnowledgeVoList.get(i).getName();
			}
            //根据考试编码及学科编码，获取对应学科的所有认知层次
            String[] abilityAry = {"知道","领会","应用","分析","综合","评价"};
            //根据考试编码及学科编码，获取对应学科的所有题型
            QuestionTypeSearch questionTypeSearch = new QuestionTypeSearch();
            questionTypeSearch.setSubjectId(subjectId);
            List<QuestionTypeVo> questionTypeVoList = questionTypeService.queryQuestionTypeBySearch(questionTypeSearch);
            String [] typeAry = new String[questionTypeVoList.size()];
            for (int i = 0; i < questionTypeVoList.size(); i++) {
            	typeAry[i] =questionTypeVoList.get(i).getTypeName();
			}
            String gradeNameAry[] ={gradeName};
            XSSFDataValidationHelper dvHelper = new XSSFDataValidationHelper(sheet);  
            XSSFDataValidationConstraint dvConstraint0 = (XSSFDataValidationConstraint) dvHelper.createExplicitListConstraint(gradeNameAry);  
            CellRangeAddressList addressList0 = new CellRangeAddressList(1, 500, 0, 0); //选定excle区域 起始行号，终止行号， 起始列号，终止列号
            XSSFDataValidation validation0 = (XSSFDataValidation) dvHelper.createValidation(dvConstraint0, addressList0); 
            validation0.createErrorBox("输入值有误", "请从下拉框中选择");
            validation0.setShowErrorBox(true);
            sheet.addValidationData(validation0);
            
            String subjectNameAry[] ={subjectName};
            XSSFDataValidationConstraint dvConstraint1 = (XSSFDataValidationConstraint) dvHelper.createExplicitListConstraint(subjectNameAry);  
            CellRangeAddressList addressList1 = new CellRangeAddressList(1, 500, 1, 1); //选定excle区域 起始行号，终止行号， 起始列号，终止列号
            XSSFDataValidation validation1 = (XSSFDataValidation) dvHelper.createValidation(dvConstraint1, addressList1); 
            validation1.createErrorBox("输入值有误", "请从下拉框中选择");
            validation1.setShowErrorBox(true);
            sheet.addValidationData(validation1);
            
            if(pointAry.length>0){
	            XSSFDataValidationConstraint dvConstraint = (XSSFDataValidationConstraint) dvHelper.createExplicitListConstraint(pointAry);  
	            CellRangeAddressList addressList = new CellRangeAddressList(1, 500, 3, 3); //选定excle区域 起始行号，终止行号， 起始列号，终止列号
	            XSSFDataValidation validation = (XSSFDataValidation) dvHelper.createValidation(dvConstraint, addressList); 
	            validation.createErrorBox("输入值有误", "请从下拉框中选择");
	            validation.setShowErrorBox(true);
	            sheet.addValidationData(validation);
            }
            
            XSSFDataValidationConstraint dvConstraint2 = (XSSFDataValidationConstraint) dvHelper.createExplicitListConstraint(abilityAry);
            CellRangeAddressList addressList2 = new CellRangeAddressList(1, 500, 4, 4); //选定excle区域 起始行号，终止行号， 起始列号，终止列号
            XSSFDataValidation validation2 = (XSSFDataValidation) dvHelper.createValidation(dvConstraint2, addressList2); 
            validation2.createErrorBox("输入值有误", "请从下拉框中选择");
            validation2.setShowErrorBox(true);
            sheet.addValidationData(validation2); 
            if(typeAry.length>0){
	            XSSFDataValidationConstraint dvConstraint3 = (XSSFDataValidationConstraint) dvHelper.createExplicitListConstraint(typeAry);
	            CellRangeAddressList addressList3 = new CellRangeAddressList(1, 500, 5, 5); //选定excle区域 起始行号，终止行号， 起始列号，终止列号
	            XSSFDataValidation validation3 = (XSSFDataValidation) dvHelper.createValidation(dvConstraint3, addressList3); 
	            validation3.createErrorBox("输入值有误", "请从下拉框中选择");
	            validation3.setShowErrorBox(true);
	            sheet.addValidationData(validation3);   
            }
            //导出组装后的新模板 
            OutputStream os = response.getOutputStream();
            wb.write(os);
            //关闭流
            os.close();
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
