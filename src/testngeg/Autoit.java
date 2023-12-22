package testngeg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Autoit {
WebDriver driver;

@BeforeTest
public void beforetest() {
	driver=new ChromeDriver();
	
}
@Test
public void main() throws Exception{
	driver.findElement(By.xpath("https://www.ilovepdf.com/pdf_to_word"));
	driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
	Thread.sleep(3000);
	Runtime.getRuntime().exec("\"C:\\Users\\Sherin\\Documents\\autoscript.au3\"");
	
	
	
	
	
}

}

	


