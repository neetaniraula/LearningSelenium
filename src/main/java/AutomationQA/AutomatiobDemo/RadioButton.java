package AutomationQA.AutomatiobDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		
		
		//open google chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//open application
		driver.get("thttps://demo.guru99.com/test/radio.html");
		
		
		//identify radio button
		
		WebElement firstradiobutton = driver.findElement(By.cssSelector("#vfb-7-1"));
		
		//displaye status
		
		
		
		
		
		
	}

	private static void findElement(By cssSelector) {
		// TODO Auto-generated method stub
		
	}

}
