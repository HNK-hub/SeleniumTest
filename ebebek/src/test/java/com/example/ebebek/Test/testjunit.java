// Generated by Selenium IDE
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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class testjunit {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void test12() {
    // Test name: Test12
    // Step # | name | target | value | comment
    // 1 | open | / |  | 
    driver.get("https://www.e-bebek.com/");
    // 2 | setWindowSize | 1936x1056 |  | 
    driver.manage().window().setSize(new Dimension(1936, 1056));
    // 3 | click | id=txtSearchBox |  | 
    driver.findElement(By.id("txtSearchBox")).click();
    // 4 | mouseOver | linkText=Kaşık Maması |  | 
    {
      WebElement element = driver.findElement(By.linkText("Kaşık Maması"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 5 | type | id=txtSearchBox | Kaşık maması | 
    driver.findElement(By.id("txtSearchBox")).sendKeys("Kaşık maması");
    // 6 | sendKeys | id=txtSearchBox | ${KEY_ENTER} | 
    driver.findElement(By.id("txtSearchBox")).sendKeys(Keys.ENTER);
    // 7 | runScript | window.scrollTo(0,59) |  | 
    js.executeScript("window.scrollTo(0,59)");
    // 8 | runScript | window.scrollTo(0,1700) |  | 
    js.executeScript("window.scrollTo(0,1700)");
    // 9 | runScript | window.scrollTo(0,2501) |  | 
    js.executeScript("window.scrollTo(0,2501)");
    // 10 | runScript | window.scrollTo(0,4800) |  | 
    js.executeScript("window.scrollTo(0,4800)");
    // 11 | click | css=.col-6:nth-child(44) .description |  | 
    driver.findElement(By.cssSelector(".col-6:nth-child(44) .description")).click();
    // 12 | mouseOver | css=.col-6:nth-child(45) .is-initialized > .ng-star-inserted |  | 
    {
      WebElement element = driver.findElement(By.cssSelector(".col-6:nth-child(45) .is-initialized > .ng-star-inserted"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 13 | runScript | window.scrollTo(0,1436) |  | 
    js.executeScript("window.scrollTo(0,1436)");
    // 14 | runScript | window.scrollTo(0,0) |  | 
    js.executeScript("window.scrollTo(0,0)");
    // 15 | click | id=addToCartBtn |  | 
    driver.findElement(By.id("addToCartBtn")).click();
    // 16 | click | id=btnShowCart |  | 
    driver.findElement(By.id("btnShowCart")).click();
    // 17 | mouseOver | id=btnGoToShippingAddress |  | 
    {
      WebElement element = driver.findElement(By.id("btnGoToShippingAddress"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 18 | click | id=btnGoToShippingAddress |  | 
    driver.findElement(By.id("btnGoToShippingAddress")).click();
    // 19 | click | css=.LoginPageTemplate:nth-child(2) |  | 
    driver.findElement(By.cssSelector(".LoginPageTemplate:nth-child(2)")).click();
    // 20 | click | css=.LeftContentSlot |  | 
    driver.findElement(By.cssSelector(".LeftContentSlot")).click();
  }
}
