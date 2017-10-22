package com.sjq.exam.offline.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.sjq.exam.offline.bean.OfflineAnswerDataBean;
import com.sjq.exam.offline.bean.OfflineBasicDataBean;
import com.sjq.exam.offline.bean.OfflinePaperConfBean;
import com.sjq.exam.offline.search.OfflineDataSearch;
import com.sjq.exam.offline.vo.ExamOfflineDataVo;;

public class PoiExcelImport {
	//总行数
    private int totalRows = 0;  
    //总列数
    private int totalCells = 0; 
    //错误信息接收器
    private String errorMsg;
    //构造方法
    public PoiExcelImport(){}
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
    public ExamOfflineDataVo getExcelInfo(MultipartFile Mfile,String name,OfflineDataSearch search){
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
        ExamOfflineDataVo examOfflineDataVo = new ExamOfflineDataVo();
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
            examOfflineDataVo = readExcelValue(wb,search);
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
        return examOfflineDataVo;
	}
    
    /**
	 * 
	 * @MethodName:getExcelInfo
	 * @Description:读EXCEL文件，获取学生作答信息集合
	 * @param Mfile
	 * @return
	 */
    public List<OfflinePaperConfBean> getPaperConfInfo(MultipartFile Mfile,String name,OfflineDataSearch search){
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
        List<OfflinePaperConfBean> offlinePaperConfList = new ArrayList<OfflinePaperConfBean>();
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
            offlinePaperConfList = readPaperConfValue(wb,search);
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
        return offlinePaperConfList;
	}
    
    /**
     * 
     * @MethodName:readPaperConfValue
     * @Description:读取Excel里面试卷配置信息
     * @param wb
     * @return
     */
    private List<OfflinePaperConfBean> readPaperConfValue(Workbook wb,OfflineDataSearch search){ 
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
    	List<OfflinePaperConfBean> offlinePaperConfList = new ArrayList<OfflinePaperConfBean>();
    	
    	//知识模块集合
    	
    	//认知层次集合
    	
    	//题型集合
    	
    	OfflinePaperConfBean offlinePaperConfBean;
    	//循环Excel行数,从第二行开始。标题不入库
    	for(int r = 1; r < totalRows; r++){
    		Row row = sheet.getRow(r);
    		if (row == null) continue;
    		offlinePaperConfBean = new OfflinePaperConfBean();
    		//循环Excel的列
    		for(int c = 0; c <this.totalCells; c++){ 
    			Cell cell = row.getCell(c);
    			if (null != cell){
    				if(c == 0){
    					//offlinePaperConfBean.set(getValue(cell));//年级
    				}else if(c == 1){
    					offlinePaperConfBean.setSubjectName(getValue(cell));//学科
    					offlinePaperConfBean.setSubjectCode(search.getSubjectCode());//学科编码
    				}else if(c == 2){
    					offlinePaperConfBean.setQuestionNo(getValue(cell));//题号
    				}else if(c == 3){
    					offlinePaperConfBean.setPointName(getValue(cell));//知识模块
    					offlinePaperConfBean.setPointCode("99");
    					//循环比对知识模块集合 设置知识模块编码
    				}else if(c == 4){
    					offlinePaperConfBean.setAbilityName(getValue(cell));//认知层次
    					offlinePaperConfBean.setAbilityCode("99");
    					//循环比对认知层次集合 设置认知层次编码
    				}else if(c == 5){
    					offlinePaperConfBean.setTypeName(getValue(cell));//题型
    					offlinePaperConfBean.setTypeCode("99");//题型
    					//循环比对题型集合 设置题型编码
    				}else{
    					offlinePaperConfBean.setFullScore(getValue(cell));//满分值
    				}
    			}
    		}
    		offlinePaperConfBean.setExamCode(search.getExamCode());//考试编码
    		//添加对象到集合中
    		offlinePaperConfList.add(offlinePaperConfBean);
    	}
    	return offlinePaperConfList;
    }
    
    /**
     * 
     * @MethodName:readExcelValue
     * @Description:读取Excel里面考生的作答信息
     * @param wb
     * @return
     */
    private ExamOfflineDataVo readExcelValue(Workbook wb,OfflineDataSearch search){ 
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
    	ExamOfflineDataVo examOfflineDataVo = new ExamOfflineDataVo();
    	List<OfflineAnswerDataBean> offlineAnswerDataBeanList = new ArrayList<OfflineAnswerDataBean>();
    	List<OfflineBasicDataBean> offlineBasicDataBeanList = new ArrayList<OfflineBasicDataBean>();
    	examOfflineDataVo.setOfflineAnswerDataBeanList(offlineAnswerDataBeanList);
    	examOfflineDataVo.setOfflineBasicDataBeanList(offlineBasicDataBeanList);
    	OfflineAnswerDataBean offlineAnswerDataBean;
    	OfflineBasicDataBean offlineBasicDataBean;
    	//循环Excel行数,从第二行开始。标题不入库
    	for(int r = 1; r < totalRows; r++){
    		Row row = sheet.getRow(r);
    		if (row == null) continue;
    		offlineBasicDataBean = new OfflineBasicDataBean();
    		//循环Excel的列
    		for(int c = 0; c <this.totalCells; c++){ 
    			Cell cell = row.getCell(c);
    			if (null != cell){
    				if(c == 0){
    					offlineBasicDataBean.setStudentIdGz(getValue(cell));//学籍号
    				}else if(c == 1){
    					offlineBasicDataBean.setStudentName(getValue(cell));//姓名
    				}else if(c == 2){
    					offlineBasicDataBean.setDistrictName(getValue(cell));//所属区域
    					offlineBasicDataBean.setDistrictCode(search.getDistrictCode());
    				}else if(c == 3){
    					offlineBasicDataBean.setSchoolName(getValue(cell));//学校
    					offlineBasicDataBean.setSchoolCode(search.getSchoolCode());
    				}else if(c == 4){
    					offlineBasicDataBean.setClassName(getValue(cell));//班级
    					offlineBasicDataBean.setClassCode(search.getClassCode());
    				}else if(c == 5){
    					offlineBasicDataBean.setFullScore(getValue(cell));//全卷得分
    				}else{
    					offlineAnswerDataBean = new OfflineAnswerDataBean();
    					offlineAnswerDataBean.setStudentIdGz(getValue(row.getCell(0)));//学籍号
    					offlineAnswerDataBean.setExamCode(search.getExamCode());//考试编码
    					offlineAnswerDataBean.setSubjectCode(search.getSubjectCode());//学科编码
    					offlineAnswerDataBean.setQuestionNo(getValue(sheet.getRow(0).getCell(c)));//题号
    					offlineAnswerDataBean.setScore(getValue(cell));//得分
    					//添加对象到集合中
    		    		examOfflineDataVo.getOfflineAnswerDataBeanList().add(offlineAnswerDataBean);
    				}
    			}
    		}
    		offlineBasicDataBean.setExamCode(search.getExamCode());//考试编码
    		offlineBasicDataBean.setSubjectCode(search.getSubjectCode());//学科编码
    		offlineBasicDataBean.setSubjectName(search.getSubjectName());
    		//添加对象到集合中
    		examOfflineDataVo.getOfflineBasicDataBeanList().add(offlineBasicDataBean);
    	}
    	return examOfflineDataVo;
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