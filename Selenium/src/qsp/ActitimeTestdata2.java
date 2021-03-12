package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActitimeTestdata2 {
	static {
		System.setProperty("webdriver.gecko.driver", "c://geckodriver.exe");
	}

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("‪./data/commondata.properties");
		Properties p=new Properties();
		  p.load(fis);
  WebDriver driver=new FirefoxDriver();
  driver.get("https://www.actitime.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.findElement(By.id("usernsme")).sendKeys(p.getProperty("un"));
       driver.findElement(By.name("password")).sendKeys(p.getProperty("pw"));
       driver.findElement(By.xpath("//div['login']")).click();
       
       
       
	}

}
