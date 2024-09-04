package nOK_Management;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import fileUpload.File_Upload;
import scrollfunction.Scrolltypes;
import webDriver.webDriverSetup;

public class NOK_Management_Functions extends webDriverSetup {

	public void addNOK() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Menu_NOK_Management)))
				.isEnabled();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Menu_NOK_Management)))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AddNEWNOK)))
				.isEnabled();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AddNEWNOK))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NuggetTitle)))
				.sendKeys(NOK_Management_TestData.NuggetTitle);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NuggetSubTitle)))
				.sendKeys(NOK_Management_TestData.NuggetSubTitle);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ShortDescription)))
				.sendKeys(NOK_Management_TestData.NuggetShortDiscription);
		Scrolltypes.setDriver(driver);
		Scrolltypes.scrollToBottom();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NuggetTags)))
				.sendKeys(NOK_Management_TestData.Tags);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NuggetOptions)))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NuggetKeyWords)))
				.sendKeys(NOK_Management_TestData.KeyWords);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NuggetOptions)))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NoKSourceDropdown)))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NoKSourceOptions)))
				.click();
//		WebElement NoKSourceDropdownOption = driver.findElement(By.xpath(NOK_Management_Locators.NoKSourceOptions));
//		Select NoKSourceDropdown = new Select(NoKSourceDropdownOption);
//		NoKSourceDropdown.selectByIndex(2);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.PopulationType)))
				.click();
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.PopulationTypeOptions)))
				.click();
//		WebElement PopulationType = driver.findElement(By.xpath(NOK_Management_Locators.PopulationTypeOptions));
//		Select PopulationTypeOption = new Select(PopulationType);
//		PopulationTypeOption.selectByIndex(1);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Region))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.RegionOptions)))
				.click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Region))).click();
//		WebElement Region = driver.findElement(By.xpath(NOK_Management_Locators.RegionOptions));
//		Select RegionOption = new Select(Region);
//		RegionOption.selectByIndex(1);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Country))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.CountryOptions)))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(NOK_Management_Locators.CountryLabel))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.StartDateDatePicker)))
				.click();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.StartDateDatePicker)))
				.sendKeys(NOK_Management_TestData.StartDate);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.EndDateDatePicker)))
				.click();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.EndDateDatePicker)))
				.sendKeys(NOK_Management_TestData.EndDate);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.TAB);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.EndDateLabel)))
				.click();

//		WebElement Country = driver.findElement(By.xpath(NOK_Management_Locators.CountryOptions));
//		Select CountryOption = new Select(Country);
//		CountryOption.selectByIndex(1);
//		Thread.sleep(2000);

//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.EventClarification)))
//				.click();
//		wait.until(ExpectedConditions
//				.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.EventClarificationOptions))).click();
//		WebElement EventClearification = driver
//				.findElement(By.xpath(NOK_Management_Locators.EventClarificationOptions));
//		Select EventClearificationOption = new Select(EventClearification);
//		EventClearificationOption.selectByIndex(1);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NextInPage1)))
				.click();
		Thread.sleep(2000);

		// page 2 Description

		File_Upload fileUploader = new File_Upload();
		WebElement fileInputElement = driver.findElement(By.xpath(NOK_Management_Locators.AddNoKThumbnail));
		fileUploader.uploadImage(fileInputElement, "Image.jpg");
		Thread.sleep(3000);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NOKFormat))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Audio))).click();

		File_Upload audioFileUploader = new File_Upload();
		WebElement audioFileInputElement = driver.findElement(By.xpath(NOK_Management_Locators.VideoUPloadFile));
		audioFileUploader.uploadImage(audioFileInputElement, "Audio.mp3");
		Thread.sleep(3000);
		Scrolltypes.setDriver(driver);
		Scrolltypes.scrollToBottom();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Transcript)))
				.sendKeys(NOK_Management_TestData.Transcript);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NextInPage2)))
				.isEnabled();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NextInPage2)))
				.click();
		Thread.sleep(3000);

		// Page 3
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Hazard))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.HazardTypes)))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.DropDownOptions)))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.HazardClusters)))
				.click();
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.HazardClustersOption)))
				.click();
//		Scrolltypes scrollingUtil = new Scrolltypes();
//		WebElement elementToClick = driver.findElement(By.xpath(NOK_Management_Locators.SpecificHazardAirburst));
//		scrollingUtil.scrollToElementAndClick(elementToClick);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.SpecificHazardAirburst)))
//		.click();

		Scrolltypes ScrollDown = new Scrolltypes();
		WebElement elementToClick1 = driver.findElement(By.xpath(NOK_Management_Locators.SpecificHazardMeteorimpact));
		ScrollDown.scrollToElementAndClick(elementToClick1);

