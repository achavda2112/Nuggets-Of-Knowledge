package user_Management;

import org.openqa.selenium.WebDriver;
import login.login;
import login.login_Credentials;
import webDriver.webDriverSetup;

public class DeleteUser extends webDriverSetup {

    public static void main(String[] args) throws Exception {
        WebDriver driver = getDriver();
        User_Management_functions userActions = new User_Management_functions();
        login performlogin = new login();
        
        try {
            driver.get("https://nokplatform-dev.who.int/home");
            performlogin.performLogin(login_Credentials.Username, login_Credentials.Password);
            userActions.AddUser();
            userActions.DeleteUser();
            userActions.TestCaseFinished();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
