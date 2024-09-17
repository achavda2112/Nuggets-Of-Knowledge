package report;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import webDriver.webDriverSetup;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ExtentDemo extends webDriverSetup {
    static ExtentTest test;
    static ExtentReports report;

    private static final String BASE_DIRECTORY = System.getProperty("user.dir") + "/TestReports/";
    
    public static void startReport() {
    	
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        
        String reportPath = Paths.get(BASE_DIRECTORY, "ExtentReport_" + timestamp + ".html").toString();
        
        report = new ExtentReports(reportPath, true);
        test = report.startTest("TestReport");
    }

    public static void logStatus(LogStatus status, String message) {
        test.log(status, message);
        System.out.println("Report Has Been Generated");
    }

    public static void logStatusWithScreenshot(LogStatus status, String message) {
        String base64Screenshot = captureScreenshotAsBase64();
        if (base64Screenshot != null) {
            test.log(status, message + test.addBase64ScreenShot("data:image/png;base64," + base64Screenshot));
        } else {
            test.log(status, message);
        }
    }

    public static void endReport() {
        report.flush();
      
    }

    private static String captureScreenshotAsBase64() {
        WebDriver driver = getDriver();
        if (driver == null) {
            System.err.println("WebDriver instance is null. Cannot capture screenshot.");
            return null;
        }
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
    }
}
