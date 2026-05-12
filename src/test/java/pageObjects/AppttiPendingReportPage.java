package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AppttiPendingReportPage extends BasePage {

	public AppttiPendingReportPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Apptti Pending Report']")  
	WebElement textPlainAppttiPendingReport;
	
	@FindBy(how=How.XPATH,using="//input[@id='searchcounter']")  
	WebElement btnSearch;
	
	@FindBy(how=How.XPATH,using="//strong[contains(text(),'None    To   None')]")  
	WebElement txtPlainNoneToNoneReport;
	
	public boolean displayPlainTextAppttiPendingReport() {
		try {
			return textPlainAppttiPendingReport.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	
	public void clickSearch() {
		btnSearch.click();
	}
	
	public boolean displayPlainTextNoneToNoneReportStatus() {
		try {
			return (!txtPlainNoneToNoneReport.isDisplayed());
		}catch(Exception e) {
			return true;
		}
	}

}
