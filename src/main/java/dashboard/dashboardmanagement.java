package dashboard;


import org.openqa.selenium.WebDriver;

public class dashboardmanagement extends dashboard_search {
    
    public dashboardmanagement() {
    }

    public void manageDashboard() throws Exception {

		WebDriver driver = getDriver();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
        dashboard_search search = new dashboard_search();
		driver.get("https://nokplatform-dev.who.int/home");
        search.SearchBySorting();
    }
    public static void main(String[] args){
        dashboardmanagement manager = new dashboardmanagement();
        try {
			manager.manageDashboard();
		} catch (Exception e) {
			e.printStackTrace();
		};
		driver.quit();
    }
}
