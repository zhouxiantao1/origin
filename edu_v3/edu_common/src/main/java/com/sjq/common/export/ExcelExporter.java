package com.sjq.common.export;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.Region;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.aop.ThrowsAdvice;



/**
 * 
 * POI導出
 * @author SJQ-ZeJie Zheng
 * @since 2017年5月3日下午1:45:52
 * @version 1.0
 */
public class ExcelExporter<T> {
	// private final String rnumbererId = "numberer";
	private final String fileType = "XLSX";

	private HttpServletResponse response;
	private HttpServletRequest request;
	private List<T> list;
	private List<ColumnConfig> columnConfigs;
	

	/**
	 * @param response
	 * @param request
	 * @param list
	 * @param columnConfigs
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * @throws NoSuchMethodException
	 */
	public ExcelExporter(HttpServletResponse response, HttpServletRequest request, List<T> list,
			List<ColumnConfig> columnConfigs) throws IllegalAccessException, InvocationTargetException,
			NoSuchMethodException {
		this.response = response;
		this.request = request;

		this.list = list;
		this.columnConfigs = columnConfigs;
	}
	

	public ExcelExporter(){}

	/**
	 * 导出
	 * @param fileName  文件名称
	 * @param fileType  文件类型（xls,xlsx)
	 * @throws IOException 
	 * @throws NoSuchMethodException 
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 */
	public void export(String fileName,String fileType) throws IOException, IllegalAccessException, InvocationTargetException, NoSuchMethodException{
		
		// 清空输出流
		response.reset();
		response.setContentType("application/vnd.ms-excel");
		// 打开文件下载框
		response.setHeader("Content-Disposition", "attachment;filename=\"" + new String(fileName.getBytes("GB2312"), "ISO_8859_1") +"."+ fileType + "\"");
		OutputStream out = response.getOutputStream();
		
		if(fileType.equals("xls")){
			
			HSSFWorkbook workbook = createHSSFWorkExcelFile();

			ExportUtils.exportHSSFWorkExcel(workbook, out);
			
		}else if(fileType.equals("xlsx")){
			
			XSSFWorkbook workbook = createXSSFWorkExcelFile();

			ExportUtils.exportXSSFWorkExcel(workbook, out);
		}
		
		out.close();
		
	}

	/**
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * @throws NoSuchMethodException
	 * @throws IOException
	 */
	public void export() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException, IOException {
		if (fileType.equals("XLSX")/* EXCEL */) {
			String fileName = "file.xlsx";
			// 清空输出流
			response.reset();
			response.setContentType("application/vnd.ms-excel");
			// 打开文件下载框
			response.setHeader("Content-Disposition", "attachment;filename=\"" + fileName + "\"");

			OutputStream out = response.getOutputStream();

			XSSFWorkbook workbook = createXSSFWorkExcelFile();

			ExportUtils.exportXSSFWorkExcel(workbook, out);
			out.close();
		}
	}
	
	/**
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * @throws NoSuchMethodException
	 * @throws IOException
	 */
	public void export(List<List<ColumnConfig>> mutilpartColumns) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException, IOException {
		if (fileType.equals("XLSX")/* EXCEL */) {
			String fileName = "file.xlsx";
			// 清空输出流
			response.reset();
			response.setContentType("application/vnd.ms-excel");
			// 打开文件下载框
			response.setHeader("Content-Disposition", "attachment;filename=\"" + fileName + "\"");

			OutputStream out = response.getOutputStream();

			HSSFWorkbook workbook = createHSSFWorkExcelFile(mutilpartColumns);

			ExportUtils.exportHSSFWorkExcel(workbook, out);
			out.close();
		}
	}
	
	/**
	 * (重写，让其适应复杂列头)創建工作簿，並將工作簿寫入輸出流
	 * 
	 * @param list
	 * @param columnConfigs
	 * @return
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * @throws NoSuchMethodException
	 */
	private HSSFWorkbook createHSSFWorkExcelFile(List<List<ColumnConfig>> mutilpartColumns) throws IllegalAccessException, InvocationTargetException,
			NoSuchMethodException {
		// 工作簿
		HSSFWorkbook workBook = null;
		// 工作表
		HSSFSheet workSheet = null;
		// 單元格式樣
		HSSFCellStyle numberStyle = null;
		HSSFCellStyle stringStyle = null;

		workBook = new HSSFWorkbook();

		numberStyle = workBook.createCellStyle();
		numberStyle.setAlignment(HSSFCellStyle.ALIGN_RIGHT);

		stringStyle = workBook.createCellStyle();
		stringStyle.setAlignment(HSSFCellStyle.ALIGN_LEFT);

		workSheet = workBook.createSheet();
		
		HSSFCellStyle style = workBook.createCellStyle(); // 样式对象      
	     
        style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// 垂直      
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);// 水平      

