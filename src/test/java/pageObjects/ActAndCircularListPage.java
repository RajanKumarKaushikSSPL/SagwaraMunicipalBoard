package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ActAndCircularListPage extends BasePage {

	public ActAndCircularListPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH,using="//body/div[1]")
	WebElement txtPlainHomeAndActAndCircularList;
	
	public boolean isAndActAndCircularListPageExists() {
		try {
		return (txtPlainHomeAndActAndCircularList.isDisplayed());
		}catch(Exception e) {
			return false;
		}
    }

}
