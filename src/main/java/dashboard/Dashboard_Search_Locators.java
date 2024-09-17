package dashboard;

public class Dashboard_Search_Locators {
	
	public static final String TextDashboard = "//button[contains(text(),'Text')]";
	public static final String Searchbox = "//input[@placeholder='Search NoK...']";
	public static final String SearchOptionFromSuggetionslist = "//div[@id='homeContent_Search0']";
	public static final String BackbuttonfromNOKDetailView = "//button//i[@id='nuggetDetail_Back']";
	public static final String AdvanceSearchFilter = "//div[@id='homeContent_AdvancedFilter']";
	public static final String Filter1HazardType = "(//ng-select[@name='NuggetHazardTypes']//span)[1]";
	public static final String DropDownOption1 = "(//div[@role='option'])[1]";
	public static final String DropDownOption2 = "(//div[@role='option'])[2]";
	public static final String DropDownOption3 = "(//div[@role='option'])[3]";
	public static final String DropDownOption4 = "(//div[@role='option'])[4]";
	public static final String HazardCluster = "(//ng-select[@name='NuggetHazardClusters']//span)[1]";
	public static final String SpecificHazards = "(//ng-select[@name='NuggetHazardValues']//span)[1]";
	public static final String Pillars = "(//ng-select[@name='NuggetIHRTechnicalArea']//span)[1]";
	public static final String SearchButton = "//button[contains(text(),'Search')]";
	public static final String ResultOption1Title = "(//ul[@class='results_covid_list']//h3)[1]";
	public static final String SortBy = "(//div[@id='dropdownMenuButton1'])[1]";
	public static final String NOKType = "(//div[@id='dropdownMenuButton1'])[2]";
	public static final String RecentNOKRadio = "//label[contains(text(),'Recent NoK')]";
	public static final String MostviewedRadio  = "//label[contains(text(),'Most viewed')]";
	public static final String MostSearchedRadio  = "//label[contains(text(),'Most Searched ')]";
	public static final String ClearFilters  = "//a[@id='homeContent_ClearSortBy']";
	public static final String ApplyFilters  = "//button[@id='homeContent_ApplySortBy']";
	public static final String TextRadio  = "//label[contains(text(),' Text ')]";
	public static final String AudioRadio  = "//label[contains(text(),' Audio ')]";
	public static final String VideoRadio  = "//label[contains(text(),' Video ')]";
	public static final String ClearNOKFilters  = "//a[@id='homeContent_ClearNokBy']";
	public static final String ApplyNOKFilters  = "//button[@id='homeContent_ApplyNokBy']";

	
}
