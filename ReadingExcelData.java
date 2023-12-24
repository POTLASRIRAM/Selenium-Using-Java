package day27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream file = new FileInputStream("D:\\Selenium with Java\\seleniumproject\\Exceldata\\Train.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int total_rows = sheet.getLastRowNum();
		int total_cells = sheet.getRow(0).getLastCellNum();
		System.out.println("Rows count : "+total_rows);
		System.out.println("Cells count : "+total_cells);
		for(int r=0;r<2;r++) {
			XSSFRow current_row = sheet.getRow(r);
			for(int c=0;c<total_cells;c++) {
				String value = current_row.getCell(c).toString();
				System.out.print(value+" ");
			}
			System.out.println();
		}

	}

}
