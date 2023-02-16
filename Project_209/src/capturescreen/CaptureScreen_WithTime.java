package capturescreen;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CaptureScreen_WithTime 

{
    public static void main(String[] args) 
    
    {


        // Create a new WebDriver instance
        WebDriver driver = new ChromeDriver();

        // Navigate to the webpage you want to capture
        driver.get("https://www.facebook.com");

        // Capture the screenshot with timestamp
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");
        String timestamp = now.format(formatter);
        
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        screenshot.renameTo(new File("screens\\FBHome"+timestamp + ".png"));

        // Close the WebDriver instance
        driver.quit();
    }
}
