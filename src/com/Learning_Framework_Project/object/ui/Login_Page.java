package com.Learning_Framework_Project.object.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Page
{
	WebDriver driver;
	public Login_Page(WebDriver driver)
	{
		this.driver=driver;
	}

	public WebElement getusername()
	{
		return driver.findElement(By.id("username"));
	}
	public WebElement getpasswordname()
	{
		return driver.findElement(By.name("pwd"));
	}
	public WebElement getloginbutton()
	{
		return driver.findElement(By.id("loginButton"));
	}
	
	public WebElement getloginerrormsg()
	{
		return driver.findElement(
				By.xpath("//span[contains(text(),'Username or Password is invalid')]"));
	}
	public void waitForLoginPage()
	{
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(getusername()));
	}
}
