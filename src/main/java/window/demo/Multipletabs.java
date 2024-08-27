package window.demo;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipletabs {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.icicibank.com");
		
		//click on later button pop up
		//
		//open tab 1
		
		
		//open tab 2
		
		//get window id of 1st tab
		String firstWindowHandle = driver.getWindowHandle();
		//print
		Set <String> allWindowsIDs = driver.getWindowHandles();
		
		for(String s :allWindowsIDs) {
			
			if(!s.equals(firstTabWindowID)) {
				
				//driver.switchTo().window(1sttab)
			}
		}
		//click on history link
		

	}

}
