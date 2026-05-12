package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SurveyLevelSummaryReportPage extends BasePage {

	public SurveyLevelSummaryReportPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Surveylevel Summary Report']")  
	WebElement textPlainSurveyLevelSummaryReport;
	
	@FindBy(how=How.XPATH,using="//input[@id='searchcounter']")  
	WebElement btnSearch;
	
	@FindBy(how=How.XPATH,using="//strong[contains(text(),'None    To   None')]")  
	WebElement textPlainNoneToNoneReport;
	
	public boolean displayPlainTextSurveyLevelSummaryReport() {
		try {
			return textPlainSurveyLevelSummaryReport.isDisplayed();
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
