package seleniumPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarHandling {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Shashikant/Desktop/Selenium drivers/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
					
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement ele:allDates)
		{
			
			String date=ele.getText();
			
			if(date.equalsIgnoreCase("28"))
			{
				ele.click();
				break;
			}
			
		}
		
		
	}

}