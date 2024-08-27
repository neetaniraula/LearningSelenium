package window.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/droppable/");

		driver.switchTo().frame(0);

		WebElement smallBox = driver.findElement(By.id("draggable"));

		WebElement biggerBox = driver.findElement(By.id("droppable"));

		Actions action = new Actions(driver);
		action.dragAndDrop(smallBox, biggerBox).build().perform();

	}

}
