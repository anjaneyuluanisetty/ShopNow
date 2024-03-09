package steps;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AddToCartPage;
import pages.HomePage;
import pages.CheckOutPage;
import pages.ProductDisplayPage;
import pages.SearchPage;
import pages.ViewCartPage;


public class StepDefinitions {
	
	WebDriver driver;

	public HomePage homepage;
	public AddToCartPage addToCartPage;
	public CheckOutPage checkOutPage;
	public SearchPage searchPage;
	public ProductDisplayPage productDisplayPage;
	public ViewCartPage viewCartPage;

	@After
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Given("user starts {string} browser")
	public void user_starts_browser(String browserName) {
	    
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
	}


	@When("Open the ShopNow {string}")
	public void open_the_shop_now(String url) {
		homepage=new HomePage(driver);
		homepage.setUrl(url+"/");
		driver.get(homepage.getUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   
	}

	@Then("Validate the homepage loaded successfully")
	public void validate_the_homepage_loaded_successfully() {
		String element=driver.getCurrentUrl();
		System.out.print("Actual "+element+" Expected "+homepage.getUrl());
		Assert.assertTrue(element.equals(homepage.getUrl()));
	}

	@When("Enter {string} in searchBar")
	public void enter_in_search_bar(String product) {
		HomePage.enterResultInSearchBar(product);
	}

	@When("Click on first search Result")
	public void click_on_first_search_result() {
		searchPage=new SearchPage(driver);
		searchPage.clickOnFirstResult();
	}

	@Then("Product Info is visible")
	public void product_info_is_visible() {
	
	}

	@When("Click on Add to Cart")
	public void click_on_add_to_cart() {
		productDisplayPage=new ProductDisplayPage(driver);
		productDisplayPage.clickOnAddToCart();	
	}

	@When("Click on Shopping Cart Button")
	public void click_on_shopping_cart_button() {
		productDisplayPage.clickOnShoppingCartButton();
		
	}

	@Then("Verify the Product is added to the Cart\\/Not")
	public void verify_the_product_is_added_to_the_cart_not() {
		
	}
	
	@When("Click on the LoginBtn")
	public void click_on_the_loginbtn() {
			
	}

	@When("Click on Place Order")
	public void click_on_proceed_to_check_out() throws InterruptedException {
		viewCartPage=new ViewCartPage(driver);
		Thread.sleep(10000);
		viewCartPage.clickOnPlaceOrder();
	}

	@And("Click On Continue")
	public void click_on_continue() {
		
		checkOutPage.clickOnContinue();
		
	}

	@And("Enter OTP and Click on Login")
	public void enterOTPandLogin() throws InterruptedException {
		
		checkOutPage.enterOTPandLogin();
		
	}

	@Then("Verify the Login Page")
	public void verify_the_login_page() {
		
	}

	@When("Enter PhoneNumber as {string}")
	public void enter_user_name_as(String phoneNumber) throws InterruptedException {
		checkOutPage=new CheckOutPage(driver);
		Thread.sleep(5000);
		checkOutPage.enterPhoneNumer(phoneNumber);
	}

	@When("Enter Password as {string}")
	public void enter_password_as(String string) {
	}

	@Then("Verify the User is Successfully Logged in")
	public void verify_the_user_is_successfully_logged_in() {
	}




}
