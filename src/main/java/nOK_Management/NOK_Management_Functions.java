package nOK_Management;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebElement;
import fileUpload.File_Upload;
import report.ExtentDemo;
import scrollfunction.Scrolltypes;
import webDriver.webDriverSetup;

public class NOK_Management_Functions extends webDriverSetup {

	public void addNOK() throws Exception {
		ExtentDemo.startReport();
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			// Step: Menu NOK Management
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Menu_NOK_Management))).isEnabled();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Menu NOK Management is visible and enabled");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Menu_NOK_Management))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Menu NOK Management");

			// Step: Add New NOK
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AddNEWNOK)))
					.isEnabled();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Add New NOK button is visible and enabled");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AddNEWNOK)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Add New NOK");

			// Step: Fill in Nugget Title

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NuggetTitle)))
					.sendKeys(NOK_Management_TestData.NuggetTitle);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Entered Nugget Title");

			// Step: Fill in Nugget Subtitle
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NuggetSubTitle)))
					.sendKeys(NOK_Management_TestData.NuggetSubTitle);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Entered Nugget Subtitle");

			// Step: Fill in Short Description
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ShortDescription)))
					.sendKeys(NOK_Management_TestData.NuggetShortDiscription);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Entered Nugget Short Description");

			// Step: Scroll to bottom
			Scrolltypes.setDriver(driver);
			Scrolltypes.scrollToBottom();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Scrolled to bottom of the page");

			// Step: Add Tags
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NuggetTags)))
					.sendKeys(NOK_Management_TestData.Tags);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Added Nugget Tags");

			// Step: Select Nugget Option
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NuggetOptions)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Selected Nugget Option");

			// Step: Add Keywords
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NuggetKeyWords)))
					.sendKeys(NOK_Management_TestData.KeyWords);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Added Nugget Keywords");

			// Step: Select Source and Population Type
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NoKSourceDropdown)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked Source dropdown");
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NoKSourceOptions)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Selected Source option");

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.PopulationType)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked Population Type dropdown");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.PopulationTypeOptions))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Selected Population Type");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.PopulationTypeOptions))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Selected Population Type.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Region))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Opened Region dropdown.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.RegionOptions)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Selected Region.");

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Country)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Opened Country dropdown.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.CountryOptions)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Selected Country");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(NOK_Management_Locators.CountryLabel))).click();
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.StartDateDatePicker))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Opened Start Date date picker.");
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.StartDateDatePicker)))
					.sendKeys(NOK_Management_TestData.StartDate);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO,
					"Entered Start Date: " + NOK_Management_TestData.StartDate);
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.EndDateDatePicker)))
					.click();
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Nugget Tags Has Beed Selected");
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.EndDateDatePicker)))
					.sendKeys(NOK_Management_TestData.EndDate);
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.TAB);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Nugget Tags Has Beed Selected");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.EndDateLabel)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Entered End Date: " + NOK_Management_TestData.EndDate);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NextInPage1)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked Next to proceed to Page 2.");
			Thread.sleep(2000);

			// page 2 Description

			File_Upload fileUploader = new File_Upload();
			WebElement fileInputElement = driver.findElement(By.xpath(NOK_Management_Locators.AddNoKThumbnail));
			fileUploader.uploadImage(fileInputElement, "Image.jpg");
			ExtentDemo.logStatusWithScreenshot(LogStatus.PASS, "Thumbnail image 'Image.jpg' uploaded successfully.");
			Thread.sleep(3000);

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NOKFormat)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Selected NOK Format successfully.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Audio))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Selected Audio format for the Nugget.");
			File_Upload audioFileUploader = new File_Upload();
			WebElement audioFileInputElement = driver.findElement(By.xpath(NOK_Management_Locators.VideoUPloadFile));
			audioFileUploader.uploadImage(audioFileInputElement, "Audio.mp3");
			ExtentDemo.logStatusWithScreenshot(LogStatus.PASS, "Audio file 'Audio.mp3' uploaded successfully.");
			Thread.sleep(3000);
			Scrolltypes.setDriver(driver);
			Scrolltypes.scrollToBottom();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Scrolled to the bottom of the page.");

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Transcript)))
					.sendKeys(NOK_Management_TestData.Transcript);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO,
					"Entered transcript text: " + NOK_Management_TestData.Transcript);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NextInPage2)))
					.isEnabled();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Next button on Page 2 is enabled.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NextInPage2)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Next button to proceed to Page 3.");
			Thread.sleep(3000);

			// Page 3
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Hazard))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Hazard option selected.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.HazardTypes)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Hazard types selected.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.DropDownOptions)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Drop-down options opened.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.HazardClusters)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Hazard clusters selected.");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.HazardClustersOption))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Hazard cluster option selected.");

			Scrolltypes ScrollDown = new Scrolltypes();
			WebElement elementToClick1 = driver
					.findElement(By.xpath(NOK_Management_Locators.SpecificHazardMeteorimpact));
			ScrollDown.scrollToElementAndClick(elementToClick1);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Specific Hazard: Meteor Impact selected.");

			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.IHRTechnicalAreas)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "IHR Technical Areas selected.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Pillar))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Pillar selected.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.DropDownOptions)))
					.click();
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.TAB);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Drop-down options opened.");
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.IHRTechnicalArea)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "IHR Technical Area selected.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.DropDownOptions)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Drop-down options opened.");
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.TAB);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Navigated through page using Tab key.");

			Scrolltypes ScrollToIndicator = new Scrolltypes();
			WebElement WaitforElement = driver.findElement(By.xpath(NOK_Management_Locators.IndicatorsOptions));
			ScrollToIndicator.scrollToElementAndClick(WaitforElement);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Indicators options selected.");

			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.WHOBENCHMARKFORIHRCAPACITIES)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "WHO Benchmark for IHR Capacities selected.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.WHOBenchmarks)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "WHO Benchmarks selected.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.DropDownOptions)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Drop-down options opened.");
			Scrolltypes scrollingUtilsElement = new Scrolltypes();
			WebElement CheckBoxWaitToAppear = driver.findElement(By.xpath(NOK_Management_Locators.WHOBenchmarksLabel));
			scrollingUtilsElement.scrollToElementAndClick(CheckBoxWaitToAppear);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "WHO Benchmarks Label checkbox selected.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.IHRCapacties)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "IHR Capacities selected.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NextInPage3)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Proceeded to next page.");
			Thread.sleep(2000);

			// Page4
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ReferenceLink)))
					.sendKeys(NOK_Management_TestData.ReferenceLink);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Entered Reference Link.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AddAuthor)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked 'Add Author' button.");
			Scrolltypes.setDriver(driver);
			Scrolltypes.scrollToBottom();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AuthorName)))
					.sendKeys(NOK_Management_TestData.AuthorName);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Entered Author Name.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AuthorTitle)))
					.sendKeys(NOK_Management_TestData.AuthorTitle);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Entered Author Title.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AuthorCountry)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Opened Author Country dropdown.");
			Select objSelect = new Select(driver.findElement(By.xpath(NOK_Management_Locators.AuthorCountry)));
			objSelect.selectByVisibleText("India");
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Selected 'India' from Author Country dropdown.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Year)))
					.sendKeys(NOK_Management_TestData.Year);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Entered Year.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Date))).click();
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Opened Date Picker.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Date)))
					.sendKeys(NOK_Management_TestData.StartDate);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Entered Start Date.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.SaveAndSubmit)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Submitted NOK successfully");
		} catch (Exception e) {
			ExtentDemo.logStatusWithScreenshot(LogStatus.FAIL, "NOK creation failed: " + e.getMessage());
		} finally {
			ExtentDemo.endReport();
		}
		Thread.sleep(10000);
	}

	public void DraftNOK() throws Exception {
		ExtentDemo.startReport();
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Menu_NOK_Management))).isEnabled();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Menu NOK Management is visible and enabled.");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Menu_NOK_Management))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Menu NOK Management.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AddNEWNOK)))
					.isEnabled();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Add New NOK button is visible and enabled.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AddNEWNOK)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Add New NOK button.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NuggetTitle)))
					.sendKeys(NOK_Management_TestData.NuggetTitle);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Entered Nugget Title.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NuggetSubTitle)))
					.sendKeys(NOK_Management_TestData.NuggetSubTitle);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Entered Nugget Subtitle.");
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ShortDescription)))
					.sendKeys(NOK_Management_TestData.NuggetShortDiscription);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Entered Short Description.");

			Scrolltypes.setDriver(driver);
			Scrolltypes.scrollToBottom();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Scrolled to bottom of the page.");

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NuggetTags)))
					.sendKeys(NOK_Management_TestData.Tags);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Added Nugget Tags.");

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NuggetOptions)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Selected Nugget Option.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NuggetKeyWords)))
					.sendKeys(NOK_Management_TestData.KeyWords);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Added Nugget Keywords.");
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NoKSourceDropdown)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Selected NoK Source Dropdown.");
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NoKSourceOptions)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Selected NoK Source Option.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.PopulationType)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Selected Population Type.");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.PopulationTypeOptions))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Selected Population Type Option.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Region))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Selected Region.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.RegionOptions)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Selected Region Option.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Country)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Selected Country.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.CountryOptions)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Selected Country Option.");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(NOK_Management_Locators.CountryLabel))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Country Label.");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.StartDateDatePicker))).click();
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Opened Start Date DatePicker.");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.StartDateDatePicker)))
					.sendKeys(NOK_Management_TestData.StartDate);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Entered Start Date.");
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.EndDateDatePicker)))
					.click();
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Opened End Date DatePicker.");
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.EndDateDatePicker)))
					.sendKeys(NOK_Management_TestData.EndDate);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Entered End Date.");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.TAB);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.EndDateLabel)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on End Date Label.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NextInPage1)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked Next on Page 1.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NextInPage2)))
					.isEnabled();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Next on Page 2 is enabled.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NextInPage2)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked Next on Page 2.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NextInPage3)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked Next on Page 3.");
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.DraftNOK)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked Draft NOK.");
		} catch (Exception e) {
			ExtentDemo.logStatusWithScreenshot(LogStatus.FAIL, "NOK creation failed: " + e.getMessage());
		} finally {
			ExtentDemo.endReport();
		}
		Thread.sleep(2000);

	}

	public void DraftEdit() throws Exception {
		ExtentDemo.startReport();
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Menu_NOK_Management))).isEnabled();
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Menu_NOK_Management))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Menu NOK Management.");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Search_From_Nugget_List)))
					.sendKeys(NOK_Management_TestData.NuggetTitle);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Entered Nugget Title in search.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ThreeDots)))
					.isDisplayed();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ThreeDots)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Three Dots.");
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Edit))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Edit.");

			Scrolltypes.setDriver(driver);
			Scrolltypes.scrollToBottom();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Scrolled to bottom.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NextInPage1)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Next in Page 1.");
			File_Upload fileUploader = new File_Upload();
			WebElement fileInputElement = driver.findElement(By.xpath(NOK_Management_Locators.AddNoKThumbnail));
			fileUploader.uploadImage(fileInputElement, "Image.jpg");
			Thread.sleep(3000);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Uploaded Image.jpg.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NOKFormat)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on NOK Format.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Audio))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Audio.");

			// Step: Upload Audio File
			File_Upload audioFileUploader = new File_Upload();
			WebElement audioFileInputElement = driver.findElement(By.xpath(NOK_Management_Locators.VideoUPloadFile));
			audioFileUploader.uploadImage(audioFileInputElement, "Audio.mp3");
			Thread.sleep(3000);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Uploaded Audio.mp3.");
			Scrolltypes.setDriver(driver);
			Scrolltypes.scrollToBottom();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Scrolled to bottom.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Transcript)))
					.sendKeys(NOK_Management_TestData.Transcript);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Entered Transcript.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NextInPage2)))
					.isEnabled();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NextInPage2)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Next in Page 2.");
			Thread.sleep(3000);

			// Page 3
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Hazard))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Hazard.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.HazardTypes)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Hazard Types.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.DropDownOptions)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on DropDownOptions.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.HazardClusters)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Hazard Clusters.");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.HazardClustersOption))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Hazard Clusters Option.");

			Scrolltypes ScrollDown = new Scrolltypes();
			WebElement elementToClick1 = driver
					.findElement(By.xpath(NOK_Management_Locators.SpecificHazardMeteorimpact));
			ScrollDown.scrollToElementAndClick(elementToClick1);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO,
					"Scrolled to and clicked on Specific Hazard Meteorimpact.");
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.IHRTechnicalAreas)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on IHR Technical Areas.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Pillar))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Pillar.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.DropDownOptions)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on DropDownOptions.");
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.TAB);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Sent TAB key.");
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.IHRTechnicalArea)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on IHR Technical Area.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.DropDownOptions)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on DropDownOptions.");

			driver.findElement(By.cssSelector("body")).sendKeys(Keys.TAB);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Sent TAB key.");
			Scrolltypes ScrollToIndicator = new Scrolltypes();
			WebElement WaitforElement = driver.findElement(By.xpath(NOK_Management_Locators.IndicatorsOptions));
			ScrollToIndicator.scrollToElementAndClick(WaitforElement);

			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Scrolled to and clicked on Indicators Options.");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.WHOBENCHMARKFORIHRCAPACITIES)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on WHO BENCHMARK FOR IHR CAPACITIES.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.WHOBenchmarks)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on WHO Benchmarks.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.DropDownOptions)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on DropDownOptions.");

			Scrolltypes scrollingUtilsElement = new Scrolltypes();
			WebElement CheckBoxWaitToAppear = driver.findElement(By.xpath(NOK_Management_Locators.WHOBenchmarksLabel));
			scrollingUtilsElement.scrollToElementAndClick(CheckBoxWaitToAppear);

			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Scrolled to and clicked on WHO Benchmarks Label.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.IHRCapacties)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on IHR Capacities.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NextInPage3)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Next in Page 3.");
			Thread.sleep(2000);

			// Page4
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ReferenceLink)))
					.sendKeys(NOK_Management_TestData.ReferenceLink);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Entered Reference Link.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AddAuthor)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Add Author.");

			Scrolltypes.setDriver(driver);
			Scrolltypes.scrollToBottom();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Scrolled to bottom.");

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AuthorName)))
					.sendKeys(NOK_Management_TestData.AuthorName);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Entered Author Name.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AuthorTitle)))
					.sendKeys(NOK_Management_TestData.AuthorTitle);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Entered Author Title.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AuthorCountry)))
					.click();
			Select objSelect = new Select(driver.findElement(By.xpath(NOK_Management_Locators.AuthorCountry)));
			objSelect.selectByVisibleText("India");
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Selected Author Country as India.");

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Year)))
					.sendKeys(NOK_Management_TestData.Year);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Entered Year.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.DatePickerLabel)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Date Picker Label.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Date))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Date.");
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Dismissed Date Picker.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Date)))
					.sendKeys(NOK_Management_TestData.StartDate);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Entered Start Date.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.SaveAndSubmit)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Save and Submit.");

		} catch (Exception e) {
			ExtentDemo.logStatusWithScreenshot(LogStatus.FAIL, "NOK creation failed: " + e.getMessage());
		} finally {
			ExtentDemo.endReport();
		}
		Thread.sleep(3000);
	}

	public void DraftFromEditPage() throws Exception {
		ExtentDemo.startReport();
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Menu_NOK_Management))).isEnabled();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Verified Menu NOK Management is visible and enabled.");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Menu_NOK_Management))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Menu NOK Management.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Draft))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Draft.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ThreeDots)))
					.isDisplayed();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Verified Three Dots is displayed.");
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ThreeDots)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Three Dots.");
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Edit))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Edit.");

			Scrolltypes.setDriver(driver);
			Scrolltypes.scrollToBottom();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Scrolled to bottom.");

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NextInPage1)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Next in Page 1.");

			File_Upload fileUploader = new File_Upload();
			WebElement fileInputElement = driver.findElement(By.xpath(NOK_Management_Locators.AddNoKThumbnail));
			fileUploader.uploadImage(fileInputElement, "Image.jpg");
			Thread.sleep(10000);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Uploaded Image.jpg.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NOKFormat)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on NOK Format.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Audio))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Audio.");
			File_Upload audioFileUploader = new File_Upload();
			WebElement audioFileInputElement = driver.findElement(By.xpath(NOK_Management_Locators.VideoUPloadFile));
			audioFileUploader.uploadImage(audioFileInputElement, "Audio.mp3");
			Thread.sleep(10000);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Uploaded Audio.mp3.");

			Scrolltypes.setDriver(driver);
			Scrolltypes.scrollToBottom();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Scrolled to bottom.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Transcript)))
					.sendKeys(NOK_Management_TestData.Transcript);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Entered Transcript.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NextInPage2)))
					.isEnabled();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NextInPage2)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Next in Page 2.");
			Thread.sleep(3000);

			// Page 3
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Hazard))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Hazard.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.HazardTypes)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Hazard Types.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.DropDownOptions)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Drop Down Options.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.HazardClusters)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Hazard Clusters.");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.HazardClustersOption))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Hazard Clusters Option.");
			Scrolltypes scrollDown = new Scrolltypes();
			WebElement elementToClick1 = driver
					.findElement(By.xpath(NOK_Management_Locators.SpecificHazardMeteorimpact));
			scrollDown.scrollToElementAndClick(elementToClick1);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO,
					"Scrolled to and clicked on Specific Hazard Meteor Impact.");
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.IHRTechnicalAreas)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on IHR Technical Areas.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Pillar))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Pillar.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.DropDownOptions)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Drop Down Options.");
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.TAB);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Sent TAB key.");
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.IHRTechnicalArea)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on IHR Technical Area.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.DropDownOptions)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Drop Down Options.");

			driver.findElement(By.cssSelector("body")).sendKeys(Keys.TAB);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Sent TAB key.");
			Scrolltypes scrollToIndicator = new Scrolltypes();
			WebElement waitForElement = driver.findElement(By.xpath(NOK_Management_Locators.IndicatorsOptions));
			scrollToIndicator.scrollToElementAndClick(waitForElement);

			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Scrolled to and clicked on Indicators Options.");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.WHOBENCHMARKFORIHRCAPACITIES)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on WHO BENCHMARK FOR IHR CAPACITIES.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.WHOBenchmarks)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on WHO Benchmarks.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.DropDownOptions)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Drop Down Options.");
			Scrolltypes scrollingUtilsElement = new Scrolltypes();
			WebElement checkBoxWaitToAppear = driver.findElement(By.xpath(NOK_Management_Locators.WHOBenchmarksLabel));
			scrollingUtilsElement.scrollToElementAndClick(checkBoxWaitToAppear);

			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Scrolled to and clicked on WHO Benchmarks Label.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.IHRCapacties)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on IHR Capacities.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NextInPage3)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Next in Page 3.");
			Thread.sleep(2000);

			// Page4
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ReferenceLink)))
					.sendKeys(NOK_Management_TestData.ReferenceLink);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Entered Reference Link.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AddAuthor)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Add Author.");
			Scrolltypes.setDriver(driver);
			Scrolltypes.scrollToBottom();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Scrolled to bottom.");

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AuthorName)))
					.sendKeys(NOK_Management_TestData.AuthorName);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Entered Author Name.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AuthorTitle)))
					.sendKeys(NOK_Management_TestData.AuthorTitle);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Entered Author Title.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AuthorCountry)))
					.click();
			Select objSelect = new Select(driver.findElement(By.xpath(NOK_Management_Locators.AuthorCountry)));
			objSelect.selectByVisibleText("India");
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Selected Author Country as India.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Year)))
					.sendKeys(NOK_Management_TestData.Year);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Entered Year.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.DatePickerLabel)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Date Picker Label.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Date))).click();
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Selected Date and escaped date picker.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Date)))
					.sendKeys(NOK_Management_TestData.StartDate);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Entered Start Date.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.SaveAndSubmit)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked Save and Submit.");
		} catch (Exception e) {
			ExtentDemo.logStatusWithScreenshot(LogStatus.FAIL, "NOK creation failed: " + e.getMessage());
		} finally {
			ExtentDemo.endReport();
		}
		Thread.sleep(3000);
	}

	public void TestCaseFinished() {
		System.out.println("Your TestCase Hase Been Passed");
	}

	public void CheckIn() throws Exception {
		ExtentDemo.startReport();
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Menu_NOK_Management))).isEnabled();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Verified Menu NOK Management is visible and enabled.");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Menu_NOK_Management))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Verified Menu NOK Management is visible and clicked.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Submitted)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Submitted.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ThreeDots)))
					.isDisplayed();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Verified Three Dots icon is displayed.");
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ThreeDots)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Three Dots icon.");
			Thread.sleep(2000);
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.CheckINFromSubmitted))).isEnabled();
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.CheckINFromSubmitted))).click();
			Thread.sleep(5000);
			driver.switchTo().alert().accept();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Submit button clicked on Popup");

		} catch (Exception e) {
			ExtentDemo.logStatusWithScreenshot(LogStatus.FAIL, "NOK creation failed: " + e.getMessage());
		} finally {
			ExtentDemo.endReport();
		}
		Thread.sleep(5000);
	}

	public void CHeckInFromPulish() throws Exception {
		ExtentDemo.startReport();
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Menu_NOK_Management))).isEnabled();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Verified Menu NOK Management is visible and enabled.");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Menu_NOK_Management))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Menu NOK Management.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Published)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Published.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ThreeDots)))
					.isDisplayed();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Verified Three Dots icon is displayed.");
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ThreeDots)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Three Dots icon.");
			Thread.sleep(2000);
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.CheckINFromSubmitted))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Check-IN From Submitted.");
			Thread.sleep(8000);
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Menu_NOK_Management))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Menu NOK Management again.");
		} catch (Exception e) {
			ExtentDemo.logStatusWithScreenshot(LogStatus.FAIL, "NOK creation failed: " + e.getMessage());
		} finally {
			ExtentDemo.endReport();
		}
		Thread.sleep(2000);

	}

	public void AssignReviewer() throws Exception {
		ExtentDemo.startReport();
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Menu_NOK_Management))).isEnabled();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Verified Menu NOK Management is visible and enabled.");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Menu_NOK_Management))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Menu NOK Management.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.CheckIN)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Check-IN.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ThreeDots)))
					.isDisplayed();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Verified Three Dots icon is displayed.");
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ThreeDots)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Three Dots icon.");
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AssignReviewer)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Assign Reviewer.");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AssignReviewerAssign))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Assign Reviewer Assign.");
		} catch (Exception e) {
			ExtentDemo.logStatusWithScreenshot(LogStatus.FAIL, "NOK creation failed: " + e.getMessage());
		} finally {
			ExtentDemo.endReport();
		}
		Thread.sleep(5000);
	}

	public void Publish() throws Exception {
		ExtentDemo.startReport();
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Menu_NOK_Management))).isEnabled();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Verified Menu NOK Management is visible and enabled.");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Menu_NOK_Management))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Menu NOK Management.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.CheckIN)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Check-IN.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ThreeDots)))
					.isDisplayed();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Verified Three Dots icon is displayed.");
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ThreeDots)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Three Dots icon.");
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Publish)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Publish.");
			driver.switchTo().alert().accept();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Accepted the alert.");
		} catch (Exception e) {
			ExtentDemo.logStatusWithScreenshot(LogStatus.FAIL, "NOK creation failed: " + e.getMessage());
		} finally {
			ExtentDemo.endReport();
		}
		Thread.sleep(5000);
	}

	public void Return() throws Exception {
		ExtentDemo.startReport();
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Menu_NOK_Management))).isEnabled();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Verified Menu NOK Management is visible and enabled.");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Menu_NOK_Management))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Menu NOK Management.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.CheckIN)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Check-IN.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ThreeDots)))
					.isDisplayed();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Verified Three Dots icon is displayed.");
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ThreeDots)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Three Dots icon.");
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Return))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Return.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ReturnReason)))
					.sendKeys(NOK_Management_TestData.ReturnReason);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Entered Return Reason.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ReturnConfirm)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Confirm Return.");
		} catch (Exception e) {
			ExtentDemo.logStatusWithScreenshot(LogStatus.FAIL, "NOK creation failed: " + e.getMessage());
		} finally {
			ExtentDemo.endReport();
		}
		Thread.sleep(5000);
	}

	public void MoveToDraft() throws Exception {
		ExtentDemo.startReport();
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Menu_NOK_Management))).isEnabled();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Verified Menu NOK Management is visible and enabled.");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Menu_NOK_Management))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Menu NOK Management.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.CheckIN)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Check-IN.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ThreeDots)))
					.isDisplayed();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Verified Three Dots icon is displayed.");
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ThreeDots)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Three Dots icon.");
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.MoveToDraft)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Move to Draft.");
			driver.switchTo().alert().accept();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Accepted the alert after moving to draft.");
		} catch (Exception e) {
			ExtentDemo.logStatusWithScreenshot(LogStatus.FAIL, "NOK creation failed: " + e.getMessage());
		} finally {
			ExtentDemo.endReport();
		}
		Thread.sleep(5000);
	}

	public void Archive() throws Exception {
		ExtentDemo.startReport();
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Menu_NOK_Management))).isEnabled();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Verified Menu NOK Management is visible and enabled.");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Menu_NOK_Management))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Menu NOK Management.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.CheckIN)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Check-IN.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ThreeDots)))
					.isDisplayed();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Verified Three Dots icon is displayed.");
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ThreeDots)))
					.click();
			Thread.sleep(2000);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Three Dots icon.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Archive)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Archive option.");
		} catch (Exception e) {
			ExtentDemo.logStatusWithScreenshot(LogStatus.FAIL, "NOK creation failed: " + e.getMessage());
		} finally {
			ExtentDemo.endReport();
		}
		Thread.sleep(5000);
	}

	public void Reject() throws Exception {
		ExtentDemo.startReport();
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Menu_NOK_Management))).isEnabled();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Verified Menu NOK Management is visible and enabled.");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Menu_NOK_Management))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Menu NOK Management.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.CheckIN)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Check-IN.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ThreeDots)))
					.isDisplayed();
			Thread.sleep(2000);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Verified Three Dots icon is displayed.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ThreeDots)))
					.click();
			Thread.sleep(2000);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Three Dots icon.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Reject))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Reject option.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.RejectReason)))
					.sendKeys(NOK_Management_TestData.RejectReason);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Entered Reject Reason.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.RejectConfirm)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Confirmed Reject.");
		} catch (Exception e) {
			ExtentDemo.logStatusWithScreenshot(LogStatus.FAIL, "NOK creation failed: " + e.getMessage());
		} finally {
			ExtentDemo.endReport();
		}
		Thread.sleep(5000);
	}

	public void Recall() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		ExtentDemo.startReport();
		try {
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Menu_NOK_Management))).isEnabled();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Verified Menu NOK Management is visible and enabled.");

			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Menu_NOK_Management))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Menu NOK Management.");

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ReCall))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on ReCall.");

			String gettitle = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(NOK_Management_Locators.Fetch_Title_From_Nugget_List)))
					.getText();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Fetch Title of Nugget.");

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ThreeDots)))
					.isDisplayed();
			Thread.sleep(2000);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Verified Three Dots icon is displayed.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ThreeDots)))
					.click();
			Thread.sleep(2000);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Three Dots icon.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ApproveRecall)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Approve Recall.");
			Thread.sleep(2000);
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.YesApproveRecall)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Cicked on Yes, Approve Recall.");
			Thread.sleep(5000);

			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Menu_NOK_Management))).isEnabled();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Verified Menu NOK Management is visible and enabled.");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Menu_NOK_Management))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Menu NOK Management.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Draft))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Check-IN.");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Search_From_Nugget_List)))
					.sendKeys(gettitle);
			Thread.sleep(3000);

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ThreeDots)))
					.isDisplayed();
			Thread.sleep(2000);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Verified Three Dots icon is displayed.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ThreeDots)))
					.click();
			Thread.sleep(2000);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Three Dots icon.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Edit))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Edit option.");
			Scrolltypes.setDriver(driver);
			Scrolltypes.scrollToBottom();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Scrolled to bottom.");

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NextInPage1)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Next in Page 1.");
			Scrolltypes.setDriver(driver);
			Scrolltypes.scrollToBottom();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Scrolled to bottom.");

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NextInPage2)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Next in Page 2.");
			Scrolltypes.setDriver(driver);
			Scrolltypes.scrollToBottom();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Scrolled to bottom.");

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NextInPage3)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Next in Page 3.");
			Scrolltypes.setDriver(driver);
			Scrolltypes.scrollToBottom();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Scrolled to bottom.");

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.SaveAndSubmit)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Submitted NOK successfully");
			Thread.sleep(4000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Submitted)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Submitted Page Opened");

			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Search_From_Nugget_List)))
					.sendKeys(gettitle);
			Thread.sleep(3000);

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ThreeDots)))
					.isDisplayed();
			Thread.sleep(2000);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Verified Three Dots icon is displayed.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ThreeDots)))
					.click();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AssignReviewer)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Assign Reviewer.");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AssignReviewerinput)))
					.sendKeys(NOK_Management_TestData.Reviewer);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Entered Reviewer.");
			Thread.sleep(3000);
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AssignReviewerdropdownOption)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Reviewer Selected from Drop-Down.");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AssignReviewerAssign))).click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Assign Reviewer Assign Button.");
			Thread.sleep(3000);

			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Search_From_Nugget_List)))
					.sendKeys(gettitle);
			Thread.sleep(3000);

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ThreeDots)))
					.isDisplayed();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Verified Three Dots icon is displayed.");
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ThreeDots)))
					.click();
			Thread.sleep(2000);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Three Dots icon.");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.CheckINFromSubmitted))).click();
			Thread.sleep(4000);
			driver.switchTo().alert().accept();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Ok button on PopUp");
			Thread.sleep(2000);

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.CheckIN)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Check-IN Page.");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Search_From_Nugget_List)))
					.sendKeys(gettitle);
			Thread.sleep(3000);

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ThreeDots)))
					.isDisplayed();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Verified Three Dots icon is displayed.");
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ThreeDots)))
					.click();
			Thread.sleep(2000);
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Three Dots icon.");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Publish)))
					.click();
			driver.switchTo().alert().accept();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Ok button on PopUp");
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Published)))
					.click();
			ExtentDemo.logStatusWithScreenshot(LogStatus.INFO, "Clicked on Published Page.");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Search_From_Nugget_List)))
					.sendKeys(gettitle);

		} catch (Exception e) {
			ExtentDemo.logStatusWithScreenshot(LogStatus.FAIL, "NOK creation failed: " + e.getMessage());
		} finally {
			ExtentDemo.endReport();
		}
	}
}
