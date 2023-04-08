package practice1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
public class Tc_KB_WD {
	public static void main (String args[]) throws Exception {
System.setProperty("webdriver.gecko.driver","C:\\Drivers\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.navigate().to("http://www.google.com");
Thread.sleep(3000);
driver.findElement(By.name("q")).sendKeys("software testing");
Thread.sleep(4000);
driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
Thread.sleep(3000);
driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
Thread.sleep(2000);
driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
Thread.sleep(3000);
driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
Thread.sleep(4000);
driver.close();
		
}
}