package syncronization;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieHandling {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.orangehrm.com/");
		
		Set <Cookie> allCookies = driver.manage().getCookies();
		
		for(Cookie ck :allCookies) {
			System.out.println(ck.getName()+ "===="+ck.getExpiry()+"=="+ck.getDomain());
		}

	}

}
