package amazonfeaturesfile;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import qa.DriverFactory;

public class LoginSteps {
	
	LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	
	
	@Given("I am on the Amazon website")
	public void i_am_on_the_amazon_website() {
		WebDriver driver = DriverFactory.getDriver();	    
	    driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	}
	
	@Given("user should be on login page")
	public void user_should_be_on_login_page() {
	    WebDriver driver = DriverFactory.getDriver();	    
	    driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	}

	@When("user enters username as {string}")
	public void user_enters_username(String userName) {
	    loginPage.enteringUsername(userName);
	}
	

	@When("user click on continue button")
	public void user_click_on_continue_button() {
	    loginPage.clickingcontinueButton();
	}
	
	@When("user enters password as {string}")
	public void user_enters_password(String passWord) {
	    loginPage.enteringPassword(passWord);
	}


	@Then("user clicks on login button")
	public void user_clicks_on_login_button() {
	    loginPage.clickingLoginButton();
	}
	
	@Then("user should redirect to amazon Dashboard")
	public void user_should_redirect_to_amazon_dashboard()  {
	    	    
	    Assert.assertTrue(loginPage.isDashBoardHeadingDisplayed());
	   
	}

	


	@Given("user enters search as {string}")
	public void user_enters_search(String productname) throws InterruptedException {
		Thread.sleep(1000);
	    loginPage.enteringproductname(productname);
	}
	

	@When("user click on search button")
	public void user_click_on_search_button() {
	    loginPage.clickingsearchButton();;
	}
	
	@When("filter the list of product")
	public void filter_the_list_of_product() {
	    loginPage.filterlist();
	}
	
	
	

	@Then("user clicks on first product")
	public void user_clicks_on_first_product() throws InterruptedException {
		Thread.sleep(1000);
	    loginPage.firstproduct();
	}
	
	@Then("user should redirect to product details page")
	public void user_should_redirect_to_product_details_page() {
	    	    
	    Assert.assertTrue(loginPage.isDashBoardHeadingDisplayed());
	}
	
	
	@Then("value of iphone product")
	public void value_of_iphone_product() throws InterruptedException {
		Thread.sleep(10000);
		loginPage.Valueofproduct();
	}

	@Then("User press addtocart button")
	public void user_press_addtocart_button() {
		
		
		loginPage.Addtocart();
		System.out.println();
	  
	}
	
	@Then("add to cart message")
	public void add_to_cart_message() throws InterruptedException {
		Thread.sleep(10000);
		loginPage.addtocartmessageprint();
	}

	
	
	





}
