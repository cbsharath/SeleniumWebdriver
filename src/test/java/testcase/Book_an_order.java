package testcase;

//import java.util.List;

import org.testng.annotations.Test;

//import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.pom.landingPage;

//import org.testng.annotations.Test;

public class Book_an_order {
	WebDriver driver;

	@Test
	public void First_order() throws InterruptedException {

		System.setProperty("Webdriver.chrome.driver",
				"/home/sharath/Desktop/chromedriver");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		landingPage obj = new landingPage(driver);

		obj.Open_Url();
		
		Thread.sleep(3000);
		System.out.println("hi:3");
		
		obj.selectFeMale();
		
		System.out.println("Female is selected");
	
		obj.selectexp_1(); 
		
		System.out.println("first button is selectedq");
	

		// Select dropdown = new Select(driver.findElement(By.xpath("")));
		// List<WebElement> elementcount = dropdown.getOptions();
		// int isize= elementcount.size();
		//
		// for (int i=0; i<isize;i++)
		// {
		// String svalue = elementcount.get(i).getText();
		// System.out.println(svalue);

		// }
		
		/*

		List<WebElement> radiobtn = driver.findElements(By.name("sex"));
		boolean bvalue = false;

		bvalue = radiobtn.get(0).isSelected();

		if (bvalue == true) {
			radiobtn.get(1).click();
		} else {
			radiobtn.get(0).click();
		}
		
		*/

		// WebElement sex =
		// driver.findElement(By.xpath("//input[@id='sex-0']"));
		// sex.click();

		// Select Names= new Select (driver.findElement(By.xpath("")));
		// Names.deselectByIndex(3);
		//
		// Select Filems = new Select(driver.findElement(By.id("")));
		// Filems.selectByValue("");
		//
		// Select Place =new Select(driver.findElement(By.cssSelector("")));
		// Place.selectByVisibleText("");

		// driver.get("https://www.amazon.in");

		String title = driver.getTitle();

		int titleLength = driver.getTitle().length();

		System.out.println("title of the page is :" + title);

		System.out.println("length of the title is:" + titleLength);

		// String actualUrl = driver.getCurrentUrl();

		// if(actualUrl.equals(Url)){

		// System.out.println("the current url is correct:"+ Url);
		// }
		// else
		// System.out.println("the current url is false :"+ actualUrl);
		//
		//
		// driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("men shoes");

		Select Countries = new Select(driver.findElement(By.id("continents")));
		System.out.println("rgistration page is successfully open");

		Countries.selectByVisibleText("Europe");

		// driver.close();

		//
		// List<WebElement> Country _size = Countries.getOptions();
		//
		// int Elist = c_size.size();
		//
		// for(int i=0; i< Elist;i++)
		// {
		// String svalue =c_size.get(1).getText();
		// System.out.println(svalue);
		// }

		// driver.navigate().back();
		// System.out.println("back to home");

		// driver.navigate().forward();
		// System.out.println("forward to registration");

		// driver.navigate().to(Url);
		// System.out.println("HOME");

		// driver.navigate().refresh();
		// System.out.println("Page_Refresh");

		// driver.close();

	}
}
