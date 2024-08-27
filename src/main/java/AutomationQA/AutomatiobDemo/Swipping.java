package AutomationQA.AutomatiobDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swipping {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.album.alexflueras.ro/");
		
		//from left to right
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		//from left to right
		WebElement catImage = driver.findElement(By.id("a7"));
		js.executeScript("arugements[0].scrollIntoView()", catImage);
		
		//right to left
		
		WebElement houseImage = driver.findElement(By.id("a3"));
		js.executeScript("arguments[0].scrollIntoView()", houseImage);
		
		

	}

}
