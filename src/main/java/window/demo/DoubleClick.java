package window.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");

		// perform double click event.
		
		driver.switchTo().frame("iframeResult");

		WebElement button = driver.findElement(By.xpath("//button[text()='Double-click me']"));

		Actions action = new Actions(driver);

		action.doubleClick(button).build().perform();


	}

}
