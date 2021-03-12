package qsp;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	 static {
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32 (5)\\chromedriver.exe");
	    }
	public static void main(String[] args) {
   WebDriver driver=new ChromeDriver();
   driver.get("https://www.naukri.com/");
  Set<String> wh = driver.getWindowHandles();
      for(String wh1:wh) {
    	  driver.switchTo().window(wh1);
    	  String title = driver.getTitle();
         System.out.println(title);
         driver.close();
	}

	}
}
