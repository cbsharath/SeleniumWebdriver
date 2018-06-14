package com.pom;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


	public class Screen  
	{
	    WebDriver driver;
	    
	    public void captureScreenshots() throws IOException 
	    {
	        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        //String fileName =  new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	        String failureImageFileName = new SimpleDateFormat("MM-dd-yyyy HH-mm-ss-S").format(new GregorianCalendar().getTime())+".png";
	        File dest = new File("/media/sharath/New Volume/screenshot" + failureImageFileName);
	        FileUtils.copyFile(src, dest);
	        {
	            Reporter.log("screenshot taken and stored successfully..");
	            
	        }
	    }
	    @Test
	    public void browserSetup() 
	    {
	        System.setProperty("Webdriver.chrome.driver","./src/main/resources/chromedriver");
	        driver = new ChromeDriver();
	        driver.get("https://www.flipkart.com");
	        driver.manage().window().maximize();
	        try {
	            captureScreenshots();
	        } catch (IOException e) 
	        {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        driver.close();
	    }
	}


	

