package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	@FindBy(xpath = "//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continuebutton;
	
	@FindBy(xpath = "//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@id='signInSubmit']")
	private WebElement signInSubmit;
	
	@FindBy(xpath = "//a[@aria-label='Amazon.in']")
	private WebElement dashBoardHeading;

	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement searchbox;
	
	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	private WebElement searchbutton;
	

	
	@FindBy(xpath = "(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
	private WebElement firstproduct;
	

	@FindBy(xpath = "(//span[contains(text(),'52,999')])[1]")
	private WebElement Valueofproduct;
	

	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	private WebElement addtocart;
	
	@FindBy(xpath = "(//div/h4[contains(text(),'Added to Cart')]//following::h4[@class='a-alert-heading'])[2]")
	private WebElement messageaddtocart;
	
	@FindBy(xpath = "(//div/h4[contains(text(),'Added to Cart')]//following::h4[@class='a-alert-heading'])[1]")
	private WebElement notaddtocart;
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		}
	
	public void enteringUsername(String uName) {
		
		wait.until(ExpectedConditions.visibilityOf(username));
		
		username.sendKeys(uName);
	}
	
	public void clickingcontinueButton() {
	continuebutton.click();
	}
	
	public void enteringPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickingLoginButton() {
		signInSubmit.click();
	}
	
public boolean isDashBoardHeadingDisplayed() {
		
		wait.until(ExpectedConditions.visibilityOf(dashBoardHeading));
		return dashBoardHeading.isDisplayed();
	}
	
public void enteringproductname(String productname) {
	
	wait.until(ExpectedConditions.visibilityOf(searchbox));
	
	searchbox.sendKeys(productname);
}

public void clickingsearchButton() {
	searchbutton.click();
	}
	

public void filterlist()
{
	
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-component-type='s-search-result']")));

    // Validate the filtered list
    List<WebElement> filteredProducts = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));
    
    // Perform validations on the filtered products
    if (!filteredProducts.isEmpty()) {
        System.out.println("Filtered list contains products.");
        // Additional validations or assertions can be added here
    } else {
        System.out.println("No products found in the filtered list.");
        
    }
}

public void firstproduct() {
	firstproduct.click();
	}

public void Valueofproduct() {
	Valueofproduct.getText();
	}

public void Addtocart() {
	
	 JavascriptExecutor js = (JavascriptExecutor) driver;
     js.executeScript("arguments[0].click();", addtocart);
     
	
	
	}

public void addtocartmessageprint() {
	try {
	
	System.out.println("Add to Cart Message: " +messageaddtocart.getText());
	}
 catch (Exception e) 
{
    // Handle any exceptions that occur during the process
    System.out.println("Not added: " +notaddtocart.getText());
} 
	
}
}



