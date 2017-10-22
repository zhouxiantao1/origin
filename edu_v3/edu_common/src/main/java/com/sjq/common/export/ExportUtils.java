package com.sjq.common.export;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/**
 *
 * @author SJQ-ZeJie Zheng
 * @since 2017年5月3日下午1:46:30
 * @version 1.0
 */
public class ExportUtils {

	/**
	 * @param workBook
	 * @param out
	 * @throws IOException
	 */
	public static void exportHSSFWorkExcel(HSSFWorkbook workBook, OutputStream out) throws IOException {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		try {
			// 將創建工作簿写入數據流
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			workBook.write(byteArrayOutputStream);

			// 從數組流取出數據
			byte[] content = byteArrayOutputStream.toByteArray();
			ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(content);

			// 將數據讀入緩存區
			bis = new BufferedInputStream(byteArrayInputStream);
			bos = new BufferedOutputStream(out);

			// 緩存區大小
			byte[] buff = new byte[1024];
			int bytesRead;

			// Simple read/write loop.
			while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
				// 先寫緩存區
				bos.write(buff, 0, bytesRead);
			}

		} catch (IOException e) {
			throw e;
		} finally {
			if (bis != null) {
				bis.close();
			}
			if (bos != null) {
				bos.close();
			}
		}
	}
	
	
	/**
	 * @param workBook
	 * @param out
	 * @throws IOException
	 */
	public static void exportXSSFWorkExcel(XSSFWorkbook workBook, OutputStream out) throws IOException {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		try {
			// 將創建工作簿写入數據流
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			workBook.write(byteArrayOutputStream);

			// 從數組流取出數據
			byte[] content = byteArrayOutputStream.toByteArray();
			ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(content);

			// 將數據讀入緩存區
			bis = new BufferedInputStream(byteArrayInputStream);
			bos = new BufferedOutputStream(out);

			// 緩存區大小
			byte[] buff = new byte[1024];
			int bytesRead;

			// Simple read/write loop.
			while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
				// 先寫緩存區
				bos.write(buff, 0, bytesRead);
			}

		} catch (IOException e) {
			throw e;
		} finally {
			if (bis != null) {
				bis.close();
			}
			if (bos != null) {
				bos.close();
			}
		}
	}

	/**
	 * 合并单元格
	 * @param workSheet
	 * @param startRow
	 * @param endRow
	 * @param startCol
	 * @param endCol
	 */
	public static void mergeReign(HSSFSheet workSheet, int startRow, int endRow, int startCol, int endCol) {
		CellRangeAddress region = new CellRangeAddress(startRow, endRow, startCol, endCol);
		workSheet.addMergedRegion(region);
	}

	/**
	 * 设置行高
	 * @param row
	 * @param point
	 */
	public static void setRowHeight(Row row, float point) {
		row.setHeightInPoints(point);
	}

	/**
	 * 生成自动换行单元格样式
	 * @param workBook
	 * @return
	 */
	public static HSSFCellStyle genWrapTextStyle(HSSFWorkbook workBook) {
		HSSFCellStyle wrapTextStyle = workBook.createCellStyle();
		wrapTextStyle.setWrapText(true);
		return wrapTextStyle;
	}

	/**
	 * 生成对齐方式单元格样式
	 * @param workBook
	 * @param alignment
	 * @param verticalAlignment
	 * @return
	 */
	public static HSSFCellStyle genAlignmentStyle(HSSFWorkbook workBook, short alignment, short verticalAlignment) {
		// 创建单元格样式对象
		HSSFCellStyle alignStyle = workBook.createCellStyle();
		// 设置单元格内容水平对其方式
		// XSSFCellStyle.ALIGN_CENTER 居中对齐
		// XSSFCellStyle.ALIGN_LEFT 左对齐
		// XSSFCellStyle.ALIGN_RIGHT 右对齐
		alignStyle.setAlignment(alignment);
		// 设置单元格内容垂直对其方式
		// XSSFCellStyle.VERTICAL_TOP 上对齐
		// XSSFCellStyle.VERTICAL_CENTER 中对齐
		// XSSFCellStyle.VERTICAL_BOTTOM 下对齐
		alignStyle.setVerticalAlignment(verticalAlignment);
		return alignStyle;
	}

	/**
	 * 生成特定字体单元格样式
	 * @param workBook
	 * @return
	 */
	public static HSSFCellStyle genSumTitleFontStyle(HSSFWorkbook workBook) {
		HSSFCellStyle sumTitleStyle = workBook.createCellStyle();
		Font font = workBook.createFont();
		// font.setItalic(true); // 设置字体为斜体字
		font.setBoldweight(Font.BOLDWEIGHT_BOLD);
		font.setColor(Font.COLOR_NORMAL); // 将字体设置为“红色”
		font.setFontHeightInPoints((short) 18); // 将字体大小设置为18px
		font.setFontName("华文行楷"); // 将“华文行楷”字体应用到当前单元格上
		// font.setUnderline(Font.U_DOUBLE); // 添加（Font.U_SINGLE单条下划线/Font.U_DOUBLE双条下划线）
		sumTitleStyle.setFont(font);
		sumTitleStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		return sumTitleStyle;
	}

	/**
	 * 生成特定字体单元格样式
	 * @param workBook
	 * @return
	 */
	public static HSSFCellStyle genSuccessFontStyle(HSSFWorkbook workBook) {
		HSSFCellStyle sumTitleStyle = workBook.createCellStyle();
		Font font = workBook.createFont();
		font.setItalic(true); // 设置字体为斜体字
		font.setBoldweight(Font.BOLDWEIGHT_BOLD);
		font.setColor(Font.COLOR_NORMAL); // 将字体设置为“红色”
		// font.setFontHeightInPoints((short) 18); // 将字体大小设置为18px
		font.setFontName("华文行楷"); // 将“华文行楷”字体应用到当前单元格上
		// font.setUnderline(Font.U_DOUBLE); // 添加（Font.U_SINGLE单条下划线/Font.U_DOUBLE双条下划线）
		font.setUnderline(Font.U_SINGLE);
		sumTitleStyle.setFont(font);
		sumTitleStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		return sumTitleStyle;
	}

	/**
	 * 生成特定字体单元格样式
	 * @param workBook
	 * @return
	 */
	public static HSSFCellStyle genFailedFontStyle(HSSFWorkbook workBook) {
		HSSFCellStyle sumTitleStyle = workBook.createCellStyle();
		Font font = workBook.createFont();
		font.setItalic(true); // 设置字体为斜体字
		font.setBoldweight(Font.BOLDWEIGHT_BOLD);
		font.setColor(Font.COLOR_RED); // 将字体设置为“红色”
		// font.setFontHeightInPoints((short) 18); // 将字体大小设置为18px
		font.setFontName("华文行楷"); // 将“华文行楷”字体应用到当前单元格上
		font.setUnderline(Font.U_SINGLE);
		// font.setUnderline(Font.U_DOUBLE); // 添加（Font.U_SINGLE单条下划线/Font.U_DOUBLE双条下划线）
		sumTitleStyle.setFont(font);
		sumTitleStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);

		return sumTitleStyle;
	}
	
	/**
	 * 生成特定字体单元格样式
	 * @param workBook
	 * @return
	 */
	public static XSSFCellStyle genSuccessFontStyle(XSSFWorkbook workBook) {
		XSSFCellStyle sumTitleStyle = workBook.createCellStyle();
		Font font = workBook.createFont();
		font.setItalic(true); // 设置字体为斜体字
		font.setBoldweight(Font.BOLDWEIGHT_BOLD);
		font.setColor(Font.COLOR_NORMAL); // 将字体设置为“红色”
		// font.setFontHeightInPoints((short) 18); // 将字体大小设置为18px
		font.setFontName("华文行楷"); // 将“华文行楷”字体应用到当前单元格上
		// font.setUnderline(Font.U_DOUBLE); // 添加（Font.U_SINGLE单条下划线/Font.U_DOUBLE双条下划线）
		font.setUnderline(Font.U_SINGLE);
		sumTitleStyle.setFont(font);
		sumTitleStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);
		return sumTitleStyle;
	}

	/**
	 * 生成特定字体单元格样式
	 * @param workBook
	 * @return
	 */
	public static XSSFCellStyle genFailedFontStyle(XSSFWorkbook workBook) {
		XSSFCellStyle sumTitleStyle = workBook.createCellStyle();
		Font font = workBook.createFont();
		font.setItalic(true); // 设置字体为斜体字
		font.setBoldweight(Font.BOLDWEIGHT_BOLD);
		font.setColor(Font.COLOR_RED); // 将字体设置为“红色”
		// font.setFontHeightInPoints((short) 18); // 将字体大小设置为18px
		font.setFontName("华文行楷"); // 将“华文行楷”字体应用到当前单元格上
		font.setUnderline(Font.U_SINGLE);
		// font.setUnderline(Font.U_DOUBLE); // 添加（Font.U_SINGLE单条下划线/Font.U_DOUBLE双条下划线）
		sumTitleStyle.setFont(font);
		sumTitleStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);

		return sumTitleStyle;
	}

	/**
	 * 自动调整列宽
	 * @param workSheet
	 * @param startColumn
	 * @param endColumn
	 */
	public static void autoSizeColumn(HSSFSheet workSheet, int startColumn, int endColumn) {
		for (int i = startColumn; i < endColumn; i++) {
			workSheet.autoSizeColumn(i, true);
		}
	}
	
	/**
	 * 自动调整列宽
	 * @param workSheet
	 * @param startColumn
	 * @param endColumn
	 */
	public static void autoSizeColumn(XSSFSheet workSheet, int startColumn, int endColumn) {
		for (int i = startColumn; i < endColumn; i++) {
			workSheet.autoSizeColumn(i, true);
		}
	}

}
