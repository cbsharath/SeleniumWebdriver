package testcase;

import java.util.Iterator;
import java.util.Set;




import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Iterators;

public class Scope {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub


		System.setProperty("Webdriver.chrome.drivr","./src/main/resources/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		//Set<String>ids= driver.getWindowHandles();
		WebElement footer=driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		WebElement columndriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			String clickonlink =Keys.chord(Keys.CONTROL, Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
				
		}
		
			Set<String>abc=driver.getWindowHandles();
			Iterator<String> it= abc.iterator();
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
		driver.close();
	}

}
