package seleniumPackage;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

public class logIn {
	@Test
	 public void amozonLogIn() throws Exception
	 {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Shashikant/Desktop/Selenium drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fsign%2Fs%3Fk%3Dsign%2Bin%26ref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		Thread.sleep(4000);
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='ap_email']")).isDisplayed());
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("9403566882");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("ganu@1309");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		try
		{
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='ap_email']")).isDisplayed());
		}
		catch(Exception e)
		{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:\\Users\\Shashikant\\Desktop\\Selenium drivers\\erro.png"));
		}
	 }

}
