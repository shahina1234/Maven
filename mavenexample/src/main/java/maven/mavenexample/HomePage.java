package maven.mavenexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(linkText="Sign in")WebElement signIn;
	@FindBy(id="email")WebElement email;
	@FindBy(id="passwd")WebElement passwd;
	@FindBy(id="SubmitLogin")WebElement SubmitLogin;
	@FindBy(xpath="//h1[text()='My account']")WebElement verifyAccount;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void login() 
	{
		signIn.click();
		email.sendKeys("qatest@gmail.com");
		passwd.sendKeys("password");
		SubmitLogin.click();
	}
	/**
	 * 
	 * @return
	 */
	public String verifyLoginPage()
	{
		return verifyAccount.getText();
	}
	}

