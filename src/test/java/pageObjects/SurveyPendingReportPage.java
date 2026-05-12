package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SurveyPendingReportPage extends BasePage {

	public SurveyPendingReportPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Survey Pending Report']")  
	WebElement textPlainSurveyPendingReport;
	
	@FindBy(how=How.XPATH,using="//input[@id='searchcounter']")  
	WebElement btnSearch;
	
	@FindBy(how=How.XPATH,using="//strong[contains(text(),'None    To   None')]")  
	WebElement textPlainNoneToNoneReport;
	
	public boolean displayPlainTextSurveyPendingReport() {
		try {
			return textPlainSurveyPendingReport.isDisplayed();
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
