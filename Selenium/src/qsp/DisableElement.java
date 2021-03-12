package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class DisableElement {
static {
	  System.setProperty("webdriver.chome.driver", "c://geckodriver.exe");
  }
	public static void main(String[] args) {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("file:///C:/Users/user/Desktop/disabled.html");
	  driver.findElement(By.id("UN")).sendKeys("admin");
	  JavascriptExecutor j=(JavascriptExecutor)driver;
	  j.executeScript("document.getElement By.id('PW').value='manager'");
	  j.executeScript("document.getElement By.id(login').click()");

	}

}
