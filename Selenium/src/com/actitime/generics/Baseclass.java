package com.actitime.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Baseclass {
    static {
    	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    }
     public WebDriver driver;
     public Filelib f=new Filelib();
     @BeforeTest 
     public void openBrowser() {
    	 driver=new ChromeDriver();
    	 driver.manage().window().maximize();
     }
     @AfterTest
     public void closeBrowser() {
    	 driver.close();
     }
    
    
}
