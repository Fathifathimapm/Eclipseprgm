package testngeg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automationeg {
	String url=("https://automationexercise.com/login");
	ChromeDriver driver;
@BeforeTest
public void setup() {
	driver=new ChromeDriver();
	driver.get(url);
	
}
@Test
public void load() {
	   WebElement signup =driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));signup.click();
	   WebElement firstname =driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")); firstname.sendKeys("Fathima");
	   WebElement email =driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")); email.sendKeys("fathima@gmail.com");
	   WebElement signup1=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")); signup1.click();
	   WebElement password=driver.findElement(By.xpath("//*[@id=\"password\"]")); password.sendKeys("fathi123");
	   WebElement Bday=driver.findElement(By.xpath("//*[@id=\"days\"]"));
	   Select day=new Select(Bday);
	   day.selectByValue("12");
	   WebElement Bmonth=driver.findElement(By.xpath("//*[@id=\"months\"]"));
	   Select month=new Select(Bmonth);
	   month.selectByVisibleText("July");

	   WebElement Byear=driver.findElement(By.xpath("//*[@id=\"years\"]"));
	   Select year=new Select(Byear);
	   year.selectByValue("2002");

	   driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Fathima");
	   driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("pm");

	   driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("Luminar");
	   driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("LOVESHORE(HO),VKC P.O THEVAKKAL");
	   
	   driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("Kerala");
	   driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("kalamassery");
	   driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("682025");
	   driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("9778163987");
	   
	   driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/form/button")).click();

	   



	   
	   
	   
}

@Test
public void logintest()
{
	 driver.findElement(By.xpath("//*[@id='form']/div/div/div/div/form/input[2]")).sendKeys("fathima@gmail.com");
			 
	 driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys("fathi123");
	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
	String expectedurl="https://automationexercise.com/";
	String crnturl=driver.getCurrentUrl();
	if(crnturl.equals(expectedurl))
	{
		System.out.println(crnturl);
	}
	else
	{
		System.out.println("Url is different");
		System.out.println("Actual url is :"+crnturl);
	}
}

}
