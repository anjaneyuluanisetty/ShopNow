package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	
	 WebDriver driver; 
	 
	 public AddToCartPage( WebDriver driver ) { 
	    this.driver = driver; 
	    PageFactory.initElements( driver, this); 
	 } 

}
