package testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjectModel.LoginPageObjects;
import resources.BaseClass;
import resources.CommonMethods;
import resources.Constants;

public class VerifyLoginPage extends BaseClass {
	
	 @Test(dataProvider="testData")
	public void login(String uname,String password) throws IOException {
		
//		driverInitilize();
//		 //This driver have scope
//		driver.get("https://login.salesforce.com/");
		
		 LoginPageObjects obj=new LoginPageObjects(driver);
		 
		  CommonMethods.handleAssertions(driver.getCurrentUrl(), "https://login.salesforce.com/", "url is not matching");
		  
		  obj.enterUsername().sendKeys(uname);
		  
		  obj.enterPassword().sendKeys(password);
		  
		  obj.clickOnLogin().click();
		  
		  
		  CommonMethods.handleAssertions(obj.errorText().getText(), Constants.expectedErrorMessage, "error message is not matchimg");
		  
		  /*SoftAssert a=new SoftAssert();
		  		  
		  String actual=obj.errorText().getText();		  
		  System.out.println(actual);
		    
		  String expected="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		  
		     a.assertEquals(actual, expected,"Error message is not matching");		  
		     a.assertAll(); */
		
	}
	
	 @DataProvider
	 public Object[][] testData() {
	  Object[][] data=new Object[2][2];
	  data[0][0]=Constants.username1;
	  data[0][1]=Constants.password1;
	  data[1][0]=Constants.username2;
	  data[1][1]=Constants.password2;
	 
	  return data;
	 }
}