package login;

public class Perform_Login {

	public static void main(String args[]) throws Exception {
		 login loginPage = new login();
	        loginPage.performLogin(login_Credentials.Username, login_Credentials.Password);
	}
}
