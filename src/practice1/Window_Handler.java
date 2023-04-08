package practice1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import java.util.ArrayList;


public class Window_Handler {
	public static void main(String args[])throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "C://Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("file:///C:/window%20handler/multiplewindows.html");
		Thread.sleep(4000);
		//get 2nd wind
		driver.findElement(By.id("btn2")).click();
		Thread.sleep(3000);
		//get 3rd wind
		driver.findElement(By.id("btn3")).click();
		Thread.sleep(3000);
		ArrayList<String> windinfo = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windinfo.get(0));
		driver.close();
		//driver.quit();
		
	}

}
