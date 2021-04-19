package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import testUtils.Utils;

public class AdminPage extends Utils {

	@FindBy(xpath="//input[@id='searchSystemUser_userName']")
	WebElement userName;
	@FindBy(xpath="//select[@id='searchSystemUser_userType']")
	WebElement dropdown;
	@FindBy(xpath="//input[@id='searchSystemUser_employeeName_empName']")
    WebElement EmployeeName;
	@FindBy(xpath="//select[@id='searchSystemUser_status']")
	WebElement status;
	@FindBy(xpath="//input[@id='searchBtn']")
	WebElement search;
	
	public AdminPage()
	{
		PageFactory.initElements(driver,this);
	
	}
	public void systemUser(String uname,String uname123) throws InterruptedException
	{
	  Thread.sleep(2000);
	  userName.sendKeys(uname);
	  Select dropdown1 = new Select(dropdown); 
	    dropdown1.selectByIndex(1);  
	    EmployeeName.sendKeys(uname123);
	    Select status1 = new Select(status); 
	    status1.selectByIndex(1);
	    search.click();
	}
}
