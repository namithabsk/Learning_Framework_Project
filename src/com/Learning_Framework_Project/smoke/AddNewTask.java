package com.Learning_Framework_Project.smoke;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Learning_Framework_Project.object.ui.Create_New_Tasks_Page;
import com.Learning_Framework_Project.object.ui.HomePage;
import com.Learning_Framework_Project.object.ui.Login_Page;
import com.Learning_Framework_Project.util.Create_Driver;


public class AddNewTask 
{
	WebDriver driver;
	Login_Page login;
	HomePage home;
	Create_New_Tasks_Page task;
	
	@BeforeMethod
	public void precondition()
	{
		driver= Create_Driver.getdriverinstance();
		login=new Login_Page(driver);
		home=new HomePage(driver);
		task=new Create_New_Tasks_Page(driver);
	}
	/*@AfterMethod
	public void postcondition()
	{
		driver.close();
	}*/
	@Test
	public void AddNewTaskSc01()
	{
		login.waitForLoginPage();
		login.getusername().sendKeys("admin");
		login.getpasswordname().sendKeys("manager");
		login.getloginbutton().click();
		home.waitForHomePage();
		home.getnewtaskbutton().click();
		task.waitforCreateNewTaskPage();
		
		task.getcreateTaskButton().sendKeys("- New Customer -");
		task.getCustomerNameTextbox().sendKeys("C11");
		task.getNewProjectTextbox().sendKeys("P11");
		task.getTaskNameTextbox().sendKeys("AnyTASK");
		task.getcancelbutton().click();
		task.getcreateTaskButton().click();
		home.waitForHomePage();
		List<WebElement> msglist=home.getAddNewTasksuccessmsg();
		String msg1=msglist.get(0).getText();
		assertEquals(msg1.contains("C11"),true);
		String msg2=msglist.get(1).getText();
		assertEquals(msg2.contains("P11"),true);
		
	
	}
}
