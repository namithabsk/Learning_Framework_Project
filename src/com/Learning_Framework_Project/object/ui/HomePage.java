package com.Learning_Framework_Project.object.ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage 
{
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getnewtaskbutton()
	{	System.out.println("getnewtaskbutton");
		//return driver.findElement(By.xpath("//span[@class='dashedLink']"));
		return driver.findElement(By.xpath("//span[contains(text(),'New')]"));
	}
	
	public void waitForHomePage()
	{	System.out.println("wait for home page");
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(getnewtaskbutton()));
	}
	
	public List<WebElement> getAddNewTasksuccessmsg()
	{
		List<WebElement> msg=driver.findElements(By.className("successmsg"));
		return msg;
	}
}
