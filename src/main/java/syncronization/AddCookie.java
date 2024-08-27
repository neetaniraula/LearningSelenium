package syncronization;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCookie {

	public static void main(String[] args) {

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.orangehrm.com/");
			
			//object of cookie
			
			Cookie myCookie = new Cookie("testName", "test value");
			driver.manage().addCookie(myCookie);
			
			Set <Cookie> allCookies = driver.manage().getCookies();
			
			for(Cookie ck :allCookies) {
				System.out.println(ck.getName()+ "===="+ck.getExpiry()+"=="+ck.getDomain());
			}
//delete cookie
			driver.manage().deleteCookieNamed("orangehrm");
			
			System.out.println("==================================");
			//display cookie after delete
			
driver.manage().addCookie(myCookie);
			
			Set <Cookie> allCookiesAfterDelete= driver.manage().getCookies();
			
			for(Cookie ck :allCookiesAfterDelete) {
				System.out.println(ck.getName()+ "===="+ck.getExpiry()+"=="+ck.getDomain());
			}
		}
		

	}


