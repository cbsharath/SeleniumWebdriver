package testcase;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scopr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver","./src/main/resources/chromedriver value");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		WebElement Fdriver = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		System.out.println(Fdriver.findElements(By.tagName("a")).size());
		
		WebElement Cdriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(Cdriver.findElements(By.tagName("a")).size());
		
		for(int i=0;i<Cdriver.findElements(By.tagName("a")).size();i++)
		{
			String clickonlink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			Cdriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
		}
		
		Set<String> ids = driver.getWindowHandles();
		Iterator <String> it = ids.iterator();
		
		while (it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
		}
			
		
		
		
		
		
	}

}
