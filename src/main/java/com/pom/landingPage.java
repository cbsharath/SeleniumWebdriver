package com.pom;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingPage {

	
	public WebDriver driver;
	
	@FindBy(xpath ="")
	WebElement Login_Button;
	
	public landingPage(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Open_Url()
	{
		String Url="http://toolsqa.com/automation-practice-form";
		driver.get(Url);
	}
	
	public void selectSex() {
		
		List<WebElement> radiobtns = driver.findElements(By.name("sex"));
		
		for(int i=0; i< radiobtns.size(); i++) {
			
			if(radiobtns.get(i).getAttribute("value") =="Male"){
				
				System.out.println("hit"+radiobtns.get(i));
				
				radiobtns.get(i).click();
				
				
			}
			
		}
		
		
	}
	
	public void selectMale(){
		driver.findElement(By.xpath("//input[@value='Male']")).click();
	}
	
	public void selectFeMale(){
		driver.findElement(By.xpath("//input[@value='Female']")).click();
	}
	
	public void selectexp_1(){
		List<WebElement> exp =driver.findElements(By.xpath("//input[@type='radio']"));
			for(int i=0;i<=exp.size();i++)
			{
			exp.get(i);
			}
	}
	
	
	public void Enter_UN(String test)
	{
		Login_Button.clear();
		Login_Button.sendKeys("Admin");
		
	}
	
}
