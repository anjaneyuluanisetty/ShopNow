package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewCartPage {
	WebDriver driver; 
	 
	 public ViewCartPage( WebDriver driver ) { 
	    this.driver = driver; 
	    PageFactory.initElements( driver, this); 
	 }
	 
	 @FindBy(xpath = "//*[text()='Place Order']/..")
	 public static WebElement placeOrder;


	public void clickOnPlaceOrder()  {
		System.out.println("url&&&&&&&&&&"+driver.getCurrentUrl());
		
		placeOrder.click();
	}	
	 
}
