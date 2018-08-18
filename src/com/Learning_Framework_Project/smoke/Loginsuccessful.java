package com.Learning_Framework_Project.smoke;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Learning_Framework_Project.object.ui.HomePage;
import com.Learning_Framework_Project.object.ui.Login_Page;
import com.Learning_Framework_Project.util.Create_Driver;

public class Loginsuccessful {
	WebDriver driver;
	Login_Page login;
	HomePage home;
	
	@BeforeMethod
	public void precondition()
	{
		driver=Create_Driver.getdriverinstance();
		login=new Login_Page(driver);
		home=new HomePage(driver);
	}
	
	@AfterMethod
	public void postcondition()
	{
		driver.close();
	}
	
	@Test
	public void loginsucess_scenario()
	{	
		login.waitForLoginPage();
		login.getusername().sendKeys("admin");
		login.getpasswordname().sendKeys("manager");
		login.getloginbutton().click();
		home.waitForHomePage();
		home.getnewtaskbutton().click();
	}
}
