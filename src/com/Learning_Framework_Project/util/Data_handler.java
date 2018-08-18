package com.Learning_Framework_Project.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Data_handler 
{
	public static String getDataFromProperties(String filePath, String key)
	{
		String data=null;
		try
		{
			File f=new File(filePath);
			FileInputStream fis=new FileInputStream(f);
			Properties p= new Properties();
			p.load(fis);
			data=(String) p.get(key);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return data;
		
	}
}
