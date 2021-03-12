package qsp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollbarofButtom {
	 static {
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32 (5)\\chromedriver.exe");
	    }
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	     driver.get("https://www.bbc.com/news");
	     JavascriptExecutor j=(JavascriptExecutor)driver;
	     j.executeScript("window.scrollTo,document.body.scrollheight");
	     Thread.sleep(3000);
	 driver.close();
	}
}
