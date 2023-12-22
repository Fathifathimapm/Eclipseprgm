package testngeg;



	

	import java.time.Duration;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Amazon {
		WebDriver driver;
		String baseurl="https://www.amazon.in/";
		
		@BeforeTest
		public void setup()
		{
			driver=new ChromeDriver();
		}
		
		@BeforeMethod
		public void url()
		{
			driver.get(baseurl);
		}
		
		@Test
		public void amazontest()
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles",Keys.ENTER);
			String expectedtitle="Amazon.in:mobilephones";
			String actualtitle=driver.getTitle();
			System.out.println("title="+actualtitle);
			if(actualtitle.equalsIgnoreCase(expectedtitle))
			{
				System.out.println("title verified");
			}
			else
			{
				System.out.println("not verified");
			}
			String parentwindow=driver.getWindowHandle();
			driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[1]/div/div[2]/div/span/a")).click();
			Set<String> allwindow=driver.getWindowHandles();
			for(String handle:allwindow)
			{
				if(!handle.equalsIgnoreCase(parentwindow))
				{
					driver.switchTo().window(handle);
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,1000)", "");
					driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
					driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]")).click();
					driver.close();
				}
				
			}
			driver.switchTo().window(parentwindow);
			
		}

	}






