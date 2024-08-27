package window.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.com/");

		// move accont over and list link

		WebElement accountListLink = driver.findElement(By.id("nav-link-accountList"));

		Actions action = new Actions(driver);

		action.moveToElement(accountListLink).build().perform();
		Thread.sleep(5000);
		
		//click on order link
		
		WebElement yourOrderLink = driver.findElement(By.xpath("//span[text()='Orders']/parent::a"));

		// enateremail id
		
		WebElement emailTextBox = driver.findElement(By.id("ap_email"));
		
		action.sendKeys(emailTextBox, "test@test.com").build().perform();

	}

}
