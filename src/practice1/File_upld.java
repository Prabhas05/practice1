package practice1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class File_upld {
	public static void main (String args[])throws Exception {
		System.setProperty("webdriver.gecko.driver","C:\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Thread.sleep(2000);
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//input[@value='Add']")).click();
driver.findElement(By.xpath("//input[@name='txtEmpLastName']")).sendKeys("selenium");
driver.findElement(By.xpath("//input[@id='txtEmpFirstName']")).sendKeys("nareshit tom");
// to upload a filr
WebElement fileinput =driver.findElement(By.xpath("//input[@type='file'][@id='photofile']"));
fileinput.sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Chrysanthemum.jpg");
Thread.sleep(4000);
System.out.println("photo uploaded successfully");
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Logout"));
driver.close();
		
		
	}

}
