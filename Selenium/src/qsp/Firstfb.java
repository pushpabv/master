package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstfb {
	 static {
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32 (5)\\chromedriver.exe");
	    }
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
	driver.findElement(By.id("email")).sendKeys("pushpabv98@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("pushpa12@");
	driver.findElement(By.name("login")).click();
	
	}
	
}
