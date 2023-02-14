package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObjects {
	
	public WebDriver driver;
	
	private By firstName= By.xpath("//input[@name='UserFirstName']");
	private By lastName= By.xpath("//input[@name='UserLastName']");
	private By jobTitle= By.xpath("//input[@name='UserTitle']");
	private By email= By.xpath("//input[@name='UserEmail']");
	private By phone= By.xpath("//input[@name='UserPhone']");
	private By employee=By.xpath("//select[@name='CompanyEmployees']");
    private By country=By.xpath("//select[@name='CompanyCountry']");

	
	
	public SignupPageObjects(WebDriver driver2) {
		  
		  this.driver=driver2;
		 }
	
	 public WebElement enterFirstname() {
		  
		  return driver.findElement(firstName);
		 }
	 
	 public WebElement enterLastname() {
		  
		  return driver.findElement(lastName);
		 }
	 
	 public WebElement enterJobtitle() {
		  
		  return driver.findElement(jobTitle);
		 }
	 
	 public WebElement enterEmail() {
		  
		  return driver.findElement(email);
		 }
	 
	 public WebElement enterPhone() {
		  
		  return driver.findElement(phone);
		 }
		 
	   public WebElement selectEmployee() {
		   
		   return driver.findElement(employee);
		  }
		  
	   public WebElement selectCountry() {
		   
		   return driver.findElement(country);
		  }

}
