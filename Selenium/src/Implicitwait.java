import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Implicitwait {
	static {
		System.setProperty("webdriver.gecko.driver", "c://geckodriver.exe");
	}
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email"));
		driver.findElement(By.id("passContainer"));
		driver.close();

	}

}
