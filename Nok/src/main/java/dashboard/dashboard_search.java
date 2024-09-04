package dashboard;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import login.login;
import scrollfunction.Scrolltypes;

public class dashboard_search extends login {

	public void dashboardsearch() throws Exception {

		WebDriver driver = getDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.TextDashboard)))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Dashboard_Search_Locators.Searchbox)))
				.sendKeys(Dashboard_Search_TestData.SearchContent);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.SearchOptionFromSuggetionslist)))
				.isEnabled();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.SearchOptionFromSuggetionslist))).click();
		Scrolltypes.setDriver(driver);
		Scrolltypes.scrollToBottom();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.BackbuttonfromNOKDetailView)))
				.isEnabled();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.BackbuttonfromNOKDetailView)))
				.click();

	}

	public void dashboardsearchbyfilter() throws Exception {
//
//		WebDriver driver = getDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.TextDashboard)))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Dashboard_Search_Locators.AdvanceSearchFilter)))
				.click();
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath(Dashboard_Search_Locators.Filter1HazardType)))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Dashboard_Search_Locators.DropDownOption1))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Dashboard_Search_Locators.DropDownOption2))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Dashboard_Search_Locators.DropDownOption3))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Dashboard_Search_Locators.DropDownOption4))).click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath(Dashboard_Search_Locators.HazardCluster))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Dashboard_Search_Locators.DropDownOption1))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Dashboard_Search_Locators.DropDownOption2))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Dashboard_Search_Locators.DropDownOption3))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Dashboard_Search_Locators.DropDownOption4))).click();
		Thread.sleep(3000);
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath(Dashboard_Search_Locators.SpecificHazards)))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Dashboard_Search_Locators.DropDownOption1))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Dashboard_Search_Locators.DropDownOption2))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Dashboard_Search_Locators.DropDownOption3))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Dashboard_Search_Locators.DropDownOption4))).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath(Dashboard_Search_Locators.Pillars))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Dashboard_Search_Locators.DropDownOption1))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Dashboard_Search_Locators.DropDownOption2))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Dashboard_Search_Locators.DropDownOption3))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Dashboard_Search_Locators.DropDownOption4))).click();
		Thread.sleep(3000);
		Scrolltypes.setDriver(driver);
		Scrolltypes.scrollToBottom();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.SearchButton)))
				.isEnabled();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.SearchButton)))
				.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.ResultOption1Title)))
				.isEnabled();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.ResultOption1Title))).click();
		Scrolltypes.scrollToBottom();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Dashboard_Search_Locators.BackbuttonfromNOKDetailView))).click();
		Thread.sleep(3000);
		System.out.println("Your Search Testcase has been passed!!!");
	}
	
		public void SearchBySorting() throws Exception {
			WebDriver driver = getDriver();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.TextDashboard)))
			.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.SortBy)))
			.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.RecentNOKRadio)))
			.click();
			
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.ClearFilters)))
//			.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.ApplyFilters)))
			.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.ResultOption1Title)))
			.click();
			Scrolltypes.setDriver(driver);
			Scrolltypes.scrollToBottom();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.BackbuttonfromNOKDetailView)))
			.click();
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.TextDashboard)))
			.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.SortBy)))
			.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.MostviewedRadio)))
			.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.ApplyFilters)))
			.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.ResultOption1Title)))
			.click();
			Scrolltypes.setDriver(driver);
			Scrolltypes.scrollToBottom();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.BackbuttonfromNOKDetailView)))
			.click();
			Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.TextDashboard)))
			.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.SortBy)))
			.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.MostSearchedRadio)))
			.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.ApplyFilters)))
			.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.ResultOption1Title)))
			.click();
			Scrolltypes.setDriver(driver);
			Scrolltypes.scrollToBottom();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.BackbuttonfromNOKDetailView)))
			.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.TextDashboard)))
			.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.NOKType)))
			.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.TextRadio)))
			.click();
			
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.ClearFilters)))
//			.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.ApplyNOKFilters)))
			.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.ResultOption1Title)))
			.click();
			Scrolltypes.setDriver(driver);
			Scrolltypes.scrollToBottom();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.BackbuttonfromNOKDetailView)))
			.click();
			Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.TextDashboard)))
			.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.NOKType)))
			.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.AudioRadio)))
			.click();
			
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.ClearFilters)))
//			.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.ApplyNOKFilters)))
			.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.ResultOption1Title)))
			.click();
			Scrolltypes.setDriver(driver);
			Scrolltypes.scrollToBottom();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.BackbuttonfromNOKDetailView)))
			.click();
			Thread.sleep(5000);

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.TextDashboard)))
			.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.NOKType)))
			.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.VideoRadio)))
			.click();
			
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.ClearFilters)))
//			.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.ApplyNOKFilters)))
			.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.ResultOption1Title)))
			.click();
			Scrolltypes.setDriver(driver);
			Scrolltypes.scrollToBottom();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dashboard_Search_Locators.BackbuttonfromNOKDetailView)))
			.click();
			System.out.println("Your TestCase Has Been Passed");

		}
}

