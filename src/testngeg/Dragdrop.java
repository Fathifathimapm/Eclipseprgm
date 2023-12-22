package testngeg;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Dragdrop {
		ChromeDriver driver;
		String url="https://www.demo.guru99.com/test/drag_drop.html";
		@BeforeTest
		public void setup()
		{
			driver=new ChromeDriver();
			driver.get(url);	
		}
		@Test
		public void gtst()
		{
				
	    	 WebElement From1=driver.findElement(By.xpath("//*[@id='credit2']/a"));			
	    	 WebElement To1=driver.findElement(By.xpath("//*[@id='bank']/li"));							
	    	 WebElement From2=driver.findElement(By.xpath("//*[@id='credit1']/a"));	
	    	 WebElement To2=driver.findElement(By.xpath("//*[@id='loan']/li"));						
	         WebElement From3=driver.findElement(By.xpath("//*[@id='fourth']/a"));					
	    	 WebElement To3=driver.findElement(By.xpath("//*[@id='amt7']/li"));						
	         WebElement From4=driver.findElement(By.xpath("//*[@id='fourth']/a"));					
	    	 WebElement To4=driver.findElement(By.xpath("//*[@id='amt8']/li"));				 
			 Actions act = new Actions(driver);
			act.dragAndDrop(From1, To1);
			act.dragAndDrop(From2, To2);
			act.dragAndDrop(From3, To3);
			act.dragAndDrop(From4, To4);
			act.perform();

		}	
		@AfterTest
		public void teardown()
		{
		 driver.quit();	
		}
		
	}
	


