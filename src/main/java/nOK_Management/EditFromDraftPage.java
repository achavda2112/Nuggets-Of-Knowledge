package nOK_Management;

import org.openqa.selenium.WebDriver;

import login.login;
import login.login_Credentials;
import webDriver.webDriverSetup;

public class EditFromDraftPage extends webDriverSetup{
		
		 public static void main(String[] args) throws Exception{
		 WebDriver driver = getDriver();
		 NOK_Management_Functions DraftEdit = new NOK_Management_Functions();
		 login performlogin = new login();
		 driver.get("https://nokplatform-dev.who.int/home");
		 performlogin.performLogin(login_Credentials.Username, login_Credentials.Password);
		 DraftEdit.DraftNOK();
		 DraftEdit.DraftEdit();
		 DraftEdit.TestCaseFinished();
		 driver.quit();
		 }		
	}

