package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Mousehover {
	
	@Test

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver","./ src/main/resources/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		Actions a =new Actions(driver);
		WebElement E =driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	    a.moveToElement(E).build().perform();
		//WebElement E = driver.findElement(By.xpath("//span[@class='nav-text'][contains(text(),'Your Orders')]"));
		
		
	//	a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("Hello").doubleClick().build().perform();
		a.moveToElement(E).contextClick().build().perform();//Perform double click
	 // WebDriverWait W =new WebDriverWait(driver,20);
	  
	 // W.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
	  
	  driver.close();
	  driver.quit();
	
	  
	 
	  
	  
	}				

}
