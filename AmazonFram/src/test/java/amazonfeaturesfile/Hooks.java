package amazonfeaturesfile;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import qa.DriverFactory;
import utility.ConfigLoader;

public class Hooks {
	WebDriver driver;
	DriverFactory df;
	
	@Before
	public void launchBrowser() throws IOException {
		df= new DriverFactory();
		
		driver = df.initBrowser(ConfigLoader.getConfigData("browser"));
		
		
		driver.manage().window().maximize();
	}
	

}
