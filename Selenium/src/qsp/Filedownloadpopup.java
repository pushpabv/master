package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Filedownloadpopup {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
        driver.get("https://selenium.dev/downloads/");
	driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[6]/a[1]"));
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ALT);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_S);
	Thread.sleep(3000);
	r.keyRelease(KeyEvent.VK_ALT);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
	driver.close();
	}
}
