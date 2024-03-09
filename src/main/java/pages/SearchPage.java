package pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	WebDriver driver; 
	 
	 public SearchPage( WebDriver driver ) { 
	    this.driver = driver; 
	    PageFactory.initElements( driver, this); 
	 }

	 @FindBy(xpath = "//div[@data-id='COMGVBZBDZJXUZFC']")
	 public static WebElement firstResult;



	 
	public void clickOnFirstResult() {
		// TODO Auto-generated method stub
		firstResult.click();

		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
	}

	 
	 
	 
}