		// 行數
		int rowCount = list.size();
		// 列數
		int columnCount = columnConfigs.size();

		// 工作表的最後行(0基準)
		// http://topic.csdn.net/t/20061220/17/5244670.html
		int lastRowNum = workSheet.getLastRowNum();

		// 填充列標題
//		if (lastRowNum == 0) {
			// 創建列標題行
			
			int rowNumber = 0;
			for(List<ColumnConfig> columns:mutilpartColumns){
				HSSFRow headHr = workSheet.createRow(rowNumber);
				int col = 0;
				for (ColumnConfig columnConfig : columns) {
					// 第一行填充列標題
					//if (lastRowNum == 0) {
						System.out.println("columnName........" + columnConfig.getName());

						String columnName = String.valueOf(columnConfig.getName());
						// columnName = columnName.equals(rnumbererId) ? "#" : columnName;
						if(columnConfig.getColspan()!=null){
							Region region = new Region(rowNumber,(short)col,rowNumber,(short)(col+columnConfig.getColspan()-1));
							System.err.println(rowNumber+","+(short)col+","+rowNumber+","+(short)(col+columnConfig.getColspan()-1));
							
							System.err.println(col);
							workSheet.addMergedRegion(region);
							//2  11  20 
							HSSFCell hc = headHr.createCell(col);
							hc.setCellStyle(style);
							hc.setCellValue(new HSSFRichTextString(columnName));
							col = col+columnConfig.getColspan()-1;
						}else{
							HSSFCell hc = headHr.createCell(col);
							hc.setCellStyle(style);
							hc.setCellValue(new HSSFRichTextString(columnName));
						}
						
						
					//}

					col++;
				}
				rowNumber++;
			}
			
			
//		}

		int insertRow = lastRowNum + (mutilpartColumns.size());

		// 遍歷數據集
		int row = 0;
		
		for (T model : list) {
			// 創建行
			HSSFRow dataHr = workSheet.createRow(insertRow);

			// 遍歷列
			int col = 0;
			for (ColumnConfig columnConfig : columnConfigs) {
				// 列值
				Object value = null;
				Class valueClass = null;

				// if (columnConfig.getCode().equals(rnumbererId)) {
				// value = row + 1;
				// valueClass = java.lang.Integer.class;
				// } else {
				value = PropertyUtils.getSimpleProperty(model, columnConfig.getCode());
				valueClass = PropertyUtils.getPropertyType(model, columnConfig.getCode());

				// System.out.println("value........" + value);
				// System.out.println("valueClass........" + valueClass);

				// }

				// 創建列
				HSSFCell hc = dataHr.createCell(col);

				// 根據不同數據類型定義式樣
				if (valueClass == String.class || valueClass == Boolean.class) {
					String stringValue = "";
					if (value == null) {
					} else {
						stringValue = String.valueOf(value);
					}

					hc.setCellType(HSSFCell.CELL_TYPE_STRING);
					hc.setCellStyle(stringStyle);

					hc.setCellValue(new HSSFRichTextString(stringValue));
				} else if (valueClass == Date.class) {
					String dateValue = "";
					if (value == null) {
					} else {
						dateValue = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(value);
					}

					hc.setCellType(HSSFCell.CELL_TYPE_STRING);
					hc.setCellStyle(stringStyle);

					hc.setCellValue(new HSSFRichTextString(dateValue));

				} else {
					BigDecimal decimalValue = new BigDecimal("0");

					if (value == null) {
					} else {
						decimalValue = new BigDecimal(String.valueOf(value));
					}

					hc.setCellType(HSSFCell.CELL_TYPE_NUMERIC);
					hc.setCellStyle(numberStyle);

					hc.setCellValue(decimalValue.doubleValue());
				}

				col++;
			}
			row++;

			insertRow++;
		}

