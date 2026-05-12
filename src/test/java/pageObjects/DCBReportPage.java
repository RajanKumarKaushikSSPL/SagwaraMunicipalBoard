package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DCBReportPage extends BasePage{

	public DCBReportPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Dcb Report']")  
	WebElement txtPlainDCBReport;
	
	@FindBy(how=How.XPATH,using="//input[@id='view']")  
	WebElement btnSearch;
	
	public boolean displayPlainTextDCBReport() {
		try {
			return txtPlainDCBReport.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	
	public void clickSearch() {
		btnSearch.click();
	}

}
