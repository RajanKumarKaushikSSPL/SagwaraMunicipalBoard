package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FeedbackPage extends BasePage {

	public FeedbackPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH,using="//body/div[1]")
	WebElement txtPlainHomeAndFeedback;
	
	public boolean isFeedbackPageExists() {
		try {
		return (txtPlainHomeAndFeedback.isDisplayed());
		}catch(Exception e) {
			return false;
		}
    }


}
