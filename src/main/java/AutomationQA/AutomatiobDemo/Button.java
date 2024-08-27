package AutomationQA.AutomatiobDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
		
		WebElement addElementBtn = driver.findElement(By.xpath("//button[text()='Add Element']"));
		
		boolean isDisplayedStatus = addElementBtn.isDisplayed();
		System.out.println("isDisplayed: " + isDisplayedStatus );
		
		boolean isEnabledStatus = addElementBtn.isEnabled();
		System.out.println("isEnabled Status is: " + isEnabledStatus);
		
		String buttonName = addElementBtn.getText();
		
		System.out.println("button name is: " + buttonName);
		
		addElementBtn.click();
		
		driver.close();
		
		
		
	  
		

	}

}
