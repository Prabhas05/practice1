package practice1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Google_links {
public static void main (String args[])throws Exception {
	System.setProperty("webdriver.gecko.driver","C://Drivers//geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com/");
	List<WebElement> links = driver.findElements(By.tagName("a"));
	for(WebElement lks:links) {
		System.out.println(lks.getText());
		Thread.sleep(3000);
	}
	driver.close();
}
}
