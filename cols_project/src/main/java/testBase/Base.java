package testBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Base {
	
	public static Properties prop;
	public static WebDriver driver;
  public Base()
  {
	   prop=new Properties();
	   try {
		FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/config/config.properties");
		try {
			prop.load(ip);
		} catch (IOException e) {
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
			   
			   
  }
  public static void browserIntialzation()
  {
	 String browserName=prop.getProperty("browser");
	  System.out.println("browser="+browserName);
	  if (browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shashikant\\eclipse-workspace1\\cols_project\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
	 // driver=new ChromeDriver();
	}
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	  driver.get(prop.getProperty("url"));
  }
   
}