//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.SpecificHazardMeteorimpact)))
//		.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.IHRTechnicalAreas)))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Pillar))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.DropDownOptions)))
				.click();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.TAB);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.IHRTechnicalArea)))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.DropDownOptions)))
				.click();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.TAB);

		Scrolltypes ScrollToIndicator = new Scrolltypes();
		WebElement WaitforElement = driver.findElement(By.xpath(NOK_Management_Locators.IndicatorsOptions));
		ScrollToIndicator.scrollToElementAndClick(WaitforElement);

//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.IndicatorsOptions)))
//		.click();
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.WHOBENCHMARKFORIHRCAPACITIES))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.WHOBenchmarks)))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.DropDownOptions)))
				.click();
		Scrolltypes scrollingUtilsElement = new Scrolltypes();
		WebElement CheckBoxWaitToAppear = driver.findElement(By.xpath(NOK_Management_Locators.WHOBenchmarksLabel));
		scrollingUtilsElement.scrollToElementAndClick(CheckBoxWaitToAppear);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.IHRCapacties)))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NextInPage3)))
				.click();
		Thread.sleep(2000);

		// Page5
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ReferenceLink)))
				.sendKeys(NOK_Management_TestData.ReferenceLink);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AddAuthor))).click();
		Scrolltypes.setDriver(driver);
		Scrolltypes.scrollToBottom();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AuthorName)))
				.sendKeys(NOK_Management_TestData.AuthorName);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AuthorTitle)))
				.sendKeys(NOK_Management_TestData.AuthorTitle);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AuthorCountry)))
				.click();
		Select objSelect = new Select(driver.findElement(By.xpath(NOK_Management_Locators.AuthorCountry)));
		objSelect.selectByVisibleText("India");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Year)))
				.sendKeys(NOK_Management_TestData.Year);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Date))).click();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Date)))
				.sendKeys(NOK_Management_TestData.StartDate);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.SaveAndSubmit)))
				.click();
		Thread.sleep(3000);
	}

	public void DraftNOK() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Menu_NOK_Management)))
				.isEnabled();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Menu_NOK_Management)))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AddNEWNOK)))
				.isEnabled();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AddNEWNOK))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NuggetTitle)))
				.sendKeys(NOK_Management_TestData.NuggetTitle);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NuggetSubTitle)))
				.sendKeys(NOK_Management_TestData.NuggetSubTitle);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ShortDescription)))
				.sendKeys(NOK_Management_TestData.NuggetShortDiscription);
		Scrolltypes.setDriver(driver);
		Scrolltypes.scrollToBottom();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NuggetTags)))
				.sendKeys(NOK_Management_TestData.Tags);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NuggetOptions)))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NuggetKeyWords)))
				.sendKeys(NOK_Management_TestData.KeyWords);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NuggetOptions)))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NoKSourceDropdown)))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NoKSourceOptions)))
				.click();
//		WebElement NoKSourceDropdownOption = driver.findElement(By.xpath(NOK_Management_Locators.NoKSourceOptions));
//		Select NoKSourceDropdown = new Select(NoKSourceDropdownOption);
//		NoKSourceDropdown.selectByIndex(2);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.PopulationType)))
				.click();
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.PopulationTypeOptions)))
				.click();
//		WebElement PopulationType = driver.findElement(By.xpath(NOK_Management_Locators.PopulationTypeOptions));
//		Select PopulationTypeOption = new Select(PopulationType);
//		PopulationTypeOption.selectByIndex(1);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Region))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.RegionOptions)))
				.click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Region))).click();
//		WebElement Region = driver.findElement(By.xpath(NOK_Management_Locators.RegionOptions));
//		Select RegionOption = new Select(Region);
//		RegionOption.selectByIndex(1);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Country))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.CountryOptions)))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(NOK_Management_Locators.CountryLabel))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.StartDateDatePicker)))
				.click();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.StartDateDatePicker)))
				.sendKeys(NOK_Management_TestData.StartDate);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.EndDateDatePicker)))
				.click();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.EndDateDatePicker)))
				.sendKeys(NOK_Management_TestData.EndDate);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.TAB);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.EndDateLabel)))
				.click();

//		WebElement Country = driver.findElement(By.xpath(NOK_Management_Locators.CountryOptions));
//		Select CountryOption = new Select(Country);
//		CountryOption.selectByIndex(1);
//		Thread.sleep(2000);

