package AutomationQA.AutomatiobDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertText {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		// click on button to get javascript alert
		driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
		Thread.sleep(5000);

		// switch focus from normal window to alert
		Alert al = driver.switchTo().alert();

		// get the text of alert.

		String alertText = al.getText();

		System.out.println("Alert text is: " + alertText);

		// click on OK ,cancel

		//al.accept();// click on Ok button of alert
		
		al.dismiss();

	}

}
