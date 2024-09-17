package scrollfunction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class Scrolltypes {
	
	private static WebDriver driver; 
	
	// Method to set the WebDriver instance
    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }
	
	public static void scrollToBottom() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		  if (driver == null) {
	            throw new IllegalStateException("WebDriver is not initialized. Please initialize the WebDriver instance before using this method.");
	        }
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		Thread.sleep(2000);
	}

	public static void scrollBy(int x, int y) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(arguments[0], arguments[1])", x, y);
		Thread.sleep(2000);
	}
	 public void scrollToElementAndClick(WebElement element) {
	        try {
	            // Scroll the element into view
	            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	            // Wait for the scrolling to complete
	            Thread.sleep(3000);
	            // Click the element
	            element.click();
	        } catch (Exception e) {
	            System.out.println("Failed to scroll to the element and click: " + e.getMessage());
	        }
	    }
	
}

