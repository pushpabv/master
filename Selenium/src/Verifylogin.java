import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifylogin {
	static{
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String Title = driver.getTitle();
		System.out.println(Title);
		driver.close();
	}

}
