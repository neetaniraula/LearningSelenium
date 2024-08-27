package window.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");

		WebElement emailTextBox = driver.findElement(By.id("email"));

		Actions action = new Actions(driver);
		action.contextClick(emailTextBox).build().perform();

	}

}
