package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notificationpopup {
	static {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32 (5)\\chromedriver.exe");
    }
public static void main(String[] args) {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("_disable_notification");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.yatra.com");
}
}
