package fileUpload;

import java.io.File;
import org.openqa.selenium.WebElement;

public class File_Upload {

    // Base directory for file uploads
    private static final String BASE_DIRECTORY = "/src/main/java/FilesForUpload/";
        
    public void uploadImage(WebElement fileInputElement, String fileName) {
        // Get the current working directory
        String currentWorkingDir = System.getProperty("user.dir");
        
        // Construct the absolute file path by appending the base directory and file name
        String absoluteFilePath = currentWorkingDir + BASE_DIRECTORY + fileName;
        
        // Create a file object
        File file = new File(absoluteFilePath);
        
        // Check if the file exists and upload it
        if (file.exists()) {
            fileInputElement.sendKeys(file.getAbsolutePath());
    		System.out.println("Your File Has Been Uploaded");
        } else {
            System.out.println("File not found: " + absoluteFilePath);
        }
    }
}
