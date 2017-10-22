package com.sjq.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.sjq.offpaperconf.search.OffPaperConfSearch;
import com.sjq.offpaperconf.vo.OffPaperConfBean;
import com.sjq.offpaperscore.bean.OffPaperscoreBean;
import com.sjq.offpaperscore.search.OffPaperscoreSearch;
import com.sjq.offpaperscore.service.OffPaperscoreService;
import com.sjq.offpaperscore.vo.OffPaperscoreVo;
import com.sjq.offquestionscore.bean.OffQuestionscoreBean;

public class PoiExcelUtil {
	//总行数
    private int totalRows = 0;  
    //总列数
    private int totalCells = 0; 
    //错误信息接收器
    private String errorMsg;
    //构造方法
    public PoiExcelUtil(){}
    //获取总行数
    public int getTotalRows()  { return totalRows;} 
    //获取总列数
    public int getTotalCells() {  return totalCells;} 
    //获取错误信息-暂时未用到暂时留着
    public String getErrorInfo() { return errorMsg; }
    
	/**
	 * 
	 * @MethodName:getExcelInfo
	 * @Description:读EXCEL文件，获取学生作答信息集合
	 * @param Mfile
	 * @return
	 */
    public OffPaperscoreVo getExcelInfo(MultipartFile Mfile,String name,OffPaperscoreSearch search,OffPaperscoreService offPaperscoreService){
    	//把spring文件上传的MultipartFile转换成CommonsMultipartFile类型
    	CommonsMultipartFile cf= (CommonsMultipartFile)Mfile; 
        //获取本地存储路径
        File file = new  File("D:\\fileupload");
        //创建一个目录 （它的路径名由当前 File 对象指定，包括任一必须的父路径。）
        if (!file.exists()) file.mkdirs();
        //新建一个文件
        File file1 = new File("D:\\fileupload\\" + new Date().getTime() + ".xls"); 
        //将上传的文件写入新建的文件中
        try {
        	cf.getFileItem().write(file1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //初始化学生作答信息
        OffPaperscoreVo offPaperscoreVo = new OffPaperscoreVo();
        //初始化输入流
        FileInputStream is = null;
        Workbook wb = null;
        try{
        	//根据新建的文件实例化输入流
            is = new FileInputStream(file1);
            if(isExcel2003(name)){
            	//当excel是2003时
            	wb = new HSSFWorkbook(is);
            }else{
            	//当excel是2007时
                wb = new XSSFWorkbook(is);
            }
            //读取Excel里面学生作答信息
            offPaperscoreVo = readExcelValue(wb,search,offPaperscoreService);
            is.close();
            file1.delete();//删除临时文件
        }catch(Exception e){
        	e.printStackTrace();
        } finally{
        	if(is !=null){
        		try{
        			is.close();
        		}catch(IOException e){
        			is = null;    
        			e.printStackTrace();  
        		}
        	}
        }
        return offPaperscoreVo;
	}
    
    /**
	 * 
	 * @MethodName:getExcelInfo
	 * @Description:读EXCEL文件，获取学生作答信息集合
	 * @param Mfile
	 * @return
	 */
    public List<OffPaperConfBean> getPaperConfInfo(MultipartFile Mfile,String name,OffPaperConfSearch search){
    	//把spring文件上传的MultipartFile转换成CommonsMultipartFile类型
    	CommonsMultipartFile cf= (CommonsMultipartFile)Mfile; 
        //获取本地存储路径
        File file = new  File("D:\\fileupload");
        //创建一个目录 （它的路径名由当前 File 对象指定，包括任一必须的父路径。）
        if (!file.exists()) file.mkdirs();
        //新建一个文件
        File file1 = new File("D:\\fileupload\\" + new Date().getTime() + ".xls"); 
        //将上传的文件写入新建的文件中
        try {
        	cf.getFileItem().write(file1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //初始化学生作答信息
        List<OffPaperConfBean> offPaperConfList = new ArrayList<OffPaperConfBean>();
        //初始化输入流
        FileInputStream is = null;
        Workbook wb = null;
        try{
        	//根据新建的文件实例化输入流
            is = new FileInputStream(file1);
            if(isExcel2003(name)){
            	//当excel是2003时
            	wb = new HSSFWorkbook(is);
            }else{
            	//当excel是2007时
                wb = new XSSFWorkbook(is);
            }
            //读取Excel里面学生作答信息
            offPaperConfList = readPaperConfValue(wb,search);
            is.close();
            file1.delete();//删除临时文件
        }catch(Exception e){
        	e.printStackTrace();
        } finally{
        	if(is !=null){
        		try{
        			is.close();
        		}catch(IOException e){
        			is = null;    
        			e.printStackTrace();  
        		}
        	}
        }
        return offPaperConfList;
	}
    
    /**
     * 
     * @MethodName:readPaperConfValue
     * @Description:读取Excel里面试卷配置信息
     * @param wb
     * @return
     */
    private List<OffPaperConfBean> readPaperConfValue(Workbook wb,OffPaperConfSearch search){ 
    	//得到第一个shell  
    	Sheet sheet = wb.getSheetAt(0);
    	//得到Excel的行数
    	this.totalRows = sheet.getPhysicalNumberOfRows();
    	//得到Excel的列数(前提是有行数)
    	if(totalRows >= 1 && sheet.getRow(0) != null){//判断行数大于一，并且第一行必须有标题（这里有bug若文件第一行没值就完了）
    		this.totalCells=sheet.getRow(0).getPhysicalNumberOfCells();
    	}else{
    		return null;
    	}
    	List<OffPaperConfBean> offPaperConfList = new ArrayList<OffPaperConfBean>();
    	OffPaperConfBean OffPaperConfBean;
    	//循环Excel行数,从第二行开始。标题不入库
    	for(int r = 1; r < totalRows; r++){
    		Row row = sheet.getRow(r);
    		if (row == null) continue;
    		OffPaperConfBean = new OffPaperConfBean();
    		//循环Excel的列
    		for(int c = 0; c <this.totalCells; c++){ 
    			Cell cell = row.getCell(c);
    			if (null != cell){
    				if(c == 0){
    					//OffPaperConfBean.set(getValue(cell));//年级
    				}else if(c == 1){
    					OffPaperConfBean.setSubjectId(search.getSubjectId());//学科id
    					OffPaperConfBean.setSubjectName(search.getSubjectName());//学科名称
    				}else if(c == 2){
    					OffPaperConfBean.setQuestionId(getValue(cell));//题号
    				}else if(c == 3){
    					OffPaperConfBean.setPointName(getValue(cell));//知识模块
    					//OffPaperConfBean.setPointId(9l);
    					//循环比对知识模块集合 设置知识模块编码
    				}else if(c == 4){
    					OffPaperConfBean.setAbilityName(getValue(cell));//认知层次
    					//OffPaperConfBean.setAbilityId(9l);
    					//循环比对认知层次集合 设置认知层次编码
    				}else if(c == 5){
    					OffPaperConfBean.setTypeName(getValue(cell));//题型
    					//OffPaperConfBean.setTypeId(9L);//题型
    					//循环比对题型集合 设置题型编码
    				}else{
    					OffPaperConfBean.setFullScore(new Double(cell.getNumericCellValue()).longValue());//满分值
    				}
    			}
    		}
    		OffPaperConfBean.setExamId(search.getExamId());
			OffPaperConfBean.setExamDetailId(search.getExamDetailId());
    		//添加对象到集合中
    		offPaperConfList.add(OffPaperConfBean);
    	}
    	return offPaperConfList;
    }
    
    /**
     * 
     * @MethodName:readExcelValue
     * @Description:读取Excel里面考生的作答信息
     * @param wb
     * @return
     */
    private OffPaperscoreVo readExcelValue(Workbook wb,OffPaperscoreSearch search,OffPaperscoreService offPaperscoreService){ 
    	//得到第一个shell  
    	Sheet sheet = wb.getSheetAt(0);
    	//得到Excel的行数
    	this.totalRows = sheet.getPhysicalNumberOfRows();
    	//得到Excel的列数(前提是有行数)
    	if(totalRows >= 1 && sheet.getRow(0) != null){//判断行数大于一，并且第一行必须有标题（这里有bug若文件第一行没值就完了）
    		this.totalCells=sheet.getRow(0).getPhysicalNumberOfCells();
    	}else{
    		return null;
    	}
    	OffPaperscoreVo offPaperscoreVo = new OffPaperscoreVo();
    	List<OffPaperscoreBean> offPaperscoreBeanList = new ArrayList<OffPaperscoreBean>();
    	List<OffQuestionscoreBean> offQuestionscoreBeanList = new ArrayList<OffQuestionscoreBean>();
    	OffPaperscoreBean offPaperscoreBean;
    	OffQuestionscoreBean offQuestionscoreBean;
    	Map<String, Map<String,String>> areaMap = offPaperscoreService.queryOffPaperscoreBySearch(search);
    	//循环Excel行数,从第二行开始。标题不入库
    	for(int r = 1; r < totalRows; r++){
    		Row row = sheet.getRow(r);
    		if (row == null || row.getCell(0).getCellType() == Cell.CELL_TYPE_BLANK) continue;
    		offPaperscoreBean = new OffPaperscoreBean();
    		//循环Excel的列
    		for(int c = 0; c <this.totalCells; c++){ 
    			Cell cell = row.getCell(c);
    			if (null != cell){
    				if(c == 0){
    					offPaperscoreBean.setStudentId(getValue(cell));//学籍号
    					Map<String,String> cmap = areaMap.get(getValue(row.getCell(2))+getValue(row.getCell(3))+getValue(row.getCell(4)));
    					String cid = cmap.get("cid");
    					if(cid !="" && cid != null){
    						offPaperscoreBean.setDistrictId(Long.parseLong(cid.split("-")[0]));
    						offPaperscoreBean.setSchoolId(Long.parseLong(cid.split("-")[1]));
    						offPaperscoreBean.setClassId(Long.parseLong(cid.split("-")[2]));
    					}
    				}else if(c == 1){
    					//offPaperscoreBean.setStudentName(getValue(cell));//姓名
    				}else if(c == 2){
    					offPaperscoreBean.setDistrictName(getValue(cell));//所属区域
    					//offPaperscoreBean.setDistrictId(search.getDistrictId());
    				}else if(c == 3){
    					offPaperscoreBean.setSchoolName(getValue(cell));//学校
    					//offPaperscoreBean.setSchoolId(search.getSchoolId());
    				}else if(c == 4){
    					offPaperscoreBean.setClassName(getValue(cell));//班级
    					//offPaperscoreBean.setClassId(search.getClassId());
    				}else if(c == 5){
    					offPaperscoreBean.setFullScore(new Double(cell.getNumericCellValue()).longValue());//全卷得分
    				}else{
    					offQuestionscoreBean = new OffQuestionscoreBean();
    					offQuestionscoreBean.setStudentId(getValue(row.getCell(0)));//学籍号
    					offQuestionscoreBean.setExamId(search.getExamId());//考试编码
    					offQuestionscoreBean.setExamDetailId(search.getExamDetailId());//考试明细id
    					offQuestionscoreBean.setQuestionId(getValue(sheet.getRow(0).getCell(c)));//题号
    					offQuestionscoreBean.setScore(new Double(cell.getNumericCellValue()).longValue());//得分
    					offQuestionscoreBeanList.add(offQuestionscoreBean);//添加对象到集合中
    				}
    			}
    		}
    		offPaperscoreBean.setExamId(search.getExamId());//考试编码
    		offPaperscoreBean.setExamDetailId(search.getExamDetailId());
    		offPaperscoreBean.setSubjectId(search.getSubjectId());//学科编码
    		offPaperscoreBeanList.add(offPaperscoreBean);//添加对象到集合中
    	}
    	offPaperscoreVo.setOffPaperscoreBeanList(offPaperscoreBeanList);
    	offPaperscoreVo.setOffQuestionscoreBeanList(offQuestionscoreBeanList);
    	return offPaperscoreVo;
    }
  
    /**
     * 
     * @MethodName:getValue
     * @Description:得到Excel表中的值
     * @param cell Excel中的每一个格子
     * @return Excel中每一个格子中的值
     */
	@SuppressWarnings({ "static-access", "unused" })
	private String getValue(Cell cell) {
		if (cell.getCellType() == cell.CELL_TYPE_BOOLEAN) {
			// 返回布尔类型的值
			return String.valueOf(cell.getBooleanCellValue());
		} else if (cell.getCellType() == cell.CELL_TYPE_NUMERIC) {
			// 返回数值类型的值
			return String.valueOf(cell.getNumericCellValue());
		} else {
			// 返回字符串类型的值
			return String.valueOf(cell.getStringCellValue());
		}
	}
  
  	/**
  	 * 
  	 * @MethodName:isExcel2003
  	 * @Description:是否是2003的excel，返回true是2003
  	 * @param filePath
  	 * @return
  	 */
	public static boolean isExcel2003(String filePath)  {  
		return filePath.matches("^.+\\.(?i)(xls)$");  
	}  
       
  	/**
  	 * 
  	 * @MethodName:isExcel2007
  	 * @Description:是否是2007的excel，返回true是2007
  	 * @param filePath
  	 * @return
  	 */
	public static boolean isExcel2007(String filePath)  {  
		return filePath.matches("^.+\\.(?i)(xlsx)$");  
	}
    
	/**
	 * 
	 * @MethodName:validateExcel
	 * @Description:验证是否是EXCEL文件
	 * @param filePath
	 * @return
	 */
	public static boolean validateExcel(String filePath){
		if (filePath == null || !(isExcel2003(filePath) || isExcel2007(filePath))){  
			return false;  
		}  
		return true;
	}
	
	/**
	 * 
	 * @MethodName:processFileName
	 * @Description:解决设置名称时的乱码  
	 * @param request
	 * @param fileNames
	 * @return
	 */
    public static String processFileName(HttpServletRequest request, String fileNames) {  
        String codedfilename = null;  
        try {  
            String agent = request.getHeader("USER-AGENT");  
            if (null != agent && -1 != agent.indexOf("MSIE") || null != agent  
                    && -1 != agent.indexOf("Trident")) {// ie  
                String name = java.net.URLEncoder.encode(fileNames, "UTF8");  
                codedfilename = name;  
            } else if (null != agent && -1 != agent.indexOf("Mozilla")) {// 火狐,chrome等  
                codedfilename = new String(fileNames.getBytes("UTF-8"), "iso-8859-1");  
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return codedfilename;  
    } 
    
}