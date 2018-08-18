package com.Learning_Framework_Project.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_Driver 
{
	public static WebDriver getdriverinstance()
	//get the url and browser details and open the application(loginpage) 
	{
		WebDriver driver = null;
		String browser=Data_handler.getDataFromProperties("./config_data/config_data.properties","browser");
		String URL=Data_handler.getDataFromProperties("./config_data/config_data.properties","URL");
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Browser_Jars/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else
		{
			System.out.println("---------------Invalid browser in properties file--------------");
			//return null;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(URL);
		return driver;
	}

}
