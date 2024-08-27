package AutomationQA.AutomatiobDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarPick {

	public static void main(String[] args) {
		
		//Openn chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//open app
		driver.get("https://www.skyscanner.com.sg/");
		
		//select date
		
		WebElement depIcon = driver.findElement(By.xpath("//span[normalize-space()='Depart']"));
		depIcon.click();
		
		
		

	}

}
