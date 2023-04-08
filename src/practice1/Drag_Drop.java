package practice1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class Drag_Drop {
	public static void main (String args[])throws Exception {
		System.setProperty("webdriver.gecko.driver", "C://Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		//verify title if cond fail ; stop
		
assertEquals(driver.getTitle(), "Droppable | jQuery UI");
System.out.println("Title matched");
Thread.sleep(3000);
driver.switchTo().frame(0);
Actions ac = new Actions(driver);
ac.dragAndDrop(driver.findElement(By.id("draggable")),
driver.findElement(By.id("droppable"))).build().perform();
System.out.println("drag and drop");
Thread.sleep(3000);
driver.switchTo().defaultContent();
driver.close();

	
	}

}
