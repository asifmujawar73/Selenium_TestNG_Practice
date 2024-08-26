package day20;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\DataSheet.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Data");
		
		 // Create a CellStyle with center alignment
        XSSFCellStyle style = workbook.createCellStyle();
        style.setAlignment(HorizontalAlignment.CENTER);
		
		XSSFRow row1=sheet.createRow(0);
		row1.createCell(0).setCellValue("Java");
		row1.getCell(0).setCellStyle(style);
		row1.createCell(1).setCellValue(8.3);
		row1.createCell(2).setCellValue("Automation");
		
		XSSFRow row2=sheet.createRow(1);
		row2.createCell(0).setCellValue("Python");
		row2.getCell(0).setCellStyle(style);
		row2.createCell(1).setCellValue(3.4);
		row2.createCell(2).setCellValue("Automation");
		
		XSSFRow row3=sheet.createRow(2);
		row3.createCell(0).setCellValue("#C");
		row3.getCell(0).setCellStyle(style);
		row3.createCell(1).setCellValue(4.2);
		row3.createCell(2).setCellValue("Automation");
		
		System.out.println("done!");
		
		workbook.write(file);
		workbook.close();
		file.close();	
	}

}
