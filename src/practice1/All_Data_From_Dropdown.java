package practice1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import java.util.ArrayList;
import java.util.List;

public class All_Data_From_Dropdown {
	public static void main (String args[])throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(4000);
		driver.switchTo().frame("rightMenu");
		//retrive all data from dropdown
		Select st = new Select(driver.findElement(By.name("loc_code")));
		List<WebElement>dropval = st.getOptions();
		for(WebElement val: dropval) {
			System.out.println(val.getText());
			Thread.sleep(3300);
		}
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
		}
		
		
		}
	

