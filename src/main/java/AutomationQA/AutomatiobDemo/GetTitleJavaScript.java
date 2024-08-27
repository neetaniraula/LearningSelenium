package AutomationQA.AutomatiobDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleJavaScript {

	public static void main(String[] args) {
		
		
		// Open google chrome browser
			
		WebDriver driver = new ChromeDriver();

		// Open application
		driver.get("https://opensource-demo.orangehrmlive.com/");

		// Enter username
		WebElement userName = driver.findElement(By.name("txtUsername"));

		JavascriptExecutor js = (JavascriptExecutor) driver ;

		js.executeScript("arguments[0].value='Admin'", userName);

		// Enter password

		js.executeScript("document.getElementById('txtPassword').value='admin123'");

		// click on Login button

		WebElement loginBtn = driver.findElement(By.id("btnLogin"));

		js.executeScript("arguments[0].click()", loginBtn);

		// get title

		String title = js.executeScript("return document.title").toString();

		System.out.println("Title of page is :" + title);

		// get url

		String url = js.executeScript("return document.URL").toString();

		System.out.println("url of page is :" + url);

	}


	}


