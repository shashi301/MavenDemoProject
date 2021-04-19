import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_GET_Request {
	
	@Test
	void getWeatherDetails()
	{
		//Specify base URI
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1/employees";
		
		//Request object
		RequestSpecification httprequest=RestAssured.given();
		
		//Response object
		Response response=httprequest.request(Method.GET,"");
		
		//print response in console window
		String ResposeBody=response.getBody().asString();
		System.out.println("Responce body is : "+ResposeBody);
		
	}

}
