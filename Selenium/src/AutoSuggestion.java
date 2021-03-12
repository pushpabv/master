import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AutoSuggestion {
	 static {
		System.setProperty("webdriver.gecko.driver", "c://geckodriver.exe");
	}

	public static void main(String[] args) {
		String Expectedtitle = "java-Google search";
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java");
	List<WebElement> allsuggestion = driver.findElements(By.name("q"));
	int count=allsuggestion.size();
	System.out.println(count);
	for(int i=0;i<count;i++) {
		String text = allsuggestion.get(i).getText();
		System.out.println(text);
	}
allsuggestion.get(0).click();
  String Actualtitle = driver.getTitle();
  if(Expectedtitle.equals(Actualtitle)) {
	  System.out.println("titles are matched");
  }
  else {
	  System.out.println("titles are not matched");
  }
  driver.close();
	}

}
