package syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.linkText("Create New Account")).click();
		//explicit Wait
		

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));


		
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
		
		
		

	}

}
