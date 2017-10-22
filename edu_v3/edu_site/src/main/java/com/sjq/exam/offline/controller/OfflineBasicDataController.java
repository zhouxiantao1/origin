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

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
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

import com.sjq.area.search.BaseAreaSearch;
import com.sjq.area.service.BaseAreaService;
import com.sjq.area.vo.BaseAreaVo;
import com.sjq.classes.search.BaseClassesSearch;
import com.sjq.classes.service.BaseClassesService;
import com.sjq.classes.vo.BaseClassesVo;
import com.sjq.detail.service.ExamDetailService;
import com.sjq.detail.vo.ExamDetailVo;
import com.sjq.offpaperconf.servlet.OffPaperConfService;
import com.sjq.offpaperscore.search.OffPaperscoreSearch;
import com.sjq.offpaperscore.service.OffPaperscoreService;
import com.sjq.offpaperscore.vo.OffPaperscoreVo;
import com.sjq.offquestionscore.service.OffQuestionscoreService;
import com.sjq.school.search.BaseSchoolSearch;
import com.sjq.school.service.BaseSchoolService;
import com.sjq.school.vo.BaseSchoolVo;
import com.sjq.security.util.CustomUser;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.staff.service.BaseStaffService;
import com.sjq.staff.vo.BaseStaffVo;
import com.sjq.student.search.BaseStudentSearch;
import com.sjq.student.service.BaseStudentService;
import com.sjq.student.vo.BaseStudentVo;
import com.sjq.student.vo.ExamStudentVo;
import com.sjq.teacher.service.BaseTeacherService;
import com.sjq.teacher.vo.BaseTeacherVo;
import com.sjq.teacherClasses.search.BaseTeacherClassesSearch;
import com.sjq.teacherClasses.service.BaseTeacherClassesService;
import com.sjq.teacherClasses.vo.BaseTeacherClassesVo;
import com.sjq.util.MyLogger;
import com.sjq.utils.PoiExcelUtil;

@Controller
@RequestMapping(value = "/exam/offline/basicdata")
public class OfflineBasicDataController {
	
	//jsp跳转目录
	private static final String PAGE_FOLDER="exam/offline/";
	
	//线下下载基础数据模版页面
	private static final String PAGE = "exam_offline_imp_and_exp_basic";
	
	@Autowired
	private ExamDetailService examDetailService;
	
	@Autowired
	private BaseAreaService baseAreaService;
	
	@Autowired
	private BaseSchoolService baseSchoolService;
	
	@Autowired
	private BaseClassesService baseClassesService;
	
	@Autowired
	private BaseTeacherService baseTeacherService;
	
	@Autowired
	private BaseStaffService baseStaffService;
	
	@Autowired
	private BaseTeacherClassesService baseTeacherClassesService;
	
	@Autowired
	private BaseStudentService baseStudentService;
	
	@Autowired
	private OffPaperConfService offPaperConfService;
	
	@Autowired
	private OffPaperscoreService offPaperscoreService;
	
	@Autowired
	private OffQuestionscoreService offQuestionscoreService;
	
