package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PropertyListPage extends BasePage {

	public PropertyListPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Property List']")  
	WebElement txtPlainPropertyList;
	
	public boolean isPropertyListPageExists() {
		try {
		return txtPlainPropertyList.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}

}
