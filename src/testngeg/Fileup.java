package testngeg;



	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.Toolkit;
	import java.awt.datatransfer.StringSelection;
	import java.awt.event.KeyEvent;

	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Fileup {

		
	ChromeDriver driver;
	String Baseurl="https://www.ilovepdf.com/pdf_to_word";

	@BeforeTest
	public void setup()
	{
	driver =new ChromeDriver();
	driver.get(Baseurl);
	}

	@Test
	public void test() throws AWTException
	{

	driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();

	fileUpload("\"C:\\Users\\Sherin\\Downloads\\PSC BULLETIN NOV 15.pdf\"");
	}

	public void fileUpload(String p)throws AWTException{
		StringSelection strSelection = new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection,null);
		
		
		
		
		Robot robot = new Robot();
		
		robot.delay(3000);
		
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		robot.delay(2000);
		
		
		
		
		
	}





	}

