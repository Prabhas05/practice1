package practice1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Alert;


import org.openqa.selenium.By;


public class TC_Alert {
	public static void main (String args[]) throws Exception
	{
	System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	Alert a = driver.switchTo().alert();
	System.out.println(a.getText());
	a.accept();
	Thread.sleep(2000);
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	System.out.println("login complt");
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(2000);
	System.out.println("log out compltd");
	driver.close();

}
}
