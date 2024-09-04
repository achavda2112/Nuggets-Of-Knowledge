package webDriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverSetup{
	
	protected static  WebDriver driver; // Changed to non-static
		
	 public static WebDriver getDriver() {
	        if (driver == null) {
	            System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
	            driver = new ChromeDriver();
				driver.manage().window().maximize();

	        }
	        return driver;
	    }

	    public static void quitDriver() {
	        if (driver != null) {
	            driver.quit();
	            driver = null;
	        }
	    }
}
