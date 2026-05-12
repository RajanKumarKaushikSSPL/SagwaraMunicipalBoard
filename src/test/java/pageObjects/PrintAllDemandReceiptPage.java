package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class PrintAllDemandReceiptPage extends BasePage {

	public PrintAllDemandReceiptPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Print All Demand Reciept']")  
	WebElement txtPlainPrintAllDemandReceipt;
	
	@FindBy(how=How.XPATH,using="//select[@id='id_ward_id']")  
	WebElement drpDwnWardNo;
	
	@FindBy(how=How.XPATH,using="//input[@name='from_amt']")  
	WebElement txtAmountFrom;
	
	@FindBy(how=How.XPATH,using="//input[@name='upto_amt']")  
	WebElement txtAmountUpTo;
	
	@FindBy(how=How.XPATH,using="//input[@id='searchcounter']")  
	WebElement btnSearch;
	
	public boolean displayPlainTextPrintAllDemandReceipt() {
		try {
			return txtPlainPrintAllDemandReceipt.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	
	public void selectWardNoDropDown(String option) {
		Select s=new Select(drpDwnWardNo);
		s.selectByVisibleText(option);
	}
	
	public void setAmountFrom(String amountfrom) {
		txtAmountFrom.sendKeys(amountfrom);
	}
	
	public void setAmountUpTO(String amountupto) {
		txtAmountUpTo.sendKeys(amountupto);
	}
	
	public void clickSearch() {
		btnSearch.click();
	}
	
	

}
