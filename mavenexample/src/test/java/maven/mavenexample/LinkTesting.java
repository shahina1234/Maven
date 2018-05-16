package maven.mavenexample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;

public class LinkTesting extends BasePage{
  
  @BeforeMethod
  @Parameters("browser")
  public void setup(String browser) throws Exception {
	  browserLaunch(browser,getData("flipkarturl"));
  }
  @Test
  public void linktesting() {
	  driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div/div/div/div[1]/form/div/div[1]/div/input")).sendKeys("cooler");
  }
  @AfterMethod
  public void killprocess() {
	  driver.close();
	  
  }

}
