package practice1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class JSE_new {
	public static void main (String args[])throws Exception {
System.setProperty("driver.gecko.driver","C://Drivers//geckodriver.exe");
WebDriver driver = new FirefoxDriver();
//test steps
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
System.out.println(driver.getTitle());
driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("nareshit");
driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("nareshit");
// using java script executor to login into application
WebElement loginbtn = driver.findElement(By.name("Submit"));
JavascriptExecutor executor = (JavascriptExecutor)driver;
executor.executeScript("arguments [0].click()", loginbtn);
Thread.sleep(3000);
//using java script to execute logout

WebElement logoutbtn =driver.findElement(By.linkText("Logout"));
JavascriptExecutor executor1 = (JavascriptExecutor)driver;
executor1 .executeScript("arguments [0].click()", logoutbtn);




	}

}
