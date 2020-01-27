package test.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

	
	
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
	
	    WebDriver driver = new ChromeDriver();

	    driver.get("https://google.com/");
	     
	    Thread.sleep(2000);
	    
        driver.quit();
	}
	
}