		return workBook;
	}

	/**
	 * 創建工作簿，並將工作簿寫入輸出流
	 * 
	 * @param list
	 * @param columnConfigs
	 * @return
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * @throws NoSuchMethodException
	 */
	private HSSFWorkbook createHSSFWorkExcelFile() throws IllegalAccessException, InvocationTargetException,
			NoSuchMethodException {
		// 工作簿
		HSSFWorkbook workBook = null;
		// 工作表
		HSSFSheet workSheet = null;
		// 單元格式樣
		HSSFCellStyle numberStyle = null;
		HSSFCellStyle stringStyle = null;

		workBook = new HSSFWorkbook();

		numberStyle = workBook.createCellStyle();
		numberStyle.setAlignment(HSSFCellStyle.ALIGN_RIGHT);

		stringStyle = workBook.createCellStyle();
		stringStyle.setAlignment(HSSFCellStyle.ALIGN_LEFT);

		workSheet = workBook.createSheet();

		// 行數
		int rowCount = list.size();
		// 列數
		int columnCount = columnConfigs.size();

		// 工作表的最後行(0基準)
		// http://topic.csdn.net/t/20061220/17/5244670.html
		int lastRowNum = workSheet.getLastRowNum();

		// 填充列標題
		if (lastRowNum == 0) {
			// 創建列標題行
			HSSFRow headHr = workSheet.createRow(lastRowNum);

			int col = 0;
			for (ColumnConfig columnConfig : columnConfigs) {
				// 第一行填充列標題
				if (lastRowNum == 0) {
					// System.out.println("columnName........" + columnConfig.getName());

					String columnName = String.valueOf(columnConfig.getName());
					// columnName = columnName.equals(rnumbererId) ? "#" : columnName;

					HSSFCell hc = headHr.createCell(col);
					hc.setCellValue(new HSSFRichTextString(columnName));
				}

				col++;
			}
		}

		int insertRow = lastRowNum + 1;

		// 遍歷數據集
		int row = 0;
		for (T model : list) {
			// 創建行
			HSSFRow dataHr = workSheet.createRow(insertRow);

			// 遍歷列
			int col = 0;
			for (ColumnConfig columnConfig : columnConfigs) {
				// 列值
				Object value = null;
				Class valueClass = null;

				// if (columnConfig.getCode().equals(rnumbererId)) {
				// value = row + 1;
				// valueClass = java.lang.Integer.class;
				// } else {
				value = PropertyUtils.getSimpleProperty(model, columnConfig.getCode());
				valueClass = PropertyUtils.getPropertyType(model, columnConfig.getCode());

				// System.out.println("value........" + value);
				// System.out.println("valueClass........" + valueClass);

				// }

				// 創建列
				HSSFCell hc = dataHr.createCell(col);

				// 根據不同數據類型定義式樣
				if (valueClass == String.class || valueClass == Boolean.class) {
					String stringValue = "";
					if (value == null) {
					} else {
						stringValue = String.valueOf(value);
					}

					hc.setCellType(HSSFCell.CELL_TYPE_STRING);
					hc.setCellStyle(stringStyle);

					hc.setCellValue(new HSSFRichTextString(stringValue));
				} else if (valueClass == Date.class) {
					String dateValue = "";
					if (value == null) {
					} else {
						dateValue = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(value);
					}

					hc.setCellType(HSSFCell.CELL_TYPE_STRING);
					hc.setCellStyle(stringStyle);

					hc.setCellValue(new HSSFRichTextString(dateValue));

				} else {
					BigDecimal decimalValue = new BigDecimal("0");

					if (value == null) {
					} else {
						decimalValue = new BigDecimal(String.valueOf(value));
					}

					hc.setCellType(HSSFCell.CELL_TYPE_NUMERIC);
					hc.setCellStyle(numberStyle);

					hc.setCellValue(decimalValue.doubleValue());
				}

				col++;
			}
			row++;

			insertRow++;
		}

		return workBook;
	}
	
	
	
	/**
	 * 創建工作簿，並將工作簿寫入輸出流
	 * 
	 * @param list
	 * @param columnConfigs
	 * @return
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * @throws NoSuchMethodException
	 */
	private XSSFWorkbook createXSSFWorkExcelFile() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException{
		// 工作簿
		XSSFWorkbook workBook = null;
		// 工作表
		XSSFSheet workSheet = null;
		// 單元格式樣
		XSSFCellStyle numberStyle = null;
		XSSFCellStyle stringStyle = null;
		XSSFCellStyle headStyle = null;

		workBook = new XSSFWorkbook();
		
		Font font = workBook.createFont();
		font.setFontHeightInPoints((short) 10); // 将字体大小设置为18px
		font.setFontName("宋体"); // 将“华文行楷”字体应用到当前单元格上
		
		numberStyle = workBook.createCellStyle();
		numberStyle.setAlignment(XSSFCellStyle.ALIGN_GENERAL);
		numberStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
		numberStyle.setFont(font);
		
		stringStyle = workBook.createCellStyle();
		stringStyle.setAlignment(XSSFCellStyle.ALIGN_GENERAL);
		stringStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
		stringStyle.setFont(font);
		
		headStyle = workBook.createCellStyle();
		headStyle.setAlignment(XSSFCellStyle.ALIGN_GENERAL);
		headStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
		headStyle.setFont(font);
		

		workSheet = workBook.createSheet();

		// 行數
		int rowCount = list.size();
		// 列數
		int columnCount = columnConfigs.size();

		// 工作表的最後行(0基準)
		// http://topic.csdn.net/t/20061220/17/5244670.html
		int lastRowNum = workSheet.getLastRowNum();

		// 填充列標題
		if (lastRowNum == 0) {
			// 創建列標題行
			XSSFRow headHr = workSheet.createRow(lastRowNum);
			ExportUtils.setRowHeight(headHr, 25);

			int col = 0;
			for (ColumnConfig columnConfig : columnConfigs) {
				// 第一行填充列標題
				if (lastRowNum == 0) {

					String columnName = String.valueOf(columnConfig.getName());

					XSSFCell hc = headHr.createCell(col);
					hc.setCellValue(new XSSFRichTextString(columnName));
					hc.setCellStyle(headStyle);
					
				}

				col++;
			}
		}

		int insertRow = lastRowNum + 1;

		// 遍歷數據集
		int row = 0;
		for (T model : list) {
			// 創建行
			XSSFRow dataHr = workSheet.createRow(insertRow);
			ExportUtils.setRowHeight(dataHr, 25);

			// 遍歷列
			int col = 0;
			for (ColumnConfig columnConfig : columnConfigs) {
				// 列值
				Object value = null;
				Class valueClass = null;

				value = PropertyUtils.getSimpleProperty(model, columnConfig.getCode());
				valueClass = PropertyUtils.getPropertyType(model, columnConfig.getCode());

				// 創建列
				XSSFCell hc = dataHr.createCell(col);

				// 根據不同數據類型定義式樣
				if (valueClass == String.class || valueClass == Boolean.class) {
					String stringValue = "";
					if (value == null) {
					} else {
						stringValue = String.valueOf(value);
					}

					hc.setCellType(XSSFCell.CELL_TYPE_STRING);
					hc.setCellStyle(stringStyle);

					hc.setCellValue(new XSSFRichTextString(stringValue));
				} else if (valueClass == Date.class) {
					String dateValue = "";
					if (value == null) {
					} else {
						dateValue = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(value);
					}

					hc.setCellType(XSSFCell.CELL_TYPE_STRING);
					hc.setCellStyle(stringStyle);

					hc.setCellValue(new XSSFRichTextString(dateValue));

				} else {
					BigDecimal decimalValue = new BigDecimal("0");

					if (value == null) {
					} else {
						decimalValue = new BigDecimal(String.valueOf(value));
					}

					hc.setCellType(XSSFCell.CELL_TYPE_NUMERIC);
					hc.setCellStyle(numberStyle);

					hc.setCellValue(decimalValue.doubleValue());
				}

				col++;
			}
			row++;

			insertRow++;
		}
		
		

		return workBook;
	}
	

	public static void main(String[] args) throws IOException {      
		
		FileInputStream file = new FileInputStream(new File("d:\\ems.xls"));
		try {
			//POIFSFileSystem ps = new POIFSFileSystem(file);
			Workbook wb = new HSSFWorkbook(file);
			Sheet sheet =  wb.getSheetAt(0);
			
			
			int lastRowNum = sheet.getLastRowNum();
			
			String[] datas = new String[lastRowNum];
			System.out.println(lastRowNum);
			for(int i=1;i<=lastRowNum;i++){
				Row row = sheet.getRow(i);
				Cell cell = row.getCell(0);
				cell.setCellType(Cell.CELL_TYPE_STRING);
				String data = cell.getStringCellValue();
				datas[i-1] = data;
			}
		
			for(String str:datas){
				System.out.println(str);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
    }      
	
}
