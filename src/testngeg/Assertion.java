package testngeg;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertion {
	String baseurl="https://www.google.co.in/";
	ChromeDriver driver;

	@BeforeTest
	public void load() {
		driver=new ChromeDriver();
		
		driver.get(baseurl);
}
	@Test
	public void test() {
		String exptitle="goog1";
		String actualtitle=driver.getTitle();
		System.out.println("title="+actualtitle);
		Assert.assertEquals(actualtitle, exptitle);
		System.out.println("title verified");
	}
	
}