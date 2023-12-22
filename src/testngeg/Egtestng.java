package testngeg;

import org.junit.After;
import org.junit.Before;

import org.openqa.selenium.chrome.ChromeDriver;

public class Egtestng{
	
	ChromeDriver driver;
	@Before
	public void facebook() {
		driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	//@Test
	//public void test() {
	//	driver.findElement(By.xpath("//*[@id=\"email\"]"));
	
	@After
	public void name() {
		
	}
}
