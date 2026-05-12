package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ChequeBouncedCollectionReportPage extends BasePage {

	public ChequeBouncedCollectionReportPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Cheque Bounced Collection Report']")  
	WebElement txtPlainChequeBouncedCollectionReport;
	
	@FindBy(how=How.XPATH,using="//input[@id='searchcounter']")  
	WebElement btnSearch;
	
	public boolean displayPlainTextChequeBouncedCollectionReport() {
		try {
			return txtPlainChequeBouncedCollectionReport.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	
	public void clickSearch() {
		btnSearch.click();
	}
	

}
