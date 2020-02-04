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
	    
	    driver.manage().window().maximize();
	     
	    Thread.sleep(2000);
	    System.out.println("Hello world");

		System.out.println("shruti");

		System.out.println("sai");
<<<<<<< HEAD
		
		System.out.println("test12");
=======

		System.out.println("pritam");
>>>>>>> e5d0aed0e6285c95731c91c1fc6f8b64f90beab4
        driver.quit();
	}
	
}
