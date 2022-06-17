import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {
	
	
	
	 public static void main(String[] args) throws Exception {
		
		    System.setProperty("webdriver.chrome.driver", "D:\\setupselenium\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    // Navigate to google site
		    driver.navigate().to("https://www.google.com.vn/");
		    Thread.sleep(2000);
		    
		    // input text Demowith selenium
		    WebElement inputtxt = driver.findElement(By.className("gLFyf"));
		    inputtxt.sendKeys("Demo with selenium");
		    Thread.sleep(1000);
		    WebElement txtlogin = driver.findElement(By.className("gNO89b"));
		    txtlogin.click();
		    Thread.sleep(2000);

		    WebElement results = driver.findElement(By.className("yuRUbf"));
		   
		    // close browser
		    Thread.sleep(2000);
		    driver.close();
		    }

	 
	 
	 
}
