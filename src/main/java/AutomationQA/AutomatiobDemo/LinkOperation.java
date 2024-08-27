package AutomationQA.AutomatiobDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkOperation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement link = driver.findElement(By.xpath("(//div[@class='_97w3'])[1]"));

		boolean isDisplayedStatus = link.isDisplayed();

		System.out.println("dispayed status: " + isDisplayedStatus);

		boolean isEnableStatus = link.isEnabled();
		System.out.println("enabled status is: " + isEnableStatus);
		String LinkTest = link.getText();
		System.out.println("linktext is : " + LinkTest);

		link.click();

	}

}
