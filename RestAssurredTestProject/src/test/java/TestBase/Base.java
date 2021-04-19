package TestBase;

import org.apache.log4j.BasicConfigurator;
import org.apache.poi.hssf.dev.ReSave;
import org.testng.annotations.BeforeClass;
import org.testng.log4testng.Logger;

import io.restassured.specification.RequestSpecification;

public class Base {

	public static RequestSpecification httprequest;
	
	public static ReSave response;
	
	//public static EmpID="123";
	
	public Logger logger;
	
	@BeforeClass
	public void setUp()
	{
		logger=Logger.getLogger(this.getClass());
		BasicConfigurator.configure();
	}
	
}
