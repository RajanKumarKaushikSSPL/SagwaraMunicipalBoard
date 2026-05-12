package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class HouseTaxEntryPage extends BasePage {

	public HouseTaxEntryPage(WebDriver driver) {
		super(driver);
	}
	
	JavascriptExecutor js;
	
	@FindBy(how=How.XPATH,using="//span[text()='House Tax Entry ']")
	WebElement txtPlainHouseTaxEntry;
	
    @FindBy(how=How.XPATH,using="//input[@id='service_no']")
	WebElement txtServiceNo;
    
    @FindBy(how=How.XPATH,using="//input[@id='old_service_no']")
   	WebElement txtOldServiceNo;
    
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
	WebElement txtPermanentAddressColony;
	
	@FindBy(how=How.XPATH,using="//input[@id='perm_mohalla']")
	WebElement txtPermanentAddressStreet;
	
	@FindBy(how=How.XPATH,using="//input[@id='perm_landmark']")
	WebElement txtPermanentAddressLandmark;
	
	@FindBy(how=How.XPATH,using="//input[@id='perm_pincode']")
	WebElement txtPermanentAddressPincode;
	
	@FindBy(how=How.XPATH,using="//input[@id='perm_contact_no']")
	WebElement txtPermanentAddressContactNo;
	
	@FindBy(how=How.XPATH,using="//input[@id='perm_address']")
	WebElement txtPermanentAddressCity;
	
	@FindBy(how=How.XPATH,using="//input[@id='temp_house_no']")
	WebElement txtCurrentAddressHouseNo;
	
	@FindBy(how=How.XPATH,using="//input[@id='temp_city']")
	WebElement txtCurrentAddressColony;
	
	@FindBy(how=How.XPATH,using="//input[@id='temp_mohalla']")
	WebElement txtCurrentAddressStreet;
	
	@FindBy(how=How.XPATH,using="//input[@id='temp_landmark']")
	WebElement txtCurrentAddressLandmark;
	
	@FindBy(how=How.XPATH,using="//input[@id='temp_pincode']")
	WebElement txtCurrentAddressPincode;
	
	@FindBy(how=How.XPATH,using="//input[@id='temp_contact_no']")
	WebElement txtCurrentAddressContactNo;
	
	@FindBy(how=How.XPATH,using="//input[@id='temp_address']")
	WebElement txtCurrentAddressCity;
	
	@FindBy(how=How.XPATH,using="//b[normalize-space()='Owner Details']")
	WebElement txtPlainOwnerDetails;
	
	@FindBy(how=How.XPATH,using="//input[@id='owner_name']")
	WebElement txtOwnerName;
	
	@FindBy(how=How.XPATH,using="//select[@id='id_gender']")
	WebElement drpDwnGender;
	
	@FindBy(how=How.XPATH,using="//input[@id='age']")
	WebElement txtAge;
	
	@FindBy(how=How.XPATH,using="//input[@id='mobile_no']")
	WebElement txtMobileNo;
	
	@FindBy(how=How.XPATH,using="//select[@id='id_relation']")
	WebElement drpDwnRelation;
	
	@FindBy(how=How.XPATH,using="//input[@id='guardian_name']")
	WebElement txtGuardianName;
	
	@FindBy(how=How.XPATH,using="//select[@id='occupation']")
	WebElement drpDwnOccupation;
	
	@FindBy(how=How.XPATH,using="//select[@id='floor_name1']")
	WebElement drpDwnFloorName;
	
	@FindBy(how=How.XPATH,using="//select[@id='usage_type1']")
	WebElement drpDwnUsageType;
	
	@FindBy(how=How.XPATH,using="//select[@id='usage_sub_cat1']")
	WebElement drpDwnUsageCat;
	
	@FindBy(how=How.XPATH,using="//select[@id='from_year1']")
	WebElement drpDwnFromYear;
	
	@FindBy(how=How.XPATH,using="//select[@id='upto_year1']")
	WebElement drpDwnUpToYear;
	
	@FindBy(how=How.XPATH,using="//input[@id='builtup_area1']")
	WebElement txtBuiltUpArea;
	
	@FindBy(how=How.XPATH,using="//select[@id='demand_year1']")
	WebElement drpDwnDemandYear;
	
	@FindBy(how=How.XPATH,using="//input[@id='dmd_amount1']")
	WebElement txtAmount;
	
	@FindBy(how=How.XPATH,using="//button[@id='View']")
	WebElement btnView;
	
	public boolean isHouseTaxEntryPageExists() {
		try {
		return (txtPlainHouseTaxEntry.isDisplayed());
		}catch(Exception e) {
			return false;
		}
	}
	
	public void setServiceNo(String serviceno) {
		txtServiceNo.sendKeys(serviceno);
	}
	
	public void clickOldServiceNo() {
		txtOldServiceNo.click();;
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
	
	public void clickVaccantArea() {
		txtVaccantArea.click();;
	}
	
	public void selectMultiStorageComplex(String option) {
		Select s=new Select(drpDwnMultiStorageComplex);
		s.selectByVisibleText(option);
	}
	
	public void setPermanentAddressHouseNo(String houseno) {
		txtPermanentAddressHouseNo.sendKeys(houseno);
	}
	
	public void setPermanentAddressColony(String colony) {
		txtPermanentAddressColony.sendKeys(colony);
	}
	
	public void setPermanentAddressStreet(String street) {
		txtPermanentAddressStreet.sendKeys(street);
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
	
	public void scrollTillPermanentAddressCity() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", txtPermanentAddressCity);
	}
	
	public void setPermanentAddressCity(String city) {
		txtPermanentAddressCity.sendKeys(city);
	}
	
	public void setCurrentAddressHouseNo(String houseno) {
		txtCurrentAddressHouseNo.sendKeys(houseno);
	}
	
	public void setCurrentAddressColony(String colony) {
		txtCurrentAddressColony.sendKeys(colony);
	}
	
	public void setCurrentAddressStreet(String street) {
		txtCurrentAddressStreet.sendKeys(street);
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
	
	public void setCurrentAddressCity(String city) {
		txtCurrentAddressCity.sendKeys(city);
	}
	
	public void setOwnerName(String ownername) {
		txtOwnerName.sendKeys(ownername);
	}
	
	public void selectGenderDropdown(String option) {
		Select s=new Select(drpDwnGender);
		s.selectByVisibleText(option);
	}
	
	public void setAge(String age) {
		txtAge.sendKeys(age);
	}
	
	public void setMobileno(String mobileno) {
		txtMobileNo.sendKeys(mobileno);
	}
	
	public void selectRelationDropdown(String option) {
		Select s=new Select(drpDwnRelation);
		s.selectByVisibleText(option);
	}
	
	public void setGuardianName(String guardianname) {
		txtGuardianName.sendKeys(guardianname);
	}
	
	public void selectOccupationDropdown(String option) {
		Select s=new Select(drpDwnOccupation);
		s.selectByVisibleText(option);
	}
	
	public void scrollTillViewButton() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", btnView);
	}
	
	public void selectFloorNameDropdown(String option) {
		Select s=new Select(drpDwnFloorName);
		s.selectByVisibleText(option);
	}
	
	public void selectUsageTypeDropdown(String option) {
		Select s=new Select(drpDwnUsageType);
		s.selectByVisibleText(option);
	}
	
	public void selectUsageCatDropdown(String option) {
		Select s=new Select(drpDwnUsageCat);
		s.selectByVisibleText(option);
	}
	
	public void selectFromYearDropdown(String option) {
		Select s=new Select(drpDwnFromYear);
		s.selectByVisibleText(option);
	}
	
	public void selectUpToYearDropdown(String option) {
		Select s=new Select(drpDwnUpToYear);
		s.selectByVisibleText(option);
	}
	
	public void setBuiltUpArea(String builtuparea) {
		txtBuiltUpArea.sendKeys(builtuparea);
	}
	
	public void selectDemandYearDropdown(String option) {
		Select s=new Select(drpDwnDemandYear);
		s.selectByVisibleText(option);
	}
	
	public void setAmount(String amount) {
		txtAmount.sendKeys(amount);
	}
	
	public void clickView() {
		btnView.click();
	}
	

}
