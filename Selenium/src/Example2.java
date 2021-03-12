import org.openqa.selenium.WebDriver;    
import org.openqa.selenium.chrome.ChromeDriver;        

public class Example2 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Chrome Driverschromedriver\\chromedriver1.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.co.in");

    } 
}