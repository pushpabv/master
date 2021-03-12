package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextofGoogle {
	static {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32 (5)\\chromedriver.exe");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.google.com/");
     WebElement Gmaillink = driver.findElement(By.name("q"));
      System.out.println(Gmaillink.getText());
      driver.close();
	}

}
