package seleniumPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class captureAlert {
   @Test
   public void alter() throws Exception
   {
	System.setProperty("webdriver.chrome.driver", "C:/Users/Shashikant/Desktop/Selenium drivers/chromedriver_win32/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
	Thread.sleep(3000);
	Assert.assertTrue(driver.findElement(By.xpath("//button[@onclick='myFunction()']")).isDisplayed());
	driver.findElement(By.xpath("/button[@onclick='myFunction()']")).click();
	String alt=driver.switchTo().alert().getText();
	driver.switchTo().alert().accept();
	System.out.println("stoared srting is "+alt);
	driver.quit();
   }
}
