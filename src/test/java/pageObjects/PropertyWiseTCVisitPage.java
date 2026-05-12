package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PropertyWiseTCVisitPage extends BasePage {

	public PropertyWiseTCVisitPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Propertywise Tc Visit']")  
	WebElement textPlainPropertyWiseTCVisit;
	
	@FindBy(how=How.XPATH,using="//input[@id='searchcounter']")  
	WebElement btnSearch;
	
	@FindBy(how=How.XPATH,using="//strong[contains(text(),'None    To   None')]")  
	WebElement textPlainNoneToNoneReport;
	
	public boolean displayPlainTextPropertyWiseTCVisit() {
		try {
			return textPlainPropertyWiseTCVisit.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	
	public void clickSearch() {
		btnSearch.click();
	}
	
	public boolean displayPlainTextNoneToNoneReportStatus() {
		try {
			return !textPlainNoneToNoneReport.isDisplayed();
		}catch(Exception e) {
			return true;
		}
	}

}
