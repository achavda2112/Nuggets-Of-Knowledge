package login;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webDriver.webDriverSetup;

public class login extends webDriverSetup{

	public login() {
	}

	public login(WebDriver driver) {
		webDriverSetup.driver = driver;
	}

	public void performLogin(String username, String password) throws InterruptedException {
		WebDriver driver = getDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://nokplatform-dev.who.int/home");
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(login_Locators.SignIn))).isEnabled();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(login_Locators.SignIn))).click();
        handleGoogleLoginPopup(wait, username, password);


	}

	  private void handleGoogleLoginPopup(WebDriverWait wait, String username, String password) throws InterruptedException{
	        String originalWindow = driver.getWindowHandle();
	        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	        Set<String> windowHandles = driver.getWindowHandles();
	        for (String windowHandle : windowHandles) {
	            if (!windowHandle.equals(originalWindow)) {
	                driver.switchTo().window(windowHandle);
	                break;
	            }
	        }
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(login_Locators.Username))).sendKeys(username);
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(login_Locators.UsernameSubmit))).click();
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(login_Locators.Password))).sendKeys(password);
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(login_Locators.PasswordSubmit))).click();
	        Thread.sleep(10000);	        
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(login_Locators.CodeVerify))).click();
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(login_Locators.Continue))).click();
	        Thread.sleep(5000);
	        driver.switchTo().window(originalWindow);
	  }
	}	
	
