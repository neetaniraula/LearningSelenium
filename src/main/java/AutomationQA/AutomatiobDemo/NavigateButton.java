package AutomationQA.AutomatiobDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class NavigateButton {

	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		//JavascriptExecutor js = driver ;
		
		//scroll down page
		WebElement donationLink = driver.findElement(By.linkText("donation"));
		
		
		
		

	}

}