//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.EventClarification)))
//				.click();
//		wait.until(ExpectedConditions
//				.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.EventClarificationOptions))).click();
//		WebElement EventClearification = driver
//				.findElement(By.xpath(NOK_Management_Locators.EventClarificationOptions));
//		Select EventClearificationOption = new Select(EventClearification);
//		EventClearificationOption.selectByIndex(1);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NextInPage1)))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NextInPage2)))
				.isEnabled();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NextInPage2)))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NextInPage3)))
				.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.DraftNOK))).click();
		Thread.sleep(2000);
	}

	public void DraftEdit() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Menu_NOK_Management)))
				.isEnabled();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Menu_NOK_Management)))
				.click();
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Search_From_Nugget_List)))
				.sendKeys(NOK_Management_TestData.NuggetTitle);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ThreeDots)))
				.isDisplayed();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ThreeDots))).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Edit))).click();
		Scrolltypes.setDriver(driver);
		Scrolltypes.scrollToBottom();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NextInPage1)))
				.click();
		File_Upload fileUploader = new File_Upload();
		WebElement fileInputElement = driver.findElement(By.xpath(NOK_Management_Locators.AddNoKThumbnail));
		fileUploader.uploadImage(fileInputElement, "Image.jpg");
		Thread.sleep(3000);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NOKFormat))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Audio))).click();

		File_Upload audioFileUploader = new File_Upload();
		WebElement audioFileInputElement = driver.findElement(By.xpath(NOK_Management_Locators.VideoUPloadFile));
		audioFileUploader.uploadImage(audioFileInputElement, "Audio.mp3");
		Thread.sleep(3000);
		Scrolltypes.setDriver(driver);
		Scrolltypes.scrollToBottom();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Transcript)))
				.sendKeys(NOK_Management_TestData.Transcript);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NextInPage2)))
				.isEnabled();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NextInPage2)))
				.click();
		Thread.sleep(3000);

		// Page 3
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Hazard))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.HazardTypes)))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.DropDownOptions)))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.HazardClusters)))
				.click();
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.HazardClustersOption)))
				.click();
//		Scrolltypes scrollingUtil = new Scrolltypes();
//		WebElement elementToClick = driver.findElement(By.xpath(NOK_Management_Locators.SpecificHazardAirburst));
//		scrollingUtil.scrollToElementAndClick(elementToClick);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.SpecificHazardAirburst)))
//		.click();

		Scrolltypes ScrollDown = new Scrolltypes();
		WebElement elementToClick1 = driver.findElement(By.xpath(NOK_Management_Locators.SpecificHazardMeteorimpact));
		ScrollDown.scrollToElementAndClick(elementToClick1);

//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.SpecificHazardMeteorimpact)))
//		.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.IHRTechnicalAreas)))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Pillar))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.DropDownOptions)))
				.click();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.TAB);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.IHRTechnicalArea)))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.DropDownOptions)))
				.click();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.TAB);

		Scrolltypes ScrollToIndicator = new Scrolltypes();
		WebElement WaitforElement = driver.findElement(By.xpath(NOK_Management_Locators.IndicatorsOptions));
		ScrollToIndicator.scrollToElementAndClick(WaitforElement);

