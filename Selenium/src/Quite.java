import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Quite {
	static {
	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
	}
	public static void main(String[] args)
	{
	WebDriver driver = new FirefoxDriver();
      driver.get("https://www.facebook.com/");
     String Title = driver.getTitle();
     System.out.println(Title);
     driver.quit();
	}

}
