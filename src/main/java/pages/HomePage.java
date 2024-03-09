package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver; 
	 
	 public HomePage( WebDriver driver ) { 
	    this.driver = driver; 
	    PageFactory.initElements( driver, this); 
	 }
	 
	 @FindBy(xpath = "//input[@placeholder=\"Search for Products, Brands and More\"]")
	 public static WebElement searchBarInput;
	 
	 @FindBy(xpath = "//input[@placeholder=\"Search for Products, Brands and More\"]/..")
	 public static WebElement searchBar;	 
	String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public static void enterResultInSearchBar(String product) {
		searchBar.click();
		searchBarInput.sendKeys(product, Keys.ENTER);
	}
	

}
