package testngeg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrtest {
WebDriver driver;
@Parameters("browser")
@BeforeTest
public void setup(String browser) {
	if (browser.equalsIgnoreCase("chrome"))
	{
		
		driver=new ChromeDriver();
		
	}
	else if(browser.equalsIgnoreCase("egde")) {
		driver = new EdgeDriver();
	}
	else 
	{
		driver=new FirefoxDriver();
	}
}
	@Test
	public void test() 
	{
		driver.get("https://www.google.co.in/");
	}
}

