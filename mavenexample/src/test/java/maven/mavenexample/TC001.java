package maven.mavenexample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TC001 extends BasePage 
{
  @Test
  public void customerLogin() {
	  HomePage page=new HomePage(driver);
	  page.login();
	  Assert.assertTrue(page.verifyLoginPage().equalsIgnoreCase("My account"));
  }
  @BeforeClass
  @Parameters("browser")
  public void SetUp(String browser) throws Exception {
	  browserLaunch(browser,getData("ecommerceurl"));
	
  }

  @AfterClass
  public void killProcess() {
  }

}
