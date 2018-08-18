package com.Learning_Framework_Project.smoke;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Learning_Framework_Project.object.ui.Login_Page;
import com.Learning_Framework_Project.util.Create_Driver;

public class Framework_SmokeTest 
{	
	WebDriver driver;
	Login_Page login;
	@BeforeMethod
	public void precondition()
	{
		driver=Create_Driver.getdriverinstance();
		login=new Login_Page(driver);
	}
	@AfterMethod
	public void postcondition()
	{
		driver.close();
	}
	@Test
	public void testApp()
	{
		login.waitForLoginPage();
		 //assertEquals(driver.getTitle(), "Act_time_login"); // find a url and past the actual title
		login.getusername().sendKeys("admin");
		login.getpasswordname().sendKeys("invalid");
		login.getloginbutton().click();
		String expectedR= login.getloginerrormsg().getText();
		String actualR="Username or Password is invalid. Please try again.";
		/*boolean	result;
		if (expectedR==actualR)
		{
			result=true;
		}*/
		//assert.assertTrue(expected.equals(actual));
		assertEquals(actualR, expectedR);
	}
	
}
