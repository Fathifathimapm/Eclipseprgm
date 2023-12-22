package testngeg;





	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Datepicker {
		
		WebDriver d;
		String baseurl="https://www.trivago.com/";
		
		@BeforeTest
		public void setupup()
		{
			d=new ChromeDriver();
			d.get(baseurl);
		}
		@Test
		public void datepicker()
		{
			d.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div/fieldset/button[1]/span/span[2]/span[2]")).click();
			datepickermethod("March 2024","30");//Check in
			//datepickermethod("April 2024","2");//Check out
		}
		
		public void datepickermethod(String expmonth,String expdate)
		{
			while(true)
			{
				String month=d.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3")).getText();
				if(month.equals(expmonth))
				{
					System.out.println(month);
					break;
				}
				else
				{
					d.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]")).click();
				}
				
				List<WebElement> alldates=d.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/time"));
				for(WebElement dateelement:alldates)
				{
					String date=dateelement.getText();
					if(date.equals(expdate))
					{
						dateelement.click();
						break;
					}
					
				}
			}
		}

	}

