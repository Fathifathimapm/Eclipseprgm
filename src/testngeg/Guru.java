package testngeg;



	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Guru {
		ChromeDriver driver;
		String baseurl="https://demo.guru99.com/test/simple_context_menu.html";
		@BeforeTest
		public void btest()
		{
			driver=new ChromeDriver();
			driver.get(baseurl);         
		}
		@Test
		public void test1()
		{
			Actions action=new Actions(driver);
			WebElement link=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
			action.contextClick(link).perform();
			driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
			driver.switchTo().alert().accept();

			Actions act = new Actions(driver);	
			WebElement lnk=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
			act.doubleClick(lnk).perform();
			Alert alert = driver.switchTo().alert();
			String alerttext=alert.getText();
			if(alerttext.equals("You double clicked me.. Thank You.."))
			{
				System.out.println("Alert Text is present:" +alert.getText());
				
			}
			else
			{
				System.out.println("Alert Text is not present");
			}
			alert.accept();
			
		}

	}

