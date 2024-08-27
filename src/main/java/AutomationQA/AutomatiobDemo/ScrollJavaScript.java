package AutomationQA.AutomatiobDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollJavaScript {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//enter username
		Thread.sleep(5000);
		WebElement txtusername = driver.findElement(By.xpath("input[placeholder='Username']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("arguments[0].value='Admin'", txtusername);
		
		//enter password
		
		js.executeScript("document.getElementByID('txtpassword').value='admin123'");
		
		//click login button
		
		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		js.executeScript("arguments[0].click()", loginBtn);
		
		
		

	}

}
