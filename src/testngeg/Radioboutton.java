package testngeg;



	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Radioboutton {

		ChromeDriver driver;
		String url="https://register.rediff.com/register/register.php?FormName=user_details";
		
		@BeforeTest  
		public void browseropen() {
			
		}
		@BeforeMethod
		public void setup() {
			driver=new ChromeDriver();
			driver.get(url);
	}
		@Test(priority=1, invocationCount=2)
		public void test1() {
			String buttontest=driver.findElement(By.xpath("//*[contains(@name,'btnchkavail')]")).getAttribute("value");
			if(buttontest.equals("Check availability")) {
				System.out.println("pass");
			}else {
				System.out.println("fail");
			}
		}
		@Test(priority=0)
		public void test2() {
			boolean radio=driver.findElement(By.xpath("//input[@value='m']")).isSelected() ;//check if radio button selected or not
			if(radio) {
				System.out.println("selected");
			}else {
				System.out.println("not selected");
			}
		}
		@AfterMethod
		public void afrmethod() {
			System.out.println("after method");
		}
		@AfterTest()
		public void teardown() {
			driver.quit();
		}
		}

