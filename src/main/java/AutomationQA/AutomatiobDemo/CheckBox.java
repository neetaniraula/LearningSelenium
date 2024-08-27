package AutomationQA.AutomatiobDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		
		WebElement checkBox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		
		boolean isDisplayedStatus = checkBox1.isDisplayed();
		
		System.out.println("Is displayed is : " + isDisplayedStatus);
		
		boolean isEnabledStatus = checkBox1.isEnabled();
		System.out.println("IsEnabled  is : " + isEnabledStatus);
		checkBox1.click();
		Thread.sleep(5000);
		boolean isSelectedStatus = checkBox1.isSelected();
		System.out.println("Is selected status after click is: "+isSelectedStatus );
		//unslect check box
		checkBox1.click();
		
		
		
		

	}

}
