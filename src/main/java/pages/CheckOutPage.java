package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	WebDriver driver; 
	 
	 public CheckOutPage( WebDriver driver ) { 
	    this.driver = driver; 
	    PageFactory.initElements( driver, this); 
	 }

	 @FindBy(xpath = "//*[text()='Enter Email/Mobile number']//../../input")
	 public static WebElement phoneNumberInput;

	 @FindBy(xpath = "//*[text()='Login']")
	 public static WebElement login;

	 
	 @FindBy(xpath="//*[text()='Enter Email/Mobile number']/../..")
	 public static WebElement txtInputClick;

	 @FindBy(xpath = "//button[@type='submit']/span")
	 public static WebElement continuee;

	public void clickOnLogin() {
	
	}

	public void enterPhoneNumer(String phoneNumber) {

		txtInputClick.click();		
		phoneNumberInput.sendKeys(phoneNumber,Keys.ENTER);
	}

	public void enterOTPandLogin() {
		
		login.click();
	}

	public void clickOnContinue(){
		
		continuee.click();
	}
	 
}
