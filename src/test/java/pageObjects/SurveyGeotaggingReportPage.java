package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SurveyGeotaggingReportPage extends BasePage {

	public SurveyGeotaggingReportPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Survey Geotagging Report']")  
	WebElement textPlainSurveyGeotaggingReport;
	
	@FindBy(how=How.XPATH,using="//input[@id='searchcounter']")  
	WebElement btnSearch;
	
	public boolean displayPlainTextSurveyGeotaggingReport() {
		try {
			return textPlainSurveyGeotaggingReport.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	
	public void clickSearch() {
		btnSearch.click();
	}


}
