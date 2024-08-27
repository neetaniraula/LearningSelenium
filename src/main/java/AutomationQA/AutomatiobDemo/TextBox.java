package AutomationQA.AutomatiobDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/forgot_password");
		
		//identify text box
		WebElement emailTextBox = driver.findElement(By.cssSelector("#email"));
		
		
		//textbox displayed or not
		
		boolean isDisplayedStatus = emailTextBox.isDisplayed();
		System.out.println("Is dispayed staus is " + isDisplayedStatus);
		
		
		//textbox enabled or not
		
		boolean enableStatus = emailTextBox.isEnabled();
		System.out.println("Is enabled staus is " + enableStatus);
		
		//enter value in text box
		
		emailTextBox.sendKeys("selenium@test.com");
		Thread.sleep(5000);
		
		
		//get the entered value from text box
		
		String enteredValue = emailTextBox.getAttribute("value");
		System.out.println("Entered value of text box is : " + enteredValue);
		
		//delete the value
		
		emailTextBox.clear();
		
		
		
		

	}

}
