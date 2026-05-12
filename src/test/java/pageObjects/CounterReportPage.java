package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CounterReportPage extends BasePage {

	public CounterReportPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Counter Report']")  
	WebElement textPlainCounterReport;
	
	@FindBy(how=How.XPATH,using="//input[@id='searchcounter']")  
	WebElement btnSearch;
	
	@FindBy(how=How.XPATH,using="//strong[contains(text(),'None    To   None')]")  
	WebElement txtPlainNoneToNoneReport;
	
	public boolean displayPlainTextCounterReportStatus() {
		try {
			return textPlainCounterReport.isDisplayed();
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
