package practice1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import java.util.List;
import org.openqa.selenium.WebElement;


public class Assign_Alternative_checkbox {
public static void main(String args[])throws Exception{
	System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Thread.sleep(3000);
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	driver.switchTo().frame("rightMenu");
	List<WebElement> checkboxes = driver.findElements(By.name("chkLocID[]"));
	
	//loop through the check box
	for(int i = 0; i <checkboxes.size(); i++) {
		  if (i % 2 == 0 && i < 20) {
		        checkboxes.get(i).click();
		  }
	}

		  driver.switchTo().defaultContent();
		  driver.findElement(By.linkText("logout"));
}


}

