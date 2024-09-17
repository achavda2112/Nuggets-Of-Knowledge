package nOK_Management;

public class NOK_Management_Locators {
	
	public static final String Menu_NOK_Management = "//span[contains(text(),'NoK Management')]";
	
	//page1
	public static final String Search_From_Nugget_List = "//input[@id='nuggetList_Search']";
	public static final String Fetch_Title_From_Nugget_List = "tbody tr:nth-child(1) td:nth-child(1)";
	public static final String All = "//a[@id='nuggetList_All']";
	public static final String Edit = "(//*[contains(text(),'Edit')])[1]";
	public static final String Draft = "//a[@id='nuggetList_Active']";
	public static final String Submitted = "//a[@id='nuggetList_Submitted']";
	public static final String CheckIN = "//a[@id='nuggetList_CheckIn']";
	public static final String CheckINFromSubmitted = "//a[@id='nuggetList_CheckIn_0']";
	public static final String AssignReviewer = "//a[@id='nuggetList_AssignReviewer_0']";
	public static final String AssignReviewerAssign = "//button[@id='nuggetList_RModalSubmitOperation0']";
	public static final String AssignReviewerinput = "//ng-select[@name='NuggetReviewers']//input";
	public static final String AssignReviewerdropdownOption = "//ng-dropdown-panel[@aria-label='Options list']";
	public static final String Returned = "//a[@id='nuggetList_Returned']";
	public static final String Rejected = "//a[@id='nuggetList_Rejected']";
	public static final String Published = "//a[@id='nuggetList_Published']";
	public static final String Archived = "//a[@id='nuggetList_Archived']";
	public static final String ReCall = "//a[@id='nuggetList_Recall']";
	public static final String Publish = "//a[@id='nuggetList_Publish_0']";
	public static final String Reject = "//a[@id='nuggetList_Reject_0']";
	public static final String RejectReason = "//textarea[@name='RejectionReason']";
	public static final String RejectConfirm = "(//button[@id='nuggetList_RModalClose2'])[2]";
	public static final String Return = "//a[@id='nuggetList_Return_0']";
	public static final String ReturnConfirm = "(//button[@id='nuggetList_RModalClose2'])[2]";
	public static final String ReturnReason = "//textarea[@name='RejectionReason']";
	public static final String MoveToDraft = "//a[@id='nuggetList_MoveDraft_0']";
	public static final String Archive = "//a[@id='nuggetList_Archive_0']";

	
	public static final String ThreeDots = "(//i[@id='dropdownMenuButton1'])[1]";
	public static final String ApproveRecall = "//a[@id='nuggetList_RRecall_0']";
	public static final String RejectRecall = "//a[@id='nuggetList_Reject_0']";
	public static final String YesApproveRecall = "//button[@id='nuggetList_ARModalSubmit']";
	public static final String CancelApproveRecall = "//a[@id='nuggetList_ARModalClose2']";
	public static final String ConfirmRejectRecall = "//button[@id='nuggetList_RRModalSubmit']";
	public static final String CancelRejectRecall = "//button[@id='nuggetList_RRModalClose2']";
	public static final String PaginationNext = "//button[@id='tablePagination_Next']";
	public static final String PaginationLast = "//button[@id='tablePagination_Last']";
	public static final String PaginationShowAll = "//button[@id='tablePagination_ShowAll']";
	
	public static final String AddNEWNOK = "//button[@id='nuggetList_AddNok']";
	public static final String NuggetTitle = "//input[@id='txtNuggetTitle']";
	public static final String NuggetSubTitle = "//input[@id='txtSubTitle']";
	public static final String ShortDescription = "//textarea[@name='NuggetShortDescription']";
	public static final String NuggetTags = "//ng-select[@name='NuggetTags']//input";
	public static final String NuggetOptions = "//div[@role='option']";
	public static final String NuggetKeyWords = "//ng-select[@name='NuggetKeywords']//input";
	public static final String NoKSourceDropdown = "//ng-select[@name='NuggetSources']";
	public static final String NoKSourceOptions = "(//div[@role='option'])[2]";
	public static final String NoKSourceSelectAll = "//input[@id='select-all-noksources']";
	public static final String PopulationType = "//ng-select[@name='NuggetPersons']";
	public static final String PopulationTypeOptions = "(//div[@role='option'])[2]";
	public static final String PopulationTypeSelectAll = "//input[@id='select-all-populationType']";
	public static final String RegionSelectAll = "//input[@id='select-all-regions']";
	public static final String Region = "//ng-select[@name='NuggetRegions']";
	public static final String RegionOptions = "(//div[@role='option'])[3]";
	public static final String CountrySelectAll = "//input[@id='select-all-countries']";
	public static final String Country = "//ng-select[@name='NuggetCountriess']";
	public static final String CountryOptions = "(//div[@role='option'])[4]";
	public static final String StartDateDatePicker = "//input[@name='NuggetStartDate']";
	public static final String DatePickerMonthChange = "(//button[@type='button'])[11]";
	public static final String DatePickerJanuaryMonth = "//span[contains(text(),'January')]";
	public static final String DatePickerLabel = "(//label[contains(text(),'Date')])[3]";
	public static final String DatePickercurrentYear = "//span[contains(text(),'2024')]";
	public static final String EndDateLabel = "//label[contains(text(),'End Date')] ";
	public static final String DatePickerYearChange = "(//button[@type='button'])[12]";
	public static final String DatePickerDateChange = "//span[contains(text(),'21')]";
	public static final String CountryLabel = "//label[contains(text(),'Country')]";
	public static final String EndDateDatePicker = "//input[@name='NuggetEndDate']";
	public static final String EventClarification = "//select[@name='NuggetEndDateStatus']";
	public static final String EventClarificationOptions = "//Option[contains(text(),'End date unknown')]";
	public static final String NextInPage1 = "//button[@id='createNok_ValidateStep1']";

