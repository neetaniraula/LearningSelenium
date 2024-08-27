package screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.orangehrm.com/");
		
		TakesScreenshot screenshot = driver;
		
		File image = screenshot.getScreenshotAs(OutputType.FILE);
		
		//copy screen shot
		
		File myFile = new File("C:\\Users\\neeta\\eclipse-workspace\\AutomatiobDemo\\Screenshots\\Imange1.png");
		
		FileUtils.copyFile(image, myFile);
		
		
		
	}

}
