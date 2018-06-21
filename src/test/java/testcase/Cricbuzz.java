package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricbuzz {
	
	public static void main(String[] args) {
		
		int sum=0;
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver",".//src/main/resources/chromedriver");
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18873/eng-vs-aus-3rd-odi-australia-tour-of-england-2018");
		WebElement parent = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
	int recount=	parent.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
	int count = parent.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
	
	for(int i=0;i<count-2;i++)
	{
		
		//System.out.println(parent.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
		
		
		
		
		String t =parent.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
	   
	int w=	Integer.parseInt(t);
	
	sum =sum+w;
	System.out.println(sum);
		
		//t.equalsIgnoreCase("147");
//	if (t.equals("147"))
		
//	{
//		System.out.println(t);
//		
//	}
	}
	
		
		
	} 

}