	//记录日志对象
    private static final MyLogger LOGGER = new MyLogger(OfflineBasicDataController.class);
	
	
	@RequestMapping(value = "/list")
	public ModelAndView impAndExpRequest(HttpServletRequest request, HttpServletResponse response,String examName,Long examDetailId,Long gradeId,String examTypeName,String examMethod) throws Exception {
		ModelAndView mav = new ModelAndView();
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		if(cu.getRole().getCode().equals("ROLE_02") || cu.getRole().getCode().equals("ROLE_03") || cu.getRole().getCode().equals("Role_7")){
			//市级角色
			List<BaseAreaVo> baseAreaVoList= baseAreaService.queryBaseAreaByParentId(1l);
			mav.addObject("baseAreaVoList", baseAreaVoList);
			mav.addObject("role", 4);
		}else if(cu.getRole().getCode().equals("ROLE_04") || cu.getRole().getCode().equals("ROLE_05")){
			//区级角色
			BaseStaffVo baseStaffVo = baseStaffService.queryBaseStaffByUserId(cu.getUserId());
			BaseAreaSearch baseAreaSearch = new BaseAreaSearch();
			baseAreaSearch.setId(baseStaffVo.getAreaId());
			List<BaseAreaVo> baseAreaVoList= baseAreaService.queryBaseAreaBySearch(baseAreaSearch);
			mav.addObject("baseAreaVoList", baseAreaVoList);
			List<BaseSchoolVo> baseSchoolVoList = baseSchoolService.queryBaseSchoolByAreaId(baseAreaVoList.get(0).getId());
			mav.addObject("baseSchoolVoList", baseSchoolVoList);
			mav.addObject("role", 3);
		}else if(cu.getRole().getCode().equals("ROLE_06") || cu.getRole().getCode().equals("ROLE_07") || cu.getRole().getCode().equals("ROLE_08")){
			//校级角色
			BaseStaffVo baseStaffVo = baseStaffService.queryBaseStaffByUserId(cu.getUserId());
			BaseAreaSearch baseAreaSearch = new BaseAreaSearch();
			baseAreaSearch.setId(baseStaffVo.getAreaId());
			List<BaseAreaVo> baseAreaVoList= baseAreaService.queryBaseAreaBySearch(baseAreaSearch);
			mav.addObject("baseAreaVoList", baseAreaVoList);
			BaseSchoolSearch baseSchoolSearch = new BaseSchoolSearch();
			baseSchoolSearch.setId(baseStaffVo.getSchoolId());
			List<BaseSchoolVo> baseSchoolVoList = baseSchoolService.queryBaseSchoolBySearch(baseSchoolSearch);
			mav.addObject("baseSchoolVoList", baseSchoolVoList);
			BaseClassesSearch baseClassesSearch = new BaseClassesSearch();
			baseClassesSearch.setSchoolId(baseSchoolVoList.get(0).getId());
			baseClassesSearch.setGradeId(gradeId);
			List<BaseClassesVo> baseClassesVoList = baseClassesService.queryBaseClassesBySearch(baseClassesSearch);
			mav.addObject("baseClassesVoList", baseClassesVoList);
			mav.addObject("role", 2);
		}else if(cu.getRole().getCode().equals("ROLE_09")){
			//班级角色
			BaseTeacherVo baseTeacherVo = baseTeacherService.queryBaseTeacherByUserId(cu.getUserId());
			BaseAreaSearch baseAreaSearch = new BaseAreaSearch();
			baseAreaSearch.setId(baseTeacherVo.getAreaId());
			List<BaseAreaVo> baseAreaVoList= baseAreaService.queryBaseAreaBySearch(baseAreaSearch);
			mav.addObject("baseAreaVoList", baseAreaVoList);
			BaseSchoolSearch baseSchoolSearch = new BaseSchoolSearch();
			baseSchoolSearch.setId(baseTeacherVo.getSchoolId());
			List<BaseSchoolVo> baseSchoolVoList = baseSchoolService.queryBaseSchoolBySearch(baseSchoolSearch);
			mav.addObject("baseSchoolVoList", baseSchoolVoList);
			BaseTeacherClassesSearch baseTeacherClassesSearch = new BaseTeacherClassesSearch();
			baseTeacherClassesSearch.setGradeId(gradeId);
			baseTeacherClassesSearch.setTeacherId(baseTeacherVo.getId());
			List<BaseTeacherClassesVo> baseTeacherClassesVoList = baseTeacherClassesService.queryBaseTeacherClassesBySearch(baseTeacherClassesSearch);
			mav.addObject("baseTeacherClassesVoList", baseTeacherClassesVoList);
			mav.addObject("role", 1);
		}
		ExamDetailVo examDetailVo = examDetailService.queryExamDetailById(examDetailId);
		mav.addObject("examName", examName);
		mav.addObject("examMethod", examMethod);
		mav.addObject("examTypeName", examTypeName);
		mav.addObject("examDetailVo", examDetailVo);
		mav.setViewName(PAGE_FOLDER + PAGE);
        return mav;
	}
	
