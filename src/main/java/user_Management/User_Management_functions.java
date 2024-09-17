package user_Management;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.relevantcodes.extentreports.LogStatus;
import report.ExtentDemo;
import webDriver.webDriverSetup;

public class User_Management_functions extends webDriverSetup {

	public void AddUser() throws Exception {
		ExtentDemo.startReport();
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(User_Management_Locators.Menu_USER_Management))).isEnabled();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Verified Menu_USER_Management is visible and enabled.");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(User_Management_Locators.Menu_USER_Management))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Menu_USER_Management.");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(User_Management_Locators.AddUser))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Add User Button.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(User_Management_Locators.FirstName)))
					.sendKeys(User_Management_TestData.FirstName);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Entered First Name");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(User_Management_Locators.LastName)))
					.sendKeys(User_Management_TestData.LastName);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Entered Last Name.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(User_Management_Locators.Email)))
			.sendKeys(User_Management_TestData.Email);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Entered Email Address.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(User_Management_Locators.JobTitle))).sendKeys(User_Management_TestData.JobTitle);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Entered Job Title.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(User_Management_Locators.Institution)))
					.sendKeys(User_Management_TestData.Institution);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Entered Institution.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(User_Management_Locators.Affiliation)))
					.sendKeys(User_Management_TestData.Affiliation);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Affliliation.");
			
			Select objSelect = new Select(driver.findElement(By.xpath(User_Management_Locators.Country)));
			objSelect.selectByVisibleText("India");
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Choosed Country India.");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(User_Management_Locators.ReasonforAccess)))
			.sendKeys(User_Management_TestData.ReasonForAccess);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Entered Reason For Access.");
			
			Select RoleSelect = new Select(driver.findElement(By.xpath(User_Management_Locators.Role)));
			RoleSelect.selectByVisibleText("System Admin");
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Selected Role as a System Admin.");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(User_Management_Locators.AddUserButton)))
			.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Pressed Add User Button");
			Thread.sleep(5000);

		} catch (Exception e) {
			ExtentDemo.logStatusWithScreenshot(LogStatus.FAIL, "NOK creation failed: " + e.getMessage());
		} finally {
			ExtentDemo.endReport();
		}
	}

	public void EditUser() throws Exception {
		ExtentDemo.startReport();
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(User_Management_Locators.Menu_USER_Management))).isEnabled();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Verified Menu_USER_Management is visible and enabled.");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(User_Management_Locators.Menu_USER_Management))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Menu_USER_Management.");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(User_Management_Locators.Search_From_User_List)))
					.sendKeys(User_Management_TestData.FirstName);
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(User_Management_Locators.ThreeDots)))
					.isEnabled();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(User_Management_Locators.ThreeDots)))
					.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(User_Management_Locators.UserEdit)))
					.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(User_Management_Locators.RecieveEmails)))
			.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(User_Management_Locators.AddUserCrossIcon)))
			.click();
			
		} catch (Exception e) {
			ExtentDemo.logStatusWithScreenshot(LogStatus.FAIL, "NOK creation failed: " + e.getMessage());
		} finally {
			ExtentDemo.endReport();
		}
		Thread.sleep(5000);
	}

	public void TestCaseFinished() {
		System.out.println("Your TestCase Hase Been Passed");
	}
	
	public void DeleteUser() throws Exception {
		ExtentDemo.startReport();
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(User_Management_Locators.Menu_USER_Management))).isEnabled();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Verified Menu_USER_Management is visible and enabled.");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(User_Management_Locators.Menu_USER_Management))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Menu_USER_Management.");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(User_Management_Locators.Search_From_User_List)))
					.sendKeys(User_Management_TestData.FirstName);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "User searched from user list.");
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(User_Management_Locators.ThreeDots)))
					.isEnabled();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Verified Three Dots are visible and enabled.");

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(User_Management_Locators.ThreeDots)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Three dots clicked.");

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(User_Management_Locators.DeleteUser)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "User Delete button pressed.");

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(User_Management_Locators.DeleteUserConfirmation)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "User Delete confirmation yes clicked.");

			Thread.sleep(5000);

		} catch (Exception e) {
			ExtentDemo.logStatusWithScreenshot(LogStatus.FAIL, "NOK creation failed: " + e.getMessage());
		} finally {
			ExtentDemo.endReport();
		}
	}
	
	public void DeActivteUser() throws Exception {
		ExtentDemo.startReport();
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(User_Management_Locators.Menu_USER_Management))).isEnabled();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Verified Menu_USER_Management is visible and enabled.");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(User_Management_Locators.Menu_USER_Management))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Menu_USER_Management.");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(User_Management_Locators.Search_From_User_List)))
					.sendKeys(User_Management_TestData.FirstName);
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(User_Management_Locators.ThreeDots)))
					.isEnabled();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(User_Management_Locators.ThreeDots)))
					.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(User_Management_Locators.DeActivateUser)))
					.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(User_Management_Locators.DeActivateUserConfirmation)))
					.click();
		} catch (Exception e) {
			ExtentDemo.logStatusWithScreenshot(LogStatus.FAIL, "NOK creation failed: " + e.getMessage());
		} finally {
			ExtentDemo.endReport();
		}
		Thread.sleep(5000);
	}
}
