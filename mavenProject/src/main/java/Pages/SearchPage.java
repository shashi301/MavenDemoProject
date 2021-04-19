package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestUtils.Utils;

public class SearchPage extends Utils {

	@FindBy(xpath="//b[contains(text(),'Admin')]")
	WebElement admin;
	
	public SearchPage()
	{
		PageFactory.initElements(driver,this);
	
	}
	public AdminPage navigateToAdmin() throws InterruptedException
	{
	  Thread.sleep(2000);
		admin.click();
		return new AdminPage();
	}
}
