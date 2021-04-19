package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testUtils.Utils;

public class LogIn extends Utils {
	
	@FindBy(xpath="//input[@id='txtUsername']")
	WebElement userId;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	WebElement password;
	 
	@FindBy(xpath="//input[@id='btnLogin']")
	WebElement loginBth;
	
	public LogIn()
	{
		PageFactory.initElements(driver,this);
	
	}
	public SearchPage logInToCols(String uid,String pwd)
	{
		userId.sendKeys(uid);
		password.sendKeys(pwd);
		loginBth.click();
		return new SearchPage();
	}
}
