package user_Management;

import org.openqa.selenium.WebDriver;

import login.login;
import login.login_Credentials;
import webDriver.webDriverSetup;

public class DeActivateUser extends webDriverSetup {
		
		public static void main(String[] args) throws Exception {
			WebDriver driver = getDriver();
			User_Management_functions DeActiaveUser = new User_Management_functions();
			login performlogin = new login();
			driver.get("https://nokplatform-dev.who.int/home");
			performlogin.performLogin(login_Credentials.Username, login_Credentials.Password);
			DeActiaveUser.AddUser();
			DeActiaveUser.DeActivteUser();
			DeActiaveUser.TestCaseFinished();
			driver.quit();
		}
	}