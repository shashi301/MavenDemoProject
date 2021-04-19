package TestSuites;

//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AdminPage;
import pages.LogIn;
import pages.SearchPage;
import testUtils.Utils;

public class LogInPageTest extends Utils{

	LogIn logIn;
	SearchPage searchPage;
	AdminPage adminPage;
	public LogInPageTest()
	{
		super();
		
	}
	@Test(priority=1)	
	public void LogInPageValidation()
	{
		browserIntialzation();
		logIn=new LogIn();
		searchPage=logIn.logInToCols(prop.getProperty("userid"), prop.getProperty("password"));
		
	}
	@Test(priority=2)	
	public void ValidateAdmin() throws InterruptedException
	{
		adminPage=searchPage.navigateToAdmin();
	}
	@Test(priority=3)	
	public void ValidateSystemUser() throws Exception
	{
		adminPage.systemUser("Sonu","Sonu1234");
	}
	
	
}
