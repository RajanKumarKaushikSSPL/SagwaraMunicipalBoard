package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DCBULBWisePage extends BasePage {

	public DCBULBWisePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='DCB ULB Wise']")  
	WebElement textPlainDCBULBWise;
	
	public boolean displayPlainTextDCBULBWiseStatus() {
		try {
			return textPlainDCBULBWise.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}

}
