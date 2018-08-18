package com.Learning_Framework_Project.object.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_New_Tasks_Page 
{	
	WebDriver driver;
	public Create_New_Tasks_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getNewCustomerButton()
	{	System.out.println("getNewCustomerButton");
		return driver.findElement(By.xpath("//tr/td[@class='x-btn-left']/td/button[contains(text()='Select Customer')]"));
	}
	
	public WebElement getCustomerNameTextbox()
	{
		return driver.findElement(By.id("createTasksPopup_newCustomer"));
	}
	
	public WebElement getNewProjectTextbox()
	{
		return driver.findElement(By.id("createTasksPopup_newProject"));
	}
	
	public WebElement getTaskNameTextbox()
	{
		return driver.findElement(By.xpath("//[input[@class='inputFieldWithPlaceholder'][1]"));
	}
	
	public WebElement getcreateTaskButton()
	{	System.out.println("getcreatetaskbutton");
		return driver.findElement(By.xpath("//span[@class='buttonTitle']"));
	}
	
	public WebElement getcancelbutton()
	{
		return driver.findElement(By.id("createTasksPopup_cancelBtn"));
	}
	
	public void waitforCreateNewTaskPage()
	
	{	System.out.println("Waiting");
		WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(getTaskNameTextbox()));
	}
	
}
