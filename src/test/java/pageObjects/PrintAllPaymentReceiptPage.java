package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PrintAllPaymentReceiptPage extends BasePage {

	public PrintAllPaymentReceiptPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Print All Payment Reciept']")  
	WebElement txtPlainPrintAllPaymentReceipt;
	
	@FindBy(how=How.XPATH,using="//input[@id='searchcounter']")  
	WebElement btnSearch;
	
	public boolean displayPlainTextPrintAllPaymentReceipt() {
		try {
			return txtPlainPrintAllPaymentReceipt.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	
	public void clickSearch() {
		btnSearch.click();
	}

}
