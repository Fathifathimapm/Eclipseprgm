package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Fbloginpade;

public class Fblohingtest {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		

}
	@Test
	public void testlogin() {
		Fbloginpade ob =new Fbloginpade(driver);
		ob.setvalues("fathi@gmail.com", "123fathi");
		
	
	}
	
}
