package practice1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class TC_DropDown {
	public static void main (String args[])throws Exception{
System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
System.out.println("login complted");
Thread.sleep(3000);
//enter to frame
driver.switchTo().frame("rightMenu");
//Empid from dropdown
Select st = new Select(driver.findElement(By.name("loc_code")));
//st.selectByVisibleText("Emp. ID");
//st.selectByIndex(1);
st.selectByValue("0");
Thread.sleep(3000);
driver.findElement(By.name("loc_name")).sendKeys("4440");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@value='Search']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@name='chkLocID[]']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@value='Delete']")).click();
System.out.println("deleted successfully");
Thread.sleep(3000);
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Logout")).click();
Thread.sleep(3000);
driver.close();


	}

}
