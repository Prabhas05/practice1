package practice1;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;


public class Exp_Excel {
public static void main (String args[]) throws Exception{
	FileInputStream file = new FileInputStream ("E:\\excel\\naresh_excel.xls");
	Workbook wb = Workbook.getWorkbook(file);
	Sheet st = wb.getSheet(0);
	int row =2 ;
   String Name = st.getCell(0,row).getContents();
	String email = st.getCell(1,row).getContents();
	String phone = st.getCell(2,row).getContents();
	System.out.println(Name +"||"+ email +"||"+ phone);
}

}
