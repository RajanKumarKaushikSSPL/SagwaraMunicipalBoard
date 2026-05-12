package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PropertyDetailsPage extends BasePage {

	public PropertyDetailsPage(WebDriver driver) {
		super(driver);
	}
	
	JavascriptExecutor js;
	
	@FindBy(how=How.XPATH,using="//b[normalize-space()='Floor Details']")
	WebElement txtPlainFloorDetails;
	
	@FindBy(how=How.XPATH,using="//b[normalize-space()='Document Upload']")
	WebElement txtPlainDocumentUpload;
	
	@FindBy(how=How.XPATH,using="//tbody/tr[2]/td[2]/a[1]")
	WebElement btnDocumentUpload1;
	
	@FindBy(how=How.XPATH,using="//div[@id='myModal1']/div/div")
	WebElement modalDocumentUpload1;
	
	@FindBy(how=How.XPATH,using="//div[normalize-space()='Electricity Bill']//input[@id='doc_detail_id']")
	WebElement radioButtonElectricityBill;
	
	@FindBy(how=How.XPATH,using="//form[@id='FORMNAME1']//div[@class='modal-body']//div//input[@id='doc_upload']")
	WebElement btnChooseFile1;
	
	@FindBy(how=How.XPATH,using="(//input[@id='upload_doc'])[1]")
	WebElement btnUploadModal1;
	
	@FindBy(how=How.XPATH,using="//tbody/tr[3]/td[2]/a[1]")
	WebElement btnDocumentUpload2;
	
	@FindBy(how=How.XPATH,using="//div[normalize-space()='Voter Card']//input[@id='doc_detail_id']")
	WebElement radioButtonVoterCard;
	
	@FindBy(how=How.XPATH,using="//form[@id='FORMNAME2']//div[@class='modal-body']//div//input[@id='doc_upload']")
	WebElement btnChooseFile2;
	
	@FindBy(how=How.XPATH,using="(//input[@id='upload_doc'])[2]")
	WebElement btnUploadModal2;
	
	@FindBy(how=How.XPATH,using="//tbody/tr[4]/td[2]/a[1]")
	WebElement btnDocumentUpload3;
	
	@FindBy(how=How.XPATH,using="//div[normalize-space()='Khata Copy']//input[@id='doc_detail_id']")
	WebElement radioButtonKhataCopy;
	
	@FindBy(how=How.XPATH,using="//form[@id='FORMNAME3']//div[@class='modal-body']//div//input[@id='doc_upload']")
	WebElement btnChooseFile3;
	
	@FindBy(how=How.XPATH,using="(//input[@id='upload_doc'])[3]")
	WebElement btnUploadModal3;
	
	@FindBy(how=How.XPATH,using="//input[@id='btn_save_docs']")
	WebElement btnSubmit;
	
	@FindBy(how=How.XPATH,using="//b[normalize-space()='Property Details']")
	WebElement txtPlainPropertyDetails;
	
	@FindBy(how=How.XPATH,using="//a[normalize-space()='View Ledger']")
	WebElement btnViewLedger;
	
	@FindBy(how=How.XPATH,using="//span[@class='pull-right']")
	WebElement btnBack;
	
	@FindBy(how=How.XPATH,using="//a[@class='btn btn-success mb-2'][normalize-space()='Pay UD Tax']")
	WebElement btnPayUDTax;
	
	@FindBy(how=How.XPATH,using="//a[normalize-space()='Pay House Tax']")
	WebElement btnPayHouseTax;
	
	public void scrollTillFloorDetailsPlainText() {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", txtPlainFloorDetails);
	}
	
	public void scrollTillDocumentUploadPlainText() {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", txtPlainDocumentUpload);
	}
	
	public void clickDocumentUpload1() {
		btnDocumentUpload1.click();
	}
	
	public void selectRadioButtonElectricityBill() {
		radioButtonElectricityBill.click();
	}
	
	public void uploadFile1(String path) {
		btnChooseFile1.sendKeys(path);;
	}
	
	public void clickUploadButtonOnModal1() {
		btnUploadModal1.click();
	}
	
	public void clickDocumentUpload2() {
		btnDocumentUpload2.click();
	}
	
	public void selectRadioButtonVoterCard() {
		radioButtonVoterCard.click();
	}
	
	public void uploadFile2(String path) {
		btnChooseFile2.sendKeys(path);;
	}
	
	public void clickUploadButtonOnModal2() {
		btnUploadModal2.click();
	}
	
	public void clickDocumentUpload3() {
		btnDocumentUpload3.click();
	}
	
	public void selectRadioButtonKhataCopy() {
		radioButtonKhataCopy.click();
	}
	
	public void uploadFile3(String path) {
		btnChooseFile3.sendKeys(path);;
	}
	
	public void clickUploadButtonOnModal3() {
		btnUploadModal3.click();
	}
	
	public void clickSubmit() {
		btnSubmit.click();
	}
	
	public void scrollTillPropertyDetailsPlainText() {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", txtPlainPropertyDetails);
	}
	
	public void clickViewLedger() {
		btnViewLedger.click();
	}
	
	public void clickBack() {
		btnBack.click();
	}
	
	public void clickPayUDTax() {
		btnPayUDTax.click();
	}
	
	public void clickPayHouseTax() {
		btnPayHouseTax.click();
	}
	
	
	

}
