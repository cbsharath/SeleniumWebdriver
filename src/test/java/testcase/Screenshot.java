package testcase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Screenshot {
	
	
	WebDriver driver;

    @Test
    public void takeScreenshots() {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src, new File("/media/sharath/New Volume/screenshot/screens.png"));
            } 
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        {
            Reporter.log("Screenshot taken successfully..");
        }
        
        driver.close();
    }

}


