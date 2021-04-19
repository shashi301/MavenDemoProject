package seleniumPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNaukri {
    
    
@Test
public void TestError()
{
  
// Open browser     
	System.setProperty("webdriver.chrome.driver", "C:/Users/Shashikant/Desktop/Selenium drivers/chromedriver_win32/chromedriver.exe");
FirefoxDriver driver=new FirefoxDriver();
        
// maximize browser
driver.manage().window().maximize();
        
// Open URL
driver.get("http://www.naukri.com/");
        
// Click on login button
driver.findElement(By.id("p0submit")).click();
        
// This will capture error message
String actual_msg=driver.findElement(By.id("emailId_err")).getText();
    
// Store message in variable
String expect="plz enter valid email";
                
// Here Assert is a class and assertEquals is a method which will compare two values if// both matches it will run fine but in case if does not match then if will throw an 
//exception and fail testcases

// Verify error message
Assert.assertEquals(actual_msg, expect);

    }
}
