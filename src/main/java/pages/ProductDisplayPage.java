package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDisplayPage {

	WebDriver driver; 
	 
	 public ProductDisplayPage( WebDriver driver ) { 
	    this.driver = driver; 
	    PageFactory.initElements( driver, this); 
	 }
	 
	@FindBy(xpath = "//*[text()='Add to cart']")
	 public static WebElement addToCartBtn;

	@FindBy(xpath = "//*[text()='Cart']/..")
	 public static WebElement shoppingCartBtn;
	
	public void clickOnAddToCart() {

		addToCartBtn.click();
		
	}
	
	public void clickOnShoppingCartButton() {
		// TODO Auto-generated method stub
		shoppingCartBtn.click();
	}
	 
	 

}
