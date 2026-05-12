package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashBoardPage extends BasePage {
	
	public DashBoardPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH,using="//span[@class='pull-left font-weight-bold']")  
	WebElement textDashBoard;
	
	@FindBy(how=How.XPATH,using="(//div[@id='dropdownMenuLink'])[2]")
	WebElement logoSuperAdminProfile;
	
	@FindBy(how=How.XPATH,using="//span[@class='sign_out_btn']")
	WebElement btnLogOut;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[contains(text(),'UD Tax Set Up')]")
	WebElement menuUDTaxSetUp;
	
	@FindBy(how=How.XPATH,using="(//a[text()='Assessment  '])[2]")
	WebElement menuAssessment;
	
	@FindBy(how=How.XPATH,using="(//a[text()=' House Tax Entry '])[2]")
	WebElement subMenuHouseTaxEntry;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Legacy Entry']")
	WebElement subMenuLegacyEntry;
	
	@FindBy(how=How.XPATH,using="(//a[text()='UD Tax  '])[2]")
	WebElement menuUDTax;
	
	@FindBy(how=How.XPATH,using="(//a[text()=' Search Property '])[2]")
	WebElement subMenuSearchProperty;
	
	@FindBy(how=How.XPATH,using="(//a[text()=' Document Upload '])[2]")
	WebElement subMenuDocUpload;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Update Property Details']")
	WebElement subMenuUpdatePropertyDetails;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Last Payment Update']")
	WebElement subMenuLastPaymentUpdate;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Update Owner Details']")
	WebElement subMenuUpdateOwnerDetails;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Ward Update']")
	WebElement subMenuWardUpdate;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Adjustment']")
	WebElement subMenuAdjustment;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='House Tax Last Payment Update']")
	WebElement subMenuHTaxLastPaymentUpdate;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[contains(text(),'UD Tax Report')]")
	WebElement menuUDTaxReport;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Counter Report']")
	WebElement subMenuCounterReport;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='TC Collection Summary']")
	WebElement subMenuTCCollectionSummary;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='DCB Report']")
	WebElement subMenuDCBReport;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='SAF Report']")
	WebElement subMenuSAFReport;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Zone and Ward Wise Collection Report']")
	WebElement subMenuZoneAndWardWiseCollectionReport;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Payment Mode Wise Collection']")
	WebElement subMenuPaymentModeWiseCollection;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='ULB Report']")
	WebElement subMenuULBReport;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Transaction Deactivate Report']")
	WebElement subMenuTransactionDeactivateReport;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='ALL Module TC Summary']")
	WebElement subMenuAllModuleTCSummary;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Print All Payment Reciept']")
	WebElement subMenuPrintAllPaymentReceipt;
	
	@FindBy(how=How.XPATH,using="(//a[text()=' PropertyWise DCB '])[2]")
	WebElement subMenuPropertyWiseDCB;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Print All Demand Reciept']")
	WebElement subMenuPrintAllDemandReceipt;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Reassesment Diff']")
	WebElement subMenuReassessmentDiff;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Cheque Bounced Collection Report']")
	WebElement subMenuchequeBouncedCollectionReport;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Tax Collection Report']")
	WebElement subMenuTaxCollectionReport;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Appti List']")
	WebElement subMenuApptiList;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Apptti Pending Report']")
	WebElement subMenuAppttiPendingReport;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Appti Reject List']")
	WebElement subMenuApptiRejectList;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='TC Visit Report']")
	WebElement subMenuTCVisitReport;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='TC Visit Summary']")
	WebElement subMenuTCVisitSummary;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Property Wise TC Visit']")
	WebElement subMenuPropertyWiseTCVisit;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='TL Visit Report']")
	WebElement subMenuTLVisitReport;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='All Updation Report']")
	WebElement subMenuAllUpdationReport;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[contains(text(),'Property Survey')]")
	WebElement menuPropertySurvey;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Survey Report']")
	WebElement subMenuSurveyReport;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Survey Summary Report']")
	WebElement subMenuSurveySummaryReport;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Survey Team Summary']")
	WebElement subMenuSurveyTeamSummary;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Survey Assessed List']")
	WebElement subMenuSurveyAssessedList;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Survey Assessed Report']")
	WebElement subMenuSurveyAssessedReport;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Wardwise Survey Report']")
	WebElement subMenuWardWiseSurveyReport;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Survey Pending Report']")
	WebElement subMenuSurveyPendingReport;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Survey Level Summary Report']")
	WebElement subMenuSurveyLevelSummaryReport;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Userwise Forward Summary']")
	WebElement subMenuUserWiseForwardSummary;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Userwise Survey Edit Report']")
	WebElement subMenuUserWiseSurveyEditReport;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Survey Modification Report']")
	WebElement subMenuSurveyModificationReport;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Survey Geotagging Report']")
	WebElement subMenuSurveyGeotaggingReport;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Ex-Party Survey Notice']")
	WebElement subMenuExPartySurveyNotice;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Survey Notice List']")
	WebElement subMenuSurveyNoticeList;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Bulk Survey Notice Print']")
	WebElement subMenuBulkSurveyNoticePrint;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Survey Notice Received List']")
	WebElement subMenuSurveyNoticeReceivedList;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Survey Notice Received Report']")
	WebElement subMenuSurveyNoticeReceivedReport;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Survey Notice Distributed Report']")
	WebElement subMenuSurveyNoticeDistributedReport;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Survey Demand Report']")
	WebElement subMenuSurveyDemandReport;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='Survey GIS Update']")
	WebElement subMenuSurveyGISUpdate;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[contains(text(),'UD Tax Mail')]")
	WebElement menuUDTaxMail;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[contains(text(),'Accounts')]")
	WebElement menuAccounts;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[contains(text(),'Survey Mail')]")
	WebElement menuSurveyMail;
	
    JavascriptExecutor js;
	
	public boolean isDashBoardPageExists() {
		try {
		return (textDashBoard.isDisplayed());
		}catch(Exception e) {
			return false;
		}
	}
	
	public void clickLogoSuperAdminProfile() {
		logoSuperAdminProfile.click();	
	}
	
	public void clickBtnLogOut() {
		btnLogOut.click();	
	}
	
	public void clickUDTaxSetUpMenu() {
		menuUDTaxSetUp.click();
	}
	
	public void clickAssessmentMenu() {
		menuAssessment.click();
	}
	
	public void clickHouseTaxEntrySubMenu() {
		subMenuHouseTaxEntry.click();
	}
	
	public void clickLegacyEntrySubMenu() {
		subMenuLegacyEntry.click();
	}
	
	public void clickUDTaxMenu() {
		menuUDTax.click();
	}
	
	public void clickSearchPropertySubMenu() {
		subMenuSearchProperty.click();
	}
	
	public void clickDocUploadSubMenu() {
		subMenuDocUpload.click();
	}
	
	public void clickUpdatePropertyDetailsSubMenu() {
		subMenuUpdatePropertyDetails.click();
	}
	
	public void clickLastPaymentUpdateSubMenu() {
		subMenuLastPaymentUpdate.click();
	}
	
	public void clickUpdateOwnerDetailsSubMenu() {
		subMenuUpdateOwnerDetails.click();
	}
	
	public void clickWardUpdateSubMenu() {
		subMenuWardUpdate.click();
	}
	
	public void clickAdjustmentSubMenu() {
		subMenuAdjustment.click();
	}
	
	public void clickHTaxLastPaymentUpdateSubMenu() {
		subMenuHTaxLastPaymentUpdate.click();
	}
	
	public void clickUDTaxReportMenu() {
		menuUDTaxReport.click();
	}
	
	public void clickCounterReportSubMenu() {
		subMenuCounterReport.click();
	}
	
	public void clickTCCollectionSummarySubMenu() {
		subMenuTCCollectionSummary.click();
	}
	
	public void clickDCBReportSubMenu() {
		subMenuDCBReport.click();
	}
	
	public void clickSAFReportSubMenu() {
		subMenuSAFReport.click();
	}
	
	public void clickZoneAndWardWiseCollectionReportSubMenu() {
		subMenuZoneAndWardWiseCollectionReport.click();
	}
	
	public void clickPaymentModeWiseCollectionSubMenu() {
		subMenuPaymentModeWiseCollection.click();
	}
	
	public void clickULBReportSubMenu() {
		subMenuULBReport.click();
	}
	
	public void clickTransactionDeactivateReportSubMenu() {
		subMenuTransactionDeactivateReport.click();
	}
	
	public void clickAllModuleTCSummarySubMenu() {
		subMenuAllModuleTCSummary.click();
	}
	
	public void clickPrintAllPaymentReceiptSubMenu() {
		subMenuPrintAllPaymentReceipt.click();
	}
	
	public void scrollTillPropertyWiseDCBSubmenu() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subMenuPropertyWiseDCB);
	}
	
	public void scrollTillUpMost() {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0)");
	}
	
	public void clickPropertyWiseDCBSubMenu() {
		subMenuPropertyWiseDCB.click();
	}
	
	public void scrollTillPrintAllDemandReceiptSubmenu() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subMenuPrintAllDemandReceipt);
	}
	
	public void clickPrintAllDemandReceiptSubMenu() {
		subMenuPrintAllDemandReceipt.click();
	}
	
	public void scrollTillReassessmentDiffSubmenu() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subMenuReassessmentDiff);
	}
	
	public void clickReassessmentDiffSubMenu() {
		subMenuReassessmentDiff.click();
	}
	
	public void scrollTillChequeBouncedCollectionReportSubmenu() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subMenuchequeBouncedCollectionReport);
	}
	
	public void clickChequeBouncedCollectionReportSubMenu() {
		subMenuchequeBouncedCollectionReport.click();
	}
	
	public void scrollTillTaxCollectionReportSubmenu() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subMenuTaxCollectionReport);
	}
	
	public void clickTaxCollectionReportSubMenu() {
		subMenuTaxCollectionReport.click();
	}
	
	public void scrollTillApptiListSubmenu() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subMenuApptiList);
	}
	
	public void clickApptiListSubMenu() {
		subMenuApptiList.click();
	}
	
	public void scrollTillAppttiPendingReportSubmenu() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subMenuAppttiPendingReport);
	}
	
	public void clickAppttiPendingReportSubMenu() {
		subMenuAppttiPendingReport.click();
	}
	
	public void scrollTillApptiRejectListSubmenu() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subMenuApptiRejectList);
	}
	
	public void clickApptiRejectListSubMenu() {
		subMenuApptiRejectList.click();
	}
	
	public void scrollTillTCVisitReportSubmenu() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subMenuTCVisitReport);
	}
	
	public void clickTCVisitReportSubMenu() {
		subMenuTCVisitReport.click();
	}
	
	public void scrollTillTCVisitSummarySubmenu() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subMenuTCVisitSummary);
	}
	
	public void clickTCVisitSummarySubMenu() {
		subMenuTCVisitSummary.click();
	}
	
	public void scrollTillPropertyWiseTCVisitSubmenu() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subMenuPropertyWiseTCVisit);
	}
	
	public void clickPropertyWiseTCVisitSubMenu() {
		subMenuPropertyWiseTCVisit.click();
	}
	
	public void scrollTillTLVisitReportSubmenu() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subMenuTLVisitReport);
	}
	
	public void clickTLVisitReportSubMenu() {
		subMenuTLVisitReport.click();
	}
	
	public void scrollTillAllUpdationReportSubmenu() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subMenuAllUpdationReport);
	}
	
	public void clickAllUpdationReportSubMenu() {
		subMenuAllUpdationReport.click();
	}
	
	public void clickPropertySurveyMenu() {
		menuPropertySurvey.click();
	}
	
	public void scrollTillSurveyReportSubmenu() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subMenuSurveyReport);
	}
	
	public void clickSurveyReportSubMenu() {
		subMenuSurveyReport.click();
	}
	
	public void scrollTillSurveySummaryReportSubmenu() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subMenuSurveySummaryReport);
	}
	
	public void clickSurveySummaryReportSubMenu() {
		subMenuSurveySummaryReport.click();
	}
	
	public void scrollTillSurveyTeamSummarySubmenu() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subMenuSurveyTeamSummary);
	}
	
	public void clickSurveyTeamSummarySubMenu() {
		subMenuSurveyTeamSummary.click();
	}
	
	public void scrollTillSurveyAssessedListSubmenu() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subMenuSurveyAssessedList);
	}
	
	public void clickSurveyAssessedListSubMenu() {
		subMenuSurveyAssessedList.click();
	}
	
	public void scrollTillSurveyAssessedReportSubmenu() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subMenuSurveyAssessedReport);
	}
	
	public void clickSurveyAssessedReportSubMenu() {
		subMenuSurveyAssessedReport.click();
	}
	
	public void scrollTillWardWiseSurveyReportSubmenu() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subMenuWardWiseSurveyReport);
	}
	
	public void clickWardWiseSurveyReportSubMenu() {
		subMenuWardWiseSurveyReport.click();
	}
	
	public void scrollTillSurveyPendingReportSubmenu() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subMenuSurveyPendingReport);
	}
	
	public void clickSurveyPendingReportSubMenu() {
		subMenuSurveyPendingReport.click();
	}
	
	public void scrollTillSurveyLevelSummaryReportSubmenu() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subMenuSurveyLevelSummaryReport);
	}
	
	public void clickSurveyLevelSummaryReportSubMenu() {
		subMenuSurveyLevelSummaryReport.click();
	}
	
	public void scrollTillUserWiseForwardSummarySubmenu() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subMenuUserWiseForwardSummary);
	}
	
	public void clickUserWiseForwardSummarySubMenu() {
		subMenuUserWiseForwardSummary.click();
	}
	
	public void scrollTillUserWiseSurveyEditReportSubmenu() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subMenuUserWiseSurveyEditReport);
	}
	
	public void clickUserWiseSurveyEditReportSubMenu() {
		subMenuUserWiseSurveyEditReport.click();
	}
	
	public void scrollTillSurveyModificationReportSubmenu() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subMenuSurveyModificationReport);
	}
	
	public void clickSurveyModificationReportSubMenu() {
		subMenuSurveyModificationReport.click();
	}
	
	public void scrollTillSurveyGeotaggingReportSubmenu() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subMenuSurveyGeotaggingReport);
	}
	
	public void clickSurveyGeotaggingReportSubMenu() {
		subMenuSurveyGeotaggingReport.click();
	}
	
	public void scrollTillExPartySurveyNoticeSubmenu() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subMenuExPartySurveyNotice);
	}
	
	public void clickExPartySurveyNoticeSubMenu() {
		subMenuExPartySurveyNotice.click();
	}
	
	public void scrollTillSurveyNoticeListSubmenu() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subMenuSurveyNoticeList);
	}
	
	public void clickSurveyNoticeListSubMenu() {
		subMenuSurveyNoticeList.click();
	}
	
	public void scrollTillBulkSurveyNoticePrintSubmenu() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subMenuBulkSurveyNoticePrint);
	}
	
	public void clickBulkSurveyNoticePrintSubMenu() {
		subMenuBulkSurveyNoticePrint.click();
	}
	
	public void scrollTillSurveyNoticeReceivedListSubmenu() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subMenuSurveyNoticeReceivedList);
	}
	
	public void clickSurveyNoticeRecivedListSubMenu() {
		subMenuSurveyNoticeReceivedList.click();
	}
	
	public void scrollTillSurveyNoticeReceivedReportSubmenu() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subMenuSurveyNoticeReceivedReport);
	}
	
	public void clickSurveyNoticeRecivedReportSubMenu() {
		subMenuSurveyNoticeReceivedReport.click();
	}
	
	public void scrollTillSurveyNoticeDistributedReportSubmenu() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subMenuSurveyNoticeDistributedReport);
	}
	
	public void clickSurveyNoticeDistributedReportSubMenu() {
		subMenuSurveyNoticeDistributedReport.click();
	}
	
	public void scrollTillSurveyDemandReportSubmenu() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subMenuSurveyDemandReport);
	}
	
	public void clickSurveyDemandReportSubMenu() {
		subMenuSurveyDemandReport.click();
	}
	
	public void scrollTillSurveyGISUpdateSubmenu() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subMenuSurveyGISUpdate);
	}
	
	public void clickSurveyGISUpdateSubMenu() {
		subMenuSurveyGISUpdate.click();
	}
	
	public void clickUDTaxMailMenu() {
		menuUDTaxMail.click();
	}
	
	public void clickAccountsMenu() {
		menuAccounts.click();
	}
	
	public void clickSurveyMailMenu() {
		menuSurveyMail.click();
	}
	
	
}
