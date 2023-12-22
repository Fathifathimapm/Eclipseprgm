package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpade {
	WebDriver driver;
	 @FindBy(name="login")
	 WebElement loginbutton;
	 
	 @FindBy(name="email")
	 WebElement emailidfield;
	 
	 @FindBy(name="pass")
	 WebElement pswd;
	
	 
	 
	 public  Fbloginpade(WebDriver driver) 
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);	
		 
		
	 }
	 
	 public void clickloginbutton() {
		 loginbutton.click();
		 
	 }
	 
	public void setvalues(String UN,String PWD) {
		
		emailidfield.sendKeys(UN);
		pswd.sendKeys(PWD);

	}
	
	}
	


