package day27;

import java.io.FileOutputStream;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcelData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FileOutputStream file = new FileOutputStream("D:\\Selenium with Java\\seleniumproject\\Exceldata\\WritingData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet();
		for(int r = 0;r<=2;r++) {
			XSSFRow row = sheet.createRow(r);
			for(int c=0;c<2;c++) {
				System.out.println("Enter cell value : ");
				String value = sc.next();
				XSSFCell cell = row.createCell(c);
				cell.setCellValue(value);
			}
		}
		workbook.write(file);
		workbook.close();
		

	}

}
