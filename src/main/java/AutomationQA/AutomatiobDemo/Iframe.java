package AutomationQA.AutomatiobDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/dialog/");
		
		//identify the element which is present inside iframe
		
		
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@title='Close']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Demos")).click();

	}

}
