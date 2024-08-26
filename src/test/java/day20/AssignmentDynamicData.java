package day20;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AssignmentDynamicData {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\assingmentDynamicData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("Data");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many rows you want: \n");
		int noOfRows=sc.nextInt();
		
		System.out.println("Enter how many columns you want: \n");
		int noOfCells=sc.nextInt();
				
		for(int r=0;r<=noOfRows;r++) {
			XSSFRow CurrentRows=sheet.createRow(r);	
		
		for(int c=0;c<noOfCells;c++) {
			XSSFCell cell=CurrentRows.createCell(c);
			cell.setCellValue(sc.next());
		}
		}
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("Done Buddy!");
	}

}
