package AutomationQA.AutomatiobDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframe {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		//switch from html to parent frame
		driver.switchTo().frame("frame-top");
		
		//switch from parent to child
		driver.switchTo().frame("frame-middle");
		
		//identify the webelement
		WebElement text = driver.findElement(By.id("content"));
		
		//print the text of webelelemt
		
		System.out.println("text of second frame is :" +text.getText());
		
		//come out from child frame to parent frame
		driver.switchTo().parentFrame();
		
		//come out from parent frome to html
		driver.switchTo().defaultContent();
		
		
		
		
		
		
		

	}

}
