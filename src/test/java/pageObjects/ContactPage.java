package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContactPage extends BasePage {

	public ContactPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH,using="//body/div[1]")
	WebElement txtPlainHomeAndContactUs;
	
	public boolean isContactPageExists() {
		try {
		return (txtPlainHomeAndContactUs.isDisplayed());
		}catch(Exception e) {
			return false;
		}
    }

}
