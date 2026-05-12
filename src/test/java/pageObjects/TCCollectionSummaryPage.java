package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TCCollectionSummaryPage extends BasePage {

	public TCCollectionSummaryPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='TC Collection Summary']")  
	WebElement textPlainTCCollectionSummary;
	
	@FindBy(how=How.XPATH,using="//input[@id='searchteam']")  
	WebElement btnSearch;
	
	@FindBy(how=How.XPATH,using="//strong[contains(text(),'None    To   None')]")  
	WebElement textPlainNoneToNoneReport;
	
	public boolean displayPlainTextTCCollectionSummaryStatus() {
		try {
			return textPlainTCCollectionSummary.isDisplayed();
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
