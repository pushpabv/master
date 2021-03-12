package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {
	  static {
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32 (5)\\chromedriver.exe");
	    }
	public static void main(String[] args) {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.findElement(By.name("q")).sendKeys("java");
   List<WebElement> allsuggestion = driver.findElements(By.className("UUbT9"));
   int count=allsuggestion.size();
   System.out.println(count);
   for(int i=0;i<count;i++) {
	   String text = allsuggestion.get(i).getText();
	   System.out.println(text);
   }
   allsuggestion.get(0).click();
   driver.close();
   }

}