//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.IndicatorsOptions)))
//		.click();
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.WHOBENCHMARKFORIHRCAPACITIES))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.WHOBenchmarks)))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.DropDownOptions)))
				.click();
		Scrolltypes scrollingUtilsElement = new Scrolltypes();
		WebElement CheckBoxWaitToAppear = driver.findElement(By.xpath(NOK_Management_Locators.WHOBenchmarksLabel));
		scrollingUtilsElement.scrollToElementAndClick(CheckBoxWaitToAppear);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.IHRCapacties)))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NextInPage3)))
				.click();
		Thread.sleep(2000);

		// Page4
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ReferenceLink)))
				.sendKeys(NOK_Management_TestData.ReferenceLink);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AddAuthor))).click();
		Scrolltypes.setDriver(driver);
		Scrolltypes.scrollToBottom();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AuthorName)))
				.sendKeys(NOK_Management_TestData.AuthorName);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AuthorTitle)))
				.sendKeys(NOK_Management_TestData.AuthorTitle);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AuthorCountry)))
				.click();
		Select objSelect = new Select(driver.findElement(By.xpath(NOK_Management_Locators.AuthorCountry)));
		objSelect.selectByVisibleText("India");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Year)))
				.sendKeys(NOK_Management_TestData.Year);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.DatePickerLabel)))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Date))).click();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Date)))
				.sendKeys(NOK_Management_TestData.StartDate);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.SaveAndSubmit)))
				.click();
		Thread.sleep(3000);
	}

	public void DraftFromEditPage() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Menu_NOK_Management)))
				.isEnabled();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Menu_NOK_Management)))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Draft))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ThreeDots)))
				.isDisplayed();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ThreeDots))).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Edit))).click();
		Scrolltypes.setDriver(driver);
		Scrolltypes.scrollToBottom();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NextInPage1)))
				.click();
		File_Upload fileUploader = new File_Upload();
		WebElement fileInputElement = driver.findElement(By.xpath(NOK_Management_Locators.AddNoKThumbnail));
		fileUploader.uploadImage(fileInputElement, "Image.jpg");
		Thread.sleep(10000);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NOKFormat))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Audio))).click();

		File_Upload audioFileUploader = new File_Upload();
		WebElement audioFileInputElement = driver.findElement(By.xpath(NOK_Management_Locators.VideoUPloadFile));
		audioFileUploader.uploadImage(audioFileInputElement, "Audio.mp3");
		Thread.sleep(10000);
		Scrolltypes.setDriver(driver);
		Scrolltypes.scrollToBottom();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Transcript)))
				.sendKeys(NOK_Management_TestData.Transcript);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NextInPage2)))
				.isEnabled();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NextInPage2)))
				.click();
		Thread.sleep(3000);

		// Page 3
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Hazard))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.HazardTypes)))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.DropDownOptions)))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.HazardClusters)))
				.click();
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.HazardClustersOption)))
				.click();
//		Scrolltypes scrollingUtil = new Scrolltypes();
//		WebElement elementToClick = driver.findElement(By.xpath(NOK_Management_Locators.SpecificHazardAirburst));
//		scrollingUtil.scrollToElementAndClick(elementToClick);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.SpecificHazardAirburst)))
//		.click();

		Scrolltypes ScrollDown = new Scrolltypes();
		WebElement elementToClick1 = driver.findElement(By.xpath(NOK_Management_Locators.SpecificHazardMeteorimpact));
		ScrollDown.scrollToElementAndClick(elementToClick1);

//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.SpecificHazardMeteorimpact)))
//		.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.IHRTechnicalAreas)))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Pillar))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.DropDownOptions)))
				.click();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.TAB);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.IHRTechnicalArea)))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.DropDownOptions)))
				.click();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.TAB);

		Scrolltypes ScrollToIndicator = new Scrolltypes();
		WebElement WaitforElement = driver.findElement(By.xpath(NOK_Management_Locators.IndicatorsOptions));
		ScrollToIndicator.scrollToElementAndClick(WaitforElement);

//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.IndicatorsOptions)))
//		.click();
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.WHOBENCHMARKFORIHRCAPACITIES))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.WHOBenchmarks)))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.DropDownOptions)))
				.click();
		Scrolltypes scrollingUtilsElement = new Scrolltypes();
		WebElement CheckBoxWaitToAppear = driver.findElement(By.xpath(NOK_Management_Locators.WHOBenchmarksLabel));
		scrollingUtilsElement.scrollToElementAndClick(CheckBoxWaitToAppear);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.IHRCapacties)))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.NextInPage3)))
				.click();
		Thread.sleep(2000);

		// Page4
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ReferenceLink)))
				.sendKeys(NOK_Management_TestData.ReferenceLink);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AddAuthor))).click();
		Scrolltypes.setDriver(driver);
		Scrolltypes.scrollToBottom();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AuthorName)))
				.sendKeys(NOK_Management_TestData.AuthorName);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AuthorTitle)))
				.sendKeys(NOK_Management_TestData.AuthorTitle);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.AuthorCountry)))
				.click();
		Select objSelect = new Select(driver.findElement(By.xpath(NOK_Management_Locators.AuthorCountry)));
		objSelect.selectByVisibleText("India");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Year)))
				.sendKeys(NOK_Management_TestData.Year);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.DatePickerLabel)))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Date))).click();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Date)))
				.sendKeys(NOK_Management_TestData.StartDate);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.SaveAndSubmit)))
				.click();
		Thread.sleep(3000);
	}

	public void TestCaseFinished() {
		System.out.println("Your TestCase Hase Been Passed");
	}

	public void CheckIn() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.Submitted))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ThreeDots)))
				.isDisplayed();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.ThreeDots))).click();
		Thread.sleep(2000);
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(NOK_Management_Locators.CheckINFromSubmitted)))
				.click();
	}

}
