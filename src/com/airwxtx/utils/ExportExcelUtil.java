package com.airwxtx.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExportExcelUtil {

	private static void export(OutputStream out, Workbook wb, List<String[]> table) throws IOException {
		// create a new sheet
		Sheet s = wb.createSheet();
		// declare a row object reference
		Row r = null;
		// declare a cell object reference
		Cell c = null;
		// create 3 cell styles
		CellStyle headcs = wb.createCellStyle();
		CellStyle oddcs = wb.createCellStyle();
		CellStyle evencs = wb.createCellStyle();
		// create 3 fonts objects
		Font headf = wb.createFont();
		Font oddf = wb.createFont();
		Font evenf = wb.createFont();

		// set head font to 12 point type
		headf.setFontHeightInPoints((short) 12);
		// make it white
		headf.setColor(IndexedColors.WHITE.getIndex());
		// make it bold
		headf.setBold(true);

		// set odd font to 10 point type
		oddf.setFontHeightInPoints((short) 10);
		// make it black
		oddf.setColor(IndexedColors.BLACK.getIndex());

		// set odd font to 10 point type
		evenf.setFontHeightInPoints((short) 10);
		// make it black
		evenf.setColor(IndexedColors.WHITE.getIndex());

		// set the font
		headcs.setFont(headf);
		// set horizontal center
		headcs.setAlignment(HorizontalAlignment.CENTER);
		// set bg black
		headcs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		headcs.setFillForegroundColor(IndexedColors.GREY_80_PERCENT.getIndex());
		// set border
		headcs.setBorderRight(BorderStyle.THIN);
		headcs.setBorderBottom(BorderStyle.THIN);

		// set the font
		oddcs.setFont(oddf);
		// set bg white
		oddcs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		oddcs.setFillForegroundColor(IndexedColors.WHITE.getIndex());
		// set border
		oddcs.setBorderRight(BorderStyle.THIN);
		oddcs.setBorderBottom(BorderStyle.THIN);

		// set the font
		evencs.setFont(evenf);
		// set bg grey
		evencs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		evencs.setFillForegroundColor(IndexedColors.GREY_40_PERCENT.getIndex());
		// set border
		evencs.setBorderRight(BorderStyle.THIN);
		evencs.setBorderBottom(BorderStyle.THIN);

		for (int rownum = 0; rownum < table.size(); rownum++) {
			r = s.createRow(rownum);
			String[] row = table.get(rownum);
			for (int colnum = 0; colnum < row.length; colnum++) {
				c = r.createCell(colnum);
				if (rownum == 0) {
					c.setCellStyle(headcs);
				} else if ((rownum & 1) != 0) {
					c.setCellStyle(oddcs);
				} else {
					c.setCellStyle(evencs);
				}
				c.setCellValue(row[colnum]);
			}
		}

		// write the workbook to the output stream
		// close our file (don't blow out our file handles
		wb.write(out);
		out.close();
	}

	public static void xls(String file, List<String[]> table) throws IOException {
		// create a new HSSFWorkbook
		export(new FileOutputStream(file), new HSSFWorkbook(), table);
	}

	public static void xls(File file, List<String[]> table) throws IOException {
		// create a new HSSFWorkbook
		export(new FileOutputStream(file), new HSSFWorkbook(), table);
	}
	
	public static void xls(OutputStream out, List<String[]> table) throws IOException {
		// create a new HSSFWorkbook
		export(out, new XSSFWorkbook(), table);
	}

	public static void xlsx(String file, List<String[]> table) throws IOException {
		// create a new XSSFWorkbook
		export(new FileOutputStream(file), new XSSFWorkbook(), table);
	}

	public static void xlsx(File file, List<String[]> table) throws IOException {
		// create a new XSSFWorkbook
		export(new FileOutputStream(file), new XSSFWorkbook(), table);
	}

	public static void xlsx(OutputStream out, List<String[]> table) throws IOException {
		// create a new XSSFWorkbook
		export(out, new XSSFWorkbook(), table);
	}
}