	//page2
	public static final String AddNoKThumbnail = "(//input[@type='file'])[1]";
	public static final String NOKFormat = "//select[@name='NuggetFormatType']";
	public static final String Audio = "//option[contains(text(),'Audio')]";
	public static final String Video = "//option[contains(text(),'Video')]";
	public static final String Text = "//option[contains(text(),'Text')]";
	public static final String VideoUPloadFile = "(//input[@type='file'])[2]";
	public static final String Transcript = "//textarea[@name='NuggetTranscript']";
	public static final String TextAreaNOKDescription = "//textarea[@name='NuggetDescription']";
	public static final String NOKDescriptionTypeDropdown = "//select[@name='NuggetDescriptionLineOrderType']";
	public static final String AddLine = "//button[@id='createNok_AddDescriptionLine']";
	public static final String Line1 = "//textarea[@ng-reflect-name='NuggetDscriptonLinedescline-17']";
	public static final String SublineLine1 = "//textarea[@ng-reflect-name='NuggetchildLinechildline-17236']";
	public static final String RemoveLine = "//button[@id='createNok_RemoveDescriptionLine']";
	public static final String RemoveSubLine = "//button[@id='createNok_RemoveChildDescriptionLine']";
	public static final String AddSubline = "//a[@id='createNok_AddChildDescriptionLine']";
	public static final String BackButton = "//button[@id='createNok_Step1Back']";
	public static final String NextInPage2 = "//button[@id='createNok_Step2Next']";
	
	//page3
	public static final String Hazard = "//h2[@id='headingOne']//button";
	public static final String HazardTypes = "//ng-select[@name='NuggetHazardTypes']";
	public static final String DropDownOptions = "(//div[@role='option'])[2]";
	public static final String HazardClusters = "//ng-select[@name='NuggetHazardClusters']";
	public static final String HazardClustersOption = "(//div[@role='option'])[1]";
	public static final String SpecificHazardAirburst = "//label[contains(text(),'Airburst')]";
	public static final String SpecificHazardMeteorimpact = "//label[contains(text(),'Meteor impact')]";
	public static final String IHRTechnicalAreas  = "//h2[@id='headingTwo']//button";
	public static final String Pillar = "//ng-select[@name='NuggetIHRTechnicalArea']//input";
	public static final String IHRTechnicalArea = "//ng-select[@name='NuggetIHRLevels']//input";
	public static final String IndicatorsOptions = "//label[contains(text(),'Core capacity requirements at all times for poes (airports, ports and ground crossings')]";
	public static final String WHOBENCHMARKFORIHRCAPACITIES  = "//h2[@id='headingThree']//button";
	public static final String WHOBenchmarks = "//ng-select[@name='NuggetIHRCapacities']//input";
	public static final String WHOBenchmarksLabel = "//h5[contains(text(),'WHO Benchmarks')]";
	public static final String IHRCapacties = "//label[contains(text(),' Multisectoral coordination for amr')]";
	public static final String NextInPage3 = "//button[@id='createNok_Step4Next']";
	
	
	//page4
	public static final String ReferenceLink = "//input[@id='txtAuthorReferenceLink']";
	public static final String AddAuthor = "//button[@id='createNok_AddAuthor']";
	public static final String AuthorName = "//input[@placeholder='Author Name']";
	public static final String AuthorTitle = "//input[@placeholder='Author Title']";
	public static final String AuthorCountry = "//label[contains(text(),'Author Country')]/following-sibling::select";
	public static final String Year = "//input[@placeholder='Year']";
	public static final String Date = "//input[@placeholder='Select Date']";
	public static final String DeleteAuthor = "//button[@id='createNok_RemoveAuthor']";
	public static final String DraftNOK = "//button[@id='createNok_SaveDraft']";
	public static final String SaveAndSubmit = "//button[@id='createNok_SubmitNok']";
}
