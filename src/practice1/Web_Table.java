package practice1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class Web_Table {
	public static void main (String args[])throws Exception {
		System.setProperty("webdriver.gecko.driver", "C://Drivers//geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("file:///C:/web%20table/WebTable.html");
		//count
		
int row = driver.findElements
(By.xpath("//*[@id=\'idCourse\']/tbody/tr")).size();
int col= driver.findElements(By.xpath
		("//*[@id='idCourse']/tbody/td/tr[1]")).size();
int rowcol = driver.findElements
(By.xpath("//*[@id='idCourse']/tbody/tr/td")).size();
System.out.println("Row Count"+ row);
System.out.println("col count"+ col);
System.out.println("rowcol"+ rowcol);
Thread.sleep(3000);

Thread.sleep(3000);
// Data cell
String celldata = driver.findElement
(By.xpath("//*[@id='idCourse']/tbody/tr[2]/td[2]")).getText();
System.out.println(celldata);
//data table
for(int i =1 ;i<=row ;i++){
	String data = driver.findElement(By.xpath
			("//*[@id=\'idCourse\']/tbody/tr["+i+"]")).getText();
	System.out.println(data);
}
	
driver.close();
}

}
	





