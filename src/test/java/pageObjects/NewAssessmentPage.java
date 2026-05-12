package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class NewAssessmentPage extends BasePage {

	public NewAssessmentPage(WebDriver driver) {
		super(driver);
	}
	
	JavascriptExecutor js;
	
	@FindBy(how=How.XPATH,using="//input[@id='ver_mobile']")
	WebElement txtMobileNo;
	
	@FindBy(how=How.XPATH,using="//input[@id='Verify']")
	WebElement btnVerify;
	
	@FindBy(how=How.XPATH,using="//input[@id='ver_otp']")
	WebElement txtOTP;
	
	@FindBy(how=How.XPATH,using="//input[@id='Verify_otp']")
	WebElement btnVerifyOTP;
	
	@FindBy(how=How.XPATH,using="//select[@id='ward']")
	WebElement drpDwnWardNo;
	
	@FindBy(how=How.XPATH,using="//select[@id='ward_area']")
	WebElement drpDwnAreaName;
	
	@FindBy(how=How.XPATH,using="//select[@id='road_type']")
	WebElement drpDwnRoadType;
	
	@FindBy(how=How.XPATH,using="//input[@id='plot_area']")
	WebElement txtPlotArea;
	
	@FindBy(how=How.XPATH,using="//input[@id='plinth_area']")
	WebElement txtPlinthArea;
	
	@FindBy(how=How.XPATH,using="//input[@id='vacant_area']")
	WebElement txtVacantArea;
	
	@FindBy(how=How.XPATH,using="//select[@id='multi_storage_complex']")
	WebElement drpDwnMultiStorageComplex;
	
	@FindBy(how=How.XPATH,using="//select[@id='is_ex_party']")
	WebElement drpDwnIsExParty;
	
	@FindBy(how=How.XPATH,using="//input[@id='perm_house_no']")
	WebElement txtPermanentAddressHouseNo;
	
	@FindBy(how=How.XPATH,using="//input[@id='perm_city']")
	WebElement txtPermanentAddressColony;
	
	@FindBy(how=How.XPATH,using="//input[@id='perm_mohalla']")
	WebElement txtPermanentAddressStreet;
	
	@FindBy(how=How.XPATH,using="//input[@id='perm_landmark']")
	WebElement txtPermanentAddressLandmark;
	
	@FindBy(how=How.XPATH,using="//input[@id='perm_pincode']")
	WebElement txtPermanentAddressPinCode;
	
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
	WebElement txtCurrentAddressPinCode;
	
	@FindBy(how=How.XPATH,using="//input[@id='temp_contact_no']")
	WebElement txtCurrentAddressContactno;
	
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
	
	@FindBy(how=How.XPATH,using="//select[@id='id_relation']")
	WebElement drpDwnRelation;
	
	@FindBy(how=How.XPATH,using="//input[@id='guardian_name']")
	WebElement txtGuardianName;
	
	@FindBy(how=How.XPATH,using="//select[@id='occupation']")
	WebElement drpDwnOccupation;
	
	@FindBy(how=How.XPATH,using="//b[normalize-space()='Floor Details']")
	WebElement txtPlainFloorDetails;
	
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
	
	@FindBy(how=How.XPATH,using="//input[@id='latitude']")
	WebElement eleLattitude;
	
	@FindBy(how=How.XPATH,using="//input[@id='longitude']")
	WebElement eleLongitude;
	
	@FindBy(how=How.XPATH,using="//button[@id='View']")
	WebElement btnView;
	
	@FindBy(how=How.XPATH,using="//button[@id='Save']")
	WebElement btnSave;
	
	@FindBy(how=How.XPATH,using="(//div[@class='row'])[1]/div/span/strong")
	WebElement txtPlainServiceNo;
	
	public void setMobileNo(String mobileno) {
		txtMobileNo.sendKeys(mobileno);
	}
	
	public void clickVerify() {
		btnVerify.click();;
	}
	
	public void setOTP(String otp) {
		txtOTP.sendKeys(otp);
	}
	
	public void clickVerifyOTP() {
		btnVerifyOTP.click();;
	}
	
	public void selectDrpDwnWardNo(String option) {
		Select s=new Select(drpDwnWardNo);
		s.selectByVisibleText(option);
	}
	
	public void selectDrpDwnAreaName(String option) {
		Select s=new Select(drpDwnAreaName);
		s.selectByVisibleText(option);
	}
	
	public void selectRoadType(String option) {
		Select s=new Select(drpDwnRoadType);
		s.selectByVisibleText(option);
	}
	
	public void clearPlotArea() {
		txtPlotArea.clear();
	}
	
	public void setPlotArea(String plotarea) {
		txtPlotArea.sendKeys(plotarea);
	}
	
	public void clearPlinthArea() {
		txtPlinthArea.clear();
	}
	
	public void setPlinthArea(String plintharea) {
		txtPlinthArea.sendKeys(plintharea);
	}
	
	public void clearVacantArea() {
		txtVacantArea.clear();
	}
	
	public void setVacantArea(String vacantarea) {
		txtVacantArea.sendKeys(vacantarea);
	}
	
	public void clickVacantArea() {
		txtVacantArea.click();;
	}
	
	public void selectMultiStorageComplex(String option) {
		Select s=new Select(drpDwnMultiStorageComplex);
		s.selectByVisibleText(option);
	}
	
	public void selectIsExParty(String option) {
		Select s=new Select(drpDwnIsExParty);
		s.selectByVisibleText(option);
	}
	
	public void scrollTillCurrentAddressCity() {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", txtCurrentAddressCity);
	}
	
	public void setPermanentHouseNo(String permanenthouseno) {
		txtPermanentAddressHouseNo.sendKeys(permanenthouseno);
	}
	
	public void setPermanentAddressColony(String permanentaddresscolony) {
		txtPermanentAddressColony.sendKeys(permanentaddresscolony);
	}
	
	public void setPermanentAddressStreet(String permanentaddressstreet) {
		txtPermanentAddressStreet.sendKeys(permanentaddressstreet);
	}
	
	public void setPermanentAddressLandmark(String permanentaddresslandmark) {
		txtPermanentAddressLandmark.sendKeys(permanentaddresslandmark);
	}
	
	public void setPermanentAddressPinCode(String permanentaddresspincode) {
		txtPermanentAddressPinCode.sendKeys(permanentaddresspincode);
	}
	
	public void setPermanentAddressCity(String permanentaddresscity) {
		txtPermanentAddressCity.sendKeys(permanentaddresscity);
	}
	
	public void setCurrentHouseNo(String currenthouseno) {
		txtCurrentAddressHouseNo.sendKeys(currenthouseno);
	}
	
	public void setCurrentAddressColony(String currentaddresscolony) {
		txtCurrentAddressColony.sendKeys(currentaddresscolony);
	}
	
	public void setCurrentAddressStreet(String currentaddressstreet) {
		txtCurrentAddressStreet.sendKeys(currentaddressstreet);
	}
	
	public void setCurrentAddressLandmark(String currentaddresslandmark) {
		txtCurrentAddressLandmark.sendKeys(currentaddresslandmark);
	}
	
	public void setCurrentAddressPinCode(String currentaddresspincode) {
		txtCurrentAddressPinCode.sendKeys(currentaddresspincode);
	}
	
	public void setCurrentAddressContactno(String currrentaddresscontactno) {
		txtCurrentAddressContactno.sendKeys(currrentaddresscontactno);
	}
	
	public void setCurrentAddressCity(String currentaddresscity) {
		txtCurrentAddressCity.sendKeys(currentaddresscity);
	}
	
	public void scrollTillOwnerDetailsPlainText() {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", txtPlainOwnerDetails);
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
	
	public void scrollTillFloorDetailsPlainText() {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", txtPlainFloorDetails);
	}
	
	public void selectFloorNameDropDown(String option) {
		Select s=new Select(drpDwnFloorName);
		s.selectByVisibleText(option);
	}
	
	public void selectUsageTypeDropDown(String option) {
		Select s=new Select(drpDwnUsageType);
		s.selectByVisibleText(option);
	}
	
	public void selectUsageCatDropDown(String option) {
		Select s=new Select(drpDwnUsageCat);
		s.selectByVisibleText(option);
	}
	
	public void selectFromYearDropDown(String option) {
		Select s=new Select(drpDwnFromYear);
		s.selectByVisibleText(option);
	}
	
	public void selectUpToYearDropDown(String option) {
		Select s=new Select(drpDwnUpToYear);
		s.selectByVisibleText(option);
	}
	
	public void setBuiltUpArea(String builtuparea) {
		txtBuiltUpArea.sendKeys(builtuparea);
	}
	
	public void scrollTillOccuptationDropDown() {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", drpDwnOccupation);
	}
	
	public void setLattitude(String value) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);",eleLattitude, "value", value);
	}
	
	public void setLongitude(String value) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);",eleLongitude, "value", value);
	}
	
	public void clickView() {
		btnView.click();
	}
	
	public void scrollTillBottomOfPage() {
		js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public void clickSave() {
		btnSave.click();
	}
	
	public void getServiceNoPlainText() {
		String serviceno=txtPlainServiceNo.getText();
		System.out.println("Sevice no. is:"+serviceno);
	}
	
	
	
	
}
