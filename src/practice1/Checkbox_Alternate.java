package practice1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox_Alternate {
public static void main (String args[])throws Exception{
	System.setProperty("webdriver.gecko.driver", "C://Drivers//geckodriver.exe");
	WebDriver driver =new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Thread.sleep(3000);
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	driver.switchTo().frame("rightMenu");
	for(int i=1;i<=10;i=i+2)
	{
		 
			    driver.findElement(By.
			xpath("//*[@id='standardView']/table/tbody/tr["+i+"]/td[1]/input")).click();
			    System.out.println("Click on Checkbox of " + i);
	}
	driver.switchTo().defaultContent();
	driver.close();
}
}