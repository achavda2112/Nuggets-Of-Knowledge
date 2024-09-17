package user_Management;

public class User_Management_Locators {
		
		public static final String Menu_USER_Management = "//span[contains(text(),' User Management')]";
		
		public static final String AddUser = "//button[@id='userManagement_AddUser']";
		public static final String FirstName = "//input[@id = 'firstname']";
		public static final String LastName = "//input[@id = 'lastname']";
		public static final String Email = "//input[@id = 'email']";
		public static final String JobTitle = "//input[@id = 'jobtitle']";
		public static final String Institution = "//input[@id = 'institution']";
		public static final String Affiliation = "//input[@id = 'affiliation']";	
		public static final String Country = "//select[@formcontrolname = 'countryId']";	
		public static final String ReasonforAccess = "//textarea[@id='accessReason']";
		public static final String AddUserButton = "//button[@type='submit']";
		public static final String AddUserCrossIcon = "//div[@id='addUserBack']";
		
		
		public static final String Search_From_User_List = "//input[@id='userManagement_search']";
		public static final String DropDownFilter = "//select[@id='roleFilter']";
		public static final String ClearButton = "//button[@id='userManagement_ClearRoleFilter']";
		public static final String ThreeDots = "(//i[@id='dropdownMenuButton1'])[1]";
		public static final String UserEdit = "//a[@id='userManagement_EditUser0']";
		
		public static final String RecieveEmails = "//input[@id='receiveEmails']";
		public static final String Role = "//select[@formcontrolname='roleId']";
		public static final String CrossIcon = "//i[@id='editUserBack']";
		public static final String DeActivateUser = "//a[@id='userManagement_DeactivateUser0']";
		public static final String DeActivateUserConfirmation = "//button[@id='userManagement_SubmitModal']";
		public static final String DeleteUser = "//a[@id='userManagement_DeleteUser0']";
		public static final String DeleteUserConfirmation = "//button[@id='userManagement_SubmitModal']";

}
