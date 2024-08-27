package testng.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertEqualsDemo {
	
	@Test
	public void loginToHRM() {
		
		// Launch browser
					ChromeDriver driver = new ChromeDriver();
					
					
					// open login page
					
					driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
					
					
					// enter username
					
					driver.findElement(By.name("txtUsername")).sendKeys("Admin");
					
					
					// enter password
					
					driver.findElement(By.name("txtPassword")).sendKeys("admin123");
					
					
					// click on login button
					driver.findElement(By.name("Submit")).click();
					
					String sctualurl = driver.getCurrentUrl();
					String expectedurl = 
							
					
			
				
				}
		
		
	}