    /**
     * 上传Excel,读取Excel中内容
     * @param file
     * @param request
     * @param response
     * @return
     * @throws IOException
     */
	@Transactional
	@ResponseBody
    @RequestMapping(value = "/batchimport",method = RequestMethod.POST)
    public Map<String,String> batchimport(@RequestParam(value="filename") MultipartFile file,OffPaperscoreSearch search,
            HttpServletRequest request,HttpServletResponse response) throws IOException{
    	LOGGER.info("导入线下考试成绩...");
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
        OffPaperscoreVo offPaperscoreVo = readExcel.getExcelInfo(file,name,search,offPaperscoreService);
        if(offPaperscoreVo != null && offPaperscoreVo.getOffPaperscoreBeanList().size() > 0 && offPaperscoreVo.getOffQuestionscoreBeanList().size() > 0){
            b = true;
        }
        if(b){
        	offPaperscoreService.deleteOffPaperscoreBatch(search.getExamId(), search.getExamDetailId());
        	offQuestionscoreService.deleteOffQuestionScoreBatch(search.getExamId(), search.getExamDetailId());
        	offPaperscoreService.insertOffPaperscoreBatch(offPaperscoreVo.getOffPaperscoreBeanList());
        	offQuestionscoreService.insertOffQuestionScoreBatch(offPaperscoreVo.getOffQuestionscoreBeanList());
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
    @RequestMapping("/basicdatadownload")
    public String download(HttpServletRequest request,HttpServletResponse response, ExamStudentVo examStudent) throws Exception {
        String fileName = PoiExcelUtil.processFileName(request, "考生作答数据.xlsx");
        response.setCharacterEncoding("utf-8");
        response.setContentType("multipart/form-data");
        response.setHeader("Content-Disposition", "attachment;fileName="+ fileName);
        try {
        	//模板存放路径
        	InputStream inputStream = getClass().getClassLoader().getResourceAsStream("/com/sjq/template/考生作答数据.xlsx");
            //读取excel模板  
            XSSFWorkbook wb = new XSSFWorkbook(inputStream);  
            //读取了模板内所有sheet内容  
            XSSFSheet sheet = wb.getSheetAt(0);
            //根据考试编码及学科编码，获取对应的所有小题
            List<String> list = offPaperConfService.queryAllQuestionNo(examStudent.getExamDetailId());
            for (int i = 0; i < list.size(); i++) {
            	//在相应的单元格进行赋值 
                XSSFCell cell = sheet.getRow(0).createCell(6+i);  
                cell.setCellValue(list.get(i));
			}
            //根据考试编码及学科编码，获取对应的所有考生基础信息及作答信息
            BaseStudentSearch baseStudentSearch = new BaseStudentSearch();
            baseStudentSearch.setGradeId(examStudent.getGradeId());
            baseStudentSearch.setAreaId(examStudent.getDistrictId());
            baseStudentSearch.setSchoolId(examStudent.getSchoolId());
            baseStudentSearch.setClassesId(examStudent.getClassId());
            List<BaseStudentVo> baseStudentVoList = baseStudentService.queryBaseStudentBySearch(baseStudentSearch);
            for (int i = 0; i < baseStudentVoList.size(); i++) {
            	XSSFRow row = sheet.createRow(i+1);
            	//在相应的单元格进行赋值  
                XSSFCell cell1 = row.createCell(0);  
                cell1.setCellValue(baseStudentVoList.get(i).getNumber());
                XSSFCell cell2 = row.createCell(1);  
                cell2.setCellValue(baseStudentVoList.get(i).getName());
                XSSFCell cell3 = row.createCell(2);  
                cell3.setCellValue(baseStudentVoList.get(i).getBaseAreaVo().getName());
                XSSFCell cell4 = row.createCell(3);  
                cell4.setCellValue(baseStudentVoList.get(i).getBaseSchoolVo().getName());
                XSSFCell cell5 = row.createCell(4);  
                cell5.setCellValue(baseStudentVoList.get(i).getBaseClassesVo().getName());
			}
            //导出组装后的新模板 
            OutputStream os = response.getOutputStream();
            wb.write(os);
            /*byte[] b = new byte[2048];
            int length;
            while ((length = inputStream.read(b)) > 0) {
                os.write(b, 0, length);
            }*/
            
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
