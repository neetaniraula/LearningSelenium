package AutomationQA.AutomatiobDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollingpage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		// Open application
		driver.get("https://facebook.com/privacy/explaination");
		
		Thread.sleep(5000);
		
		//scroll to see donation page
		
		//WebElement donationLink = driver.findElement(By.linkText("donation"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		//js.executeScript("arguments[0].scrollIntoView(true)", donationLink);
		
		//scroll at the end of the page
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
	}

}
