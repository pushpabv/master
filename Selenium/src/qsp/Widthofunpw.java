package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Widthofunpw {
	 static {
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32 (5)\\chromedriver.exe");
	    }
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	int width1 = driver.findElement(By.id("username")).getSize().getWidth();
	int width2=driver.findElement(By.name("pwd")).getSize().getWidth();
	if(width1==width2) {
		System.out.println("width of both the text boxes are equal ");
	}
	else {
		System.err.println("width of both the text boxes are not equal");
	}
	driver.close();
	}
}
