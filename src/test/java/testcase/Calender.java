package testcase;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver","./ src/main/resources/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
		}
	    
		 List<WebElement> dates =driver.findElements(By.className("day"));
		 
	int count = driver.findElements(By.className("day")).size();
		 
	for(int i=0;i<count;i++)
		
	{
		String Text = driver.findElements(By.className("day")).get(i).getText();
		if (Text.equalsIgnoreCase("23"));
	
		{
		driver.findElements(By.className("day")).get(i).click();
		break;
		}
	}
		driver.close();
		}

}
