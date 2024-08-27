package AutomationQA.AutomatiobDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowser {
	
	@Test
	public void mytest() {
		
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.navigate().to("https://www.saucedemo.com/");
				
				//String title = driver.getTitle();
				//System.out.println("Page title: " + title);
				//System.out.println("URL: " + driver.getCurrentUrl());
				driver.findElement(By.id("user-name")).sendKeys("Standard_user");
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				driver.findElement(By.id("login-button")).click();
				
				
				
				
				
	}

}
