package TestSelenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumConfig {
	
	private WebDriver driver;
	
	public SeleniumConfig(){
		Capabilities capabilities = DesiredCapabilities.firefox();
		driver = new FirefoxDriver(capabilities);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	static {
	    System.setProperty("webdriver.gecko.driver", "/Users/Haytz/eclipse-workspace/TP6/bin/geckodriver.exe");
	    
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}	
	
	
}
