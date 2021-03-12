package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validlogin {
	static {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32 (5)\\chromedriver.exe");
	}
public static void main(String[] args) {
  WebDriver driver=new ChromeDriver();
  driver.get("https://demo.actitime.com");
  Loginpage l=new Loginpage(driver);
  l.setuser("admin");
   l.setpassword("manager");
  l.click();
}

}
