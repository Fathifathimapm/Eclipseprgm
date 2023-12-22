package base;


	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;



	public class Baseclss {
		public static WebDriver driver;
		
		@BeforeTest
		public void setUp()
		{
			ChromeOptions options=new ChromeOptions();
			//options.addArguments("--remote-allow-origins=");
			 driver=new ChromeDriver(options);
			 driver.get("https://www.facebook.com");
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));		
			
		}
		@AfterTest
		
		public void postcondition()
		{
			driver.quit();
		}

	}


