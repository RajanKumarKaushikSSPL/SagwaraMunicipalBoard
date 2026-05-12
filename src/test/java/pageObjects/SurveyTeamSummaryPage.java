package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SurveyTeamSummaryPage extends BasePage {

	public SurveyTeamSummaryPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Survey Team Summary']")  
	WebElement textPlainSurveyTeamSummary;
	
	@FindBy(how=How.XPATH,using="//input[@id='searchteam']")  
	WebElement btnSearch;
	
	@FindBy(how=How.XPATH,using="//strong[contains(text(),'None    To   None')]")  
	WebElement textPlainNoneToNoneReport;
	
	public boolean displayPlainTextSurveyTeamSummary() {
		try {
			return textPlainSurveyTeamSummary.isDisplayed();
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
