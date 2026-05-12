package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='username']")
	WebElement txtUserName;
	
	@FindBy(how=How.XPATH,using="//input[@id='password']")
	WebElement txtPassword;
	
	@FindBy(how=How.XPATH,using="//input[@id='login']")
	WebElement btnLogin;
	
	public void clearUserName() {
		txtUserName.clear();
	}
	
	public void clearPassword() {
		txtPassword.clear();
	}
	
	public void setUserName(String username) {
		txtUserName.sendKeys(username);
	}
	
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	
	public void clickLogin() {
		btnLogin.click();;
	}
	
	
	
	
	
}
