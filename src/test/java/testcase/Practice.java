package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Practice {
	@Test

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.drivr","./src/main/resources/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.spicejet.com");
		
		Select s=new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']")));
		s.selectByValue("INR");
		s.selectByIndex(2);
		s.selectByVisibleText("USD");
	}
	
}
