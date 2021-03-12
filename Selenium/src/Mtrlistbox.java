import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Mtrlistbox {
	static {
		System.setProperty("webdriver.gecko.driver", "c://geckodriver.exe");
	}

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/user/Desktop/Hotel.html");
        WebElement		Mtrlistbox=driver.findElement(By.id("mtr"));
        Select s=new Select(Mtrlistbox);
        s.selectByIndex(0);
        s.selectByValue("V");
        s.deselectByVisibleText("Dosa");
      if(s.isMultiple()) {
    	  s.deselectByIndex(2);
    	  s.deselectByValue("I");
    	  s.deselectByVisibleText("Vada");
      }
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
