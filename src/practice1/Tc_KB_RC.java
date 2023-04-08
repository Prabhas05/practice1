package practice1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Tc_KB_RC {
	public static void main(String args[])throws Exception{
System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
Thread.sleep(3000);
//click ;keyboard 1:TAB 2:ENTER
Robot r = new Robot();
r.keyPress(KeyEvent.VK_TAB);
r.keyPress(KeyEvent.VK_ENTER);
System.out.println("enter");
Thread.sleep(3000);
driver.findElement(By.linkText("Logout")).click();
System.out.println("logout completed");
driver.close();

	
	}

}
