package testng.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTestCase {

@Test
	public void launchGooglePage() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		
	}

}
