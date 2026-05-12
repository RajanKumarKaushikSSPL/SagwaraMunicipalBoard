package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WardWiseSurveyReportPage extends BasePage {

	public WardWiseSurveyReportPage(WebDriver driver) {
		super(driver);
    }
	
	@FindBy(how=How.XPATH,using="//span[text()='Wardwise Survey Report']")  
	WebElement textPlainWardWiseSurveyReport;
	
	@FindBy(how=How.XPATH,using="//input[@id='searchcounter']")  
	WebElement btnSearch;
	
	@FindBy(how=How.XPATH,using="//strong[contains(text(),'None    To   None')]")  
	WebElement textPlainNoneToNoneReport;
	
	public boolean displayPlainTextWardWiseSurveyReport() {
		try {
			return textPlainWardWiseSurveyReport.isDisplayed();
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
