package qsp;

import javax.sound.midi.SysexMessage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollVertically {
	 static {
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32 (5)\\chromedriver.exe");
	    }
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com/news");
		int y=driver.findElement(By.xpath("//*[@id=\"nw-c-cluster3-heading__title\"]")).getLocation().getY();
		Thread.sleep(5000);
		System.out.println(y);
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scroll(0,"+y+")");
		driver.close();
	}
}
