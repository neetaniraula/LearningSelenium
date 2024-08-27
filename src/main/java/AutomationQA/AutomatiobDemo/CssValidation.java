package AutomationQA.AutomatiobDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssValidation {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/forgot_password");
		
	WebElement button = driver.findElement(By.xpath("(//i[@class='icon-2x icon-signin'])[1]"));
	
	String borderStyle = button.getCssValue("text-align");
	System.out.println("BorderStyle is: " + borderStyle);

	}

}
