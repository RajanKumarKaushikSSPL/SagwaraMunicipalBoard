package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TaxCollectionReportPage extends BasePage {

	public TaxCollectionReportPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Tax Collection Report']")  
	WebElement txtPlainTaxCollectionReport;
	
	public boolean displayPlainTextTaxCollectionReport() {
		try {
			return txtPlainTaxCollectionReport.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	

}
