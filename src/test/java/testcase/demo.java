package testcase;

import java.io.File;

import org.apache.*;

import java.util.ArrayList;
import java.util.logging.FileHandler;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.TakesScreenshot;
public class demo {
	
	
	@Test
	public void OpenWb() throws InterruptedException{

//		System.setProperty("Webdriver.chromr.driver","./src/main/resources/chromedriver");
		//bDriver driver = new ChromeDriver();
	
		System.setProperty("Webdriver.chrome.driver","./src/main/resources/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.gmail.com");
	
	// Take screenshot and store as a file format
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		 // now copy the  screenshot to desired location using copyFile //method
		FileHandler.copyFile(src, new File("C:/selenium/error.png"));
		
		}
		catch(Exception e){
			
		}
	
	
	
	
	
	
	Alert alt = driver.switchTo().alert();
	alt.accept();
	alt.dismiss();
	Alter.alt=driver.switchTo().window(home_page);
	
	
	Actions act = new Actions(driver);
	act.moveToElement(webElement).perform();
	act.contextClick().perform();
	
	
	Alert alt = driver.switchTo().alert();
	alt.accept();
	alt.dismiss();
	Alert alt.driver.switchTo().window(arg0);
	
	
	Actions act = new Actions(driver);
	act.moveToElement(WebElement).perform();
	act.contextClick().perform();
	
	}
	}