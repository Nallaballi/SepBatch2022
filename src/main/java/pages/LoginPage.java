package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
		WebDriver driver;
		By user = By.xpath("//input[@name='email1']");
		By password = By.xpath("//input[@name='password1']");
		By login = By.xpath("//button[@type='submit']");
		
		public LoginPage(WebDriver driver) 
		 { 
		  	this.driver=driver; 
		 }
		 
		//Page object should have only page related WebElements
		public void loginToApplication(String username,String userpassword)
		{
			driver.findElement(user).sendKeys(username);
			driver.findElement(password).sendKeys(userpassword);
			driver.findElement(login).click();
		}
}