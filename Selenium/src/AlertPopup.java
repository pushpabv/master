import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopup {
	static {
	System.setProperty("webdriver.gecko.driver", "c://geckodriver.exe");
	}

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.seleniumeasy.com/");
		driver.findElement(By.xpath("(//button[.='click me!')[1]")).click();
		WebDriverWait wait=new WebDriverWait(driver,10);
       wait.until(ExpectedConditions.alertIsPresent());
       Alert a=driver.switchTo().alert();
       String text = a.getText();
         a.accept();
         System.out.println(text);
         driver.close();
	}

}
