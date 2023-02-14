package testCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjectModel.LoginPageObjects;
import pageObjectModel.SignupPageObjects;
import resources.BaseClass;
import resources.CommonMethods;
import resources.Constants;

public class VerifySignup extends BaseClass {
	
	@Test
	 public void signup() throws IOException, InterruptedException {
		  	  
//		  driverInitilize();
//		  //This driver have scope
//		  driver.get("https://login.salesforce.com/");		
		  
		  LoginPageObjects lpo=new LoginPageObjects(driver);
		  
		  Thread.sleep(3000);
		  
		  lpo.clickOntryForFreee().click();
		  
		  SignupPageObjects spo=new SignupPageObjects(driver);
		  
		  Thread.sleep(5000);
		  
		  spo.enterFirstname().sendKeys(Constants.firstname);		  
		  spo.enterLastname().sendKeys(Constants.lastname);
		  spo.enterJobtitle().sendKeys(Constants.jobtitle);
		  spo.enterEmail().sendKeys(Constants.email);
		  spo.enterPhone().sendKeys(Constants.phone);
		  
		  /*Select s=new Select(spo.selectEmployee());
		  s.selectByIndex(2);
		  
		  Select s1=new Select(spo.selectCountry());
		  s1.selectByIndex(2); */
		  
		  CommonMethods.selectDropdown(spo.selectEmployee(), 2);
		  
		  CommonMethods.selectDropdown(spo.selectCountry(), 2);
		  
		 }

}
