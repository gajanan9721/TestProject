package qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {
	static WebDriver driver;
	
	public WebDriver initBrowser(String browser) {
		
		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}
		
		else if (browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		
		return driver;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

}
