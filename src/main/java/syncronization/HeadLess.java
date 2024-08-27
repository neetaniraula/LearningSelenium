package syncronization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLess {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--headless");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		
		String url = driver.getCurrentUrl();
		
		System.out.println(" title "+ title);
		System.out.println("Url is "+ url);
		
		
		

	}

}
