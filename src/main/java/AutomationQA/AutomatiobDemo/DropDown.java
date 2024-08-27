package AutomationQA.AutomatiobDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		// open google chrome browser

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// open aplication
		driver.get("https://the-internet.herokuapp.com/dropdown");

		// identify dropdownfield
		// In selenium if you want to idenfidy a drop down you have to cretae a object
		// of select class

		WebElement jobTitle = driver.findElement(By.cssSelector("#dropdown"));

		// select value from list

		Select selectJobTitle = new Select(jobTitle);

		// selecting option based on the index of options.
		selectJobTitle.selectByIndex(2);
		//selectJobTitle.deselectByVisibleText("Option 2");
		
		//retrive value selected in a drop down
		WebElement selectedOption = selectJobTitle.getFirstSelectedOption();
		String selectedDropDownValue = selectedOption.getText();
		System.out.println("select option : " + selectedDropDownValue);
		
		
		
		
	}

}
