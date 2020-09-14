package Sinergia.TP6;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestSelenium.*;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;




public class AppTest {
	private static SeleniumConfig config;
    private static String url = "https://www.google.com/";
	
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	  config = new SeleniumConfig();
	  WebDriver driver = config.getDriver();
	  
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  
  @Test
  public void tP6() throws InterruptedException {
	  config = new SeleniumConfig();
	  WebDriver driver = config.getDriver();
    driver.get("https://www.google.com.ar/");
    driver.manage().window().setSize(new Dimension(865, 696));
    driver.findElement(By.name("q")).sendKeys("http://advantageonlineshopping.com/");
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    driver.findElement(By.cssSelector(".g:nth-child(1) .LC20lb")).click();

	Thread.sleep(6000);
    driver.findElement(By.id("menuUserSVGPath")).click();
    driver.findElement(By.name("username")).sendKeys("Prueba");
    driver.findElement(By.name("password")).sendKeys("Prueba1234");
    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
	Thread.sleep(3000);
    driver.findElement(By.id("headphonesImg")).click();
    Thread.sleep(3000);
    driver.findElement(By.id("14")).click();
    driver.findElement(By.xpath("(//span[@id=\'rabbit\'])[2]")).click();
    driver.findElement(By.cssSelector(".plus")).click();
    driver.findElement(By.cssSelector(".plus")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".plus"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.cssSelector(".plus")).click();
    driver.findElement(By.name("save_to_cart")).click();
    Thread.sleep(3000);
    driver.findElement(By.id("checkOutPopUp")).click();
    js.executeScript("window.scrollTo(0,0)");
    Thread.sleep(4000);
    driver.findElement(By.id("next_btn")).click();
    driver.findElement(By.id("pay_now_btn_MasterCredit")).click();
    driver.findElement(By.cssSelector(".containMiniTitle")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".roboto-medium:nth-child(3)")).click();
    driver.close();
  }
}

