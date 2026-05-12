package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class LegacyEntryPage extends BasePage {

	public LegacyEntryPage(WebDriver driver) {
		super(driver);
	}
	
	JavascriptExecutor js;
	
	@FindBy(how=How.XPATH,using="//span[text()='Legacy Entry']")
	WebElement txtPlainLegacyEntry;
	
	@FindBy(how=How.XPATH,using="//input[@id='old_service_no']")
	WebElement txtServiceNo;
	
	@FindBy(how=How.XPATH,using="//select[@id='ward']")
	WebElement drpDwnWardNo;
	
	@FindBy(how=How.XPATH,using="//span[@role='presentation']")
	WebElement arrowAreaName;
	
	@FindBy(how=How.XPATH,using="//input[@role='textbox']")
	WebElement txtAreaName;
	
	@FindBy(how=How.XPATH,using="//select[@id='road_type']")
	WebElement drpDwnRoadType;
	
	@FindBy(how=How.XPATH,using="//input[@id='plot_area']")
	WebElement txtPlotArea;
	
	@FindBy(how=How.XPATH,using="//input[@id='plinth_area']")
	WebElement txtPlinthArea;
	
	@FindBy(how=How.XPATH,using="//input[@id='vacant_area']")
	WebElement txtVaccantArea;
	
	@FindBy(how=How.XPATH,using="//select[@id='multi_storage_complex']")
	WebElement drpDwnMultiStorageComplex;
	
	@FindBy(how=How.XPATH,using="//input[@id='perm_house_no']")
	WebElement txtPermanentAddressHouseNo;
	
	@FindBy(how=How.XPATH,using="//input[@id='perm_city']")
	WebElement txtPermanentAddressCity;
	
	@FindBy(how=How.XPATH,using="//input[@id='perm_mohalla']")
	WebElement txtPermanentAddressMohalla;
	
	@FindBy(how=How.XPATH,using="//input[@id='perm_landmark']")
	WebElement txtPermanentAddressLandmark;
	
	@FindBy(how=How.XPATH,using="//input[@id='perm_pincode']")
	WebElement txtPermanentAddressPincode;
	
	@FindBy(how=How.XPATH,using="(//input[@id='perm_contact_no'])[1]")
	WebElement txtPermanentAddressContactNo;
	
	@FindBy(how=How.XPATH,using="//textarea[@id='perm_address']")
	WebElement txtPermanentAddress;
	
	@FindBy(how=How.XPATH,using="//b[normalize-space()='Current Address']")
	WebElement txtPlainCurrentAddress;
	
	@FindBy(how=How.XPATH,using="//input[@id='temp_house_no']")
	WebElement txtCurrentAddressHouseNo;
	
	@FindBy(how=How.XPATH,using="//input[@id='temp_city']")
	WebElement txtCurrentAddressCity;
	
	@FindBy(how=How.XPATH,using="//input[@id='temp_mohalla']")
	WebElement txtCurrentAddressMohalla;
	
	@FindBy(how=How.XPATH,using="//input[@id='temp_landmark']")
	WebElement txtCurrentAddressLandmark;
	
	@FindBy(how=How.XPATH,using="//input[@id='temp_pincode']")
	WebElement txtCurrentAddressPincode;
	
	@FindBy(how=How.XPATH,using="//input[@id='temp_contact_no']")
	WebElement txtCurrentAddressContactNo;
	
	@FindBy(how=How.XPATH,using="//textarea[@id='temp_address']")
	WebElement txtCurrentAddress;
	
	@FindBy(how=How.XPATH,using="//b[normalize-space()='Owner Details']")
	WebElement txtPlainOwnerDetails;
	
	@FindBy(how=How.XPATH,using="//input[@id='owner_name']")
	WebElement txtOwnerName;
	
	@FindBy(how=How.XPATH,using="//select[@id='id_gender']")
	WebElement drpDwnGender;
	
	@FindBy(how=How.XPATH,using="//input[@id='age']")
	WebElement txtAge;
	
	@FindBy(how=How.XPATH,using="(//input[@id='perm_contact_no'])[2]")
	WebElement txtMobileNo;
	
	@FindBy(how=How.XPATH,using="//select[@id='id_relation']")
	WebElement drpDwnRelation;
	
	@FindBy(how=How.XPATH,using="//input[@id='guardian_name']")
	WebElement txtGuardianName;
	
	@FindBy(how=How.XPATH,using="//select[@id='id_occupation']")
	WebElement drpDwnOccupation;
	
	@FindBy(how=How.XPATH,using="//select[@id='fy1']")
	WebElement drpDwnFinYear;
	
	@FindBy(how=How.XPATH,using="//input[@id='tax1']")
	WebElement txtYearlyTax;
	
	@FindBy(how=How.XPATH,using="//input[@id='file_name']")
	WebElement btnChooseFile;
	
	@FindBy(how=How.XPATH,using="//textarea[@id='remarks']")
	WebElement txtRemarks;
	
	@FindBy(how=How.XPATH,using="//button[@id='save']")
	WebElement btnSave;
	
	@FindBy(how=How.XPATH,using="//div[@role='alert']")
	WebElement txtPlainConfirmationMsg;
	
	public boolean isLegacyEntryPageExists() {
		try {
		return (txtPlainLegacyEntry.isDisplayed());
		}catch(Exception e) {
			return false;
		}
	}
	
	public void setServiceNo(String serviceno) {
		txtServiceNo.sendKeys(serviceno);
	}
	
	public void selectWardNoDropdown(String option) {
		Select s=new Select(drpDwnWardNo);
		s.selectByVisibleText(option);
	}
	
	public void clickArrowAreaName() {
		arrowAreaName.click();
	}
	
	public void setAreaName(String areaname) {
		txtAreaName.sendKeys(areaname);
		txtAreaName.sendKeys(Keys.ENTER);
	}
	
	public void selectRoadTypeDropdown(String option) {
		Select s=new Select(drpDwnRoadType);
		s.selectByVisibleText(option);
	}
	
	public void setPlotArea(String plotarea) {
		txtPlotArea.sendKeys(plotarea);
	}
	
	public void setPlinthArea(String plintharea) {
		txtPlinthArea.sendKeys(plintharea);
	}
	
	public void setVaccantArea(String vaccantarea) {
		txtVaccantArea.sendKeys(vaccantarea);
	}
	
	public void selectMultiStorageComplex(String option) {
		Select s=new Select(drpDwnMultiStorageComplex);
		s.selectByVisibleText(option);
	}
	
	public void setPermanentAddressHouseNo(String houseno) {
		txtPermanentAddressHouseNo.sendKeys(houseno);
	}
	
	public void setPermanentAddressCity(String permanentaddresscity) {
		txtPermanentAddressCity.sendKeys(permanentaddresscity);
	}
	
	public void setPermanentAddressMohalla(String permanentaddressmohalla) {
		txtPermanentAddressMohalla.sendKeys(permanentaddressmohalla);
	}
	
	public void setPermanentAddressLandmark(String landmark) {
		txtPermanentAddressLandmark.sendKeys(landmark);
	}
	
	public void setPermanentAddressPincode(String pincode) {
		txtPermanentAddressPincode.sendKeys(pincode);
	}
	
	public void setPermanentAddressContactNo(String contactno) {
		txtPermanentAddressContactNo.sendKeys(contactno);
	}
	
	public void setPermanentAddress(String permanentaddress) {
		txtPermanentAddress.sendKeys(permanentaddress);
	}
	
	public void scrollTillCurrentAddressPlainText() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", txtPlainCurrentAddress);
	}
	
	public void setCurrentAddressHouseNo(String houseno) {
		txtCurrentAddressHouseNo.sendKeys(houseno);
	}
	
	public void setCurrentAddressCity(String currentaddresscity) {
		txtCurrentAddressCity.sendKeys(currentaddresscity);
	}
	
	public void setCurrentAddressMohalla(String currentaddressmohalla) {
		txtCurrentAddressMohalla.sendKeys(currentaddressmohalla);
	}
	
	public void setCurrentAddressLandmark(String landmark) {
		txtCurrentAddressLandmark.sendKeys(landmark);
	}
	
	public void setCurrentAddressPincode(String pincode) {
		txtCurrentAddressPincode.sendKeys(pincode);
	}
	
	public void setCurrentAddressContactNo(String contactno) {
		txtCurrentAddressContactNo.sendKeys(contactno);
	}
	
	public void setCurrentAddress(String permanentaddress) {
		txtCurrentAddress.sendKeys(permanentaddress);
	}
	
	public void setOwnerName(String ownername) {
		txtOwnerName.sendKeys(ownername);
	}
	
	public void selectGenderDropDown(String option) {
		Select s=new Select(drpDwnGender);
		s.selectByVisibleText(option);
	}
	
	public void setAge(String age) {
		txtAge.sendKeys(age);
	}
	
	public void setMobileNumber(String mobileno) {
		txtMobileNo.sendKeys(mobileno);
	}
	
	public void selectRelationDropDown(String option) {
		Select s=new Select(drpDwnRelation);
		s.selectByVisibleText(option);
	}
	
	public void setGuardianName(String guardianname) {
		txtGuardianName.sendKeys(guardianname);
	}
	
	public void selectOccupationDropDown(String option) {
		Select s=new Select(drpDwnOccupation);
		s.selectByVisibleText(option);
	}
	
	public void scrollTillSaveButton() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", btnSave);
	}
	
	public void selectFinYearDropDown(String option) {
		Select s=new Select(drpDwnFinYear);
		s.selectByVisibleText(option);
	}
	
	public void setYearlyTax(String yearlytax) {
		txtYearlyTax.sendKeys(yearlytax);
	}
	
	public void uploadFile(String path) {
		btnChooseFile.sendKeys(path);;
	}
	
	public void setRemarks(String remarks) {
		txtRemarks.sendKeys(remarks);
	}
	
	public void clickSave() {
		btnSave.click();
	}
	
	public boolean isPropertyEntryConfirmationMsgDisplayed() {
		try {
		return (txtPlainConfirmationMsg.isDisplayed());
		}catch(Exception e) {
			return false;
		}
    }
	

}
