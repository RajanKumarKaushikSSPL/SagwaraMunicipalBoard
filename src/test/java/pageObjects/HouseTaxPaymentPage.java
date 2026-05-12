package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class HouseTaxPaymentPage extends BasePage {

	public HouseTaxPaymentPage(WebDriver driver) {
		super(driver);
	}
	
	JavascriptExecutor js;
	
	@FindBy(how=How.XPATH,using="//button[@id='pay']")
	WebElement btnPayNow;
	
	@FindBy(how=How.XPATH,using="//select[@id='payment_mode']")
	WebElement drpDwnPaymentMode;
	
	@FindBy(how=How.XPATH,using="//input[@id='id_cheque_no']")
	WebElement txtRefNo;
	
	@FindBy(how=How.XPATH,using="//input[@id='id_cheque_dt']")
	WebElement calendarRefDate;
	
	@FindBy(how=How.XPATH,using="//table[@id='tcalGrid']/tbody/tr[4]/td[4]")
	WebElement date;
	
	@FindBy(how=How.XPATH,using="//input[@id='id_bank_name']")
	WebElement txtBankName;
	
	@FindBy(how=How.XPATH,using="//input[@id='id_branch_name']")
	WebElement txtBranchName;
	
	@FindBy(how=How.XPATH,using="//input[@id='id_chq_img']")
	WebElement btnImageUpload;
	
	@FindBy(how=How.XPATH,using="//textarea[@id='id_remarks']")
	WebElement txtRemarks;
	
	public void scrollTillPayNowButton() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", btnPayNow);
	}
	
	public void selectPaymentMode(String option) {
		Select s=new Select(drpDwnPaymentMode);
		s.selectByVisibleText(option);
	}
	
	public void setRefNo(String refno) {
		txtRefNo.sendKeys(refno);
	}
	
	public void selectCalendarRefDate() throws InterruptedException {
		calendarRefDate.click();
		Thread.sleep(2000);
		date.click();
		
	}
	
	public void setBankName(String bankname) {
		txtBankName.sendKeys(bankname);
	}
	
	public void setBranchName(String branchname) {
		txtBranchName.sendKeys(branchname);
	}
	
	public void uploadFile(String path) {
		btnImageUpload.sendKeys(path);
	}
	
	public void setRemarks(String remarks) {
		txtRemarks.sendKeys(remarks);
	}
	
	public void clickPayNow() {
		btnPayNow.click();
	}

}
