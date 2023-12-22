package testngeg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Windowhandler {
	ChromeDriver driver;
	String baseurl="https://demo.guru99.com/popup.php";

	@BeforeTest
	public void load() {
		driver=new ChromeDriver();
		driver.get(baseurl);
	
		
	}
	@Test
	public void test() {
		
		String parentwindow= driver.getWindowHandle(); 
		System.out.println("parent Window Title"+driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		
		Set<String> allwindowhandles=driver.getWindowHandles();
		
	for(String handle : allwindowhandles) {
		if(!handle.equalsIgnoreCase(parentwindow)) {
			driver.switchTo().window(handle);
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("fathi@gmail.com");
			driver.close();
		}
		driver.switchTo().window(parentwindow);
	}
	
	
	
		

		
	}
	
}

