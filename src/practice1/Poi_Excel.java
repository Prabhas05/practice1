package practice1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Poi_Excel {
	public static void main (String args[])throws Exception {
		FileInputStream file = new FileInputStream ("E:\\poi excel\\POI.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
	    XSSFSheet sheet = workbook.getSheet("Sheet1");
	    System.out.println(sheet.getSheetName());
	    System.out.println(sheet.getLastRowNum());
	System.out.println("Before updating Cell Data "+
	                                      sheet.getRow(2).getCell(1));
	 // Write the data to excel file
    XSSFCell cell =  sheet.getRow(2).getCell(1);
    cell.setCellValue("Test123");
    file.close();
    FileOutputStream fileOut = new FileOutputStream
    		("E:\\poi excel\\POI.xlsx");
    workbook.write(fileOut);
    System.out.println("Updated data after write is done " + cell.getStringCellValue());
    fileOut.close();
		
		
	}

}
