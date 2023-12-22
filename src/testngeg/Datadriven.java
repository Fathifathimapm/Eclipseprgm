package testngeg;



	import java.io.FileInputStream;
	import java.io.FileNotFoundException;

	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Datadriven {
		ChromeDriver driver;
		String baseurl="https://www.facebook.com/";
		@BeforeTest
		public void SetUp()
		{
			driver=new ChromeDriver();
			//driver.get(baseurl);
		}
		
		@Test
		public void test() throws Exception
		{
			FileInputStream f=new FileInputStream("C:\\Users\\sanig\\Desktop\\Datadriven.xlsx");
			XSSFWorkbook wb=new XSSFWorkbook(f);
			XSSFSheet sh=wb.getSheet("Sheet1");
			int count=sh.getLastRowNum();
			
			for(int i=1;i<=count;i++)
			{
				String userid=sh.getRow(i).getCell(0).getStringCellValue();
				String passid=sh.getRow(i).getCell(1).getStringCellValue();
				System.out.println("username:"+userid);
				System.out.println("password:"+passid);
				driver.get(baseurl);
				driver.findElement(By.name("email")).sendKeys(userid);
				driver.findElement(By.name("pass")).sendKeys(passid);
				driver.findElement(By.name("login")).click();

			}
			
		}

	}

