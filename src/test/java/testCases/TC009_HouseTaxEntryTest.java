package testCases;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CitizenPage;
import pageObjects.DashBoardPage;
import pageObjects.HouseTaxEntryPage;
import pageObjects.HouseTaxEntryViewPage;
import pageObjects.HouseTaxPaymentPage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC009_HouseTaxEntryTest extends BaseClass {
	
	
	@Test(groups={"Sanity","Master","Regression"})
	public void verify_HouseTaxEntryPage() throws InterruptedException {
		
		logger.info("*****Starting TC009_HouseTaxEntryTest*****");
		    
		    try {
		    CitizenPage cp=new CitizenPage(driver);
			
			String parentWindow = driver.getWindowHandle();
			cp.clickBtnOfficalLogin();
			logger.info("Clicked on Official Login Button..");
					
			Set<String> allWindows = driver.getWindowHandles();
					
			for (String window : allWindows) {
			    if (!window.equals(parentWindow)) {
				driver.switchTo().window(window);
			    break;
			  }
			}

			//LoginPage
			LoginPage lp=new LoginPage(driver);
					
			lp.setUserName(p.getProperty("username"));
			logger.info("Entered Valid username..");
					
		    lp.setPassword(p.getProperty("password"));
			logger.info("Entered Valid Password..");
					
			lp.clickLogin();
		    logger.info("Clicked on Login Button..");
		    
		    Thread.sleep(3000);
		    
		    //DashBoardPage
		    DashBoardPage dp=new DashBoardPage(driver);
		    
		    dp.clickAssessmentMenu();
		    logger.info("Clicked on assessment menu..");
		    
		    Thread.sleep(3000);
		    
		    dp.clickHouseTaxEntrySubMenu();
		    logger.info("Clicked on house tax entry sub menu..");
		    
		    Thread.sleep(3000);
		    
		    //HouseTaxEntryPage
		    
		    HouseTaxEntryPage htep=new HouseTaxEntryPage(driver);
		    
		    htep.setServiceNo(randomNumber());
		    logger.info("Entered service no. ..");
		    
		    htep.clickOldServiceNo();
		    logger.info("Clicked old service no. ..");
		    
		    Thread.sleep(3000);
		    
		    htep.selectWardNoDropdown("1");
		    logger.info("Selected ward no. ..");
		    
		    htep.clickArrowAreaName();
		    logger.info("Clicked on area name arrow..");
		    
		    Thread.sleep(2000);
		    
		    htep.setAreaName("test area - (88)");
		    logger.info("Entered area name ..");
		    
		    htep.selectRoadTypeDropdown("Interior Road");
		    logger.info("Selected road type..");
		    
		    htep.setPlotArea("1000");
		    logger.info("Entered plot area..");
		    
		    htep.setPlinthArea("1000");
		    logger.info("Entered plinth area..");
		    
		    htep.clickVaccantArea();
		    logger.info("Clicked on vaccant area..");
		    
		    htep.selectMultiStorageComplex("No");
		    logger.info("Selected multi storage complex..");
		    
		    htep.setPermanentAddressHouseNo(randomNumber());
		    logger.info("Entered permanent address house no. ..");
		    
		    htep.setPermanentAddressColony(randomString());
		    logger.info("Entered permanent address colony..");
		    
		    htep.setPermanentAddressStreet(randomString());
		    logger.info("Entered permanent address street..");
		    
		    htep.setPermanentAddressLandmark(randomString());
		    logger.info("Entered permanent address landmark..");
		    
		    htep.setPermanentAddressPincode(randomPinCode());
		    logger.info("Entered permanent address pincode..");
		    
		    htep.setPermanentAddressContactNo(randomNumber());
		    logger.info("Entered permanent address contact no. ..");
		    
		    htep.scrollTillPermanentAddressCity();
		    logger.info("Scrolled till permanent address city textbox..");
		    
		    htep.setPermanentAddressCity(randomString());
		    logger.info("Entered permanent address city..");
		    
		    htep.setCurrentAddressHouseNo(randomNumber());
		    logger.info("Entered Current address house no. ..");
		    
		    htep.setCurrentAddressColony(randomString());
		    logger.info("Entered Current address colony..");
		    
		    htep.setCurrentAddressStreet(randomString());
		    logger.info("Entered Current address street..");
		    
		    htep.setCurrentAddressLandmark(randomString());
		    logger.info("Entered Current address landmark..");
		    
		    htep.setCurrentAddressPincode(randomPinCode());
		    logger.info("Entered Current address pincode..");
		    
		    htep.setCurrentAddressContactNo(randomNumber());
		    logger.info("Entered Current address contact no. ..");
		    
		    htep.setCurrentAddressCity(randomString());
		    logger.info("Entered Current address city..");
		    
		    htep.setOwnerName(randomString());
		    logger.info("Entered owner name..");
		    
		    htep.selectGenderDropdown("Male");
		    logger.info("Selected gender..");
		    
		    htep.setAge(randomAge());
		    logger.info("Entered age..");
		    
		    htep.setMobileno(randomNumber());
		    logger.info("Entered mobile no. ..");
		    
		    htep.selectRelationDropdown("S/O");
		    logger.info("Selected relation..");
		    
		    htep.setGuardianName(randomString());
		    logger.info("Entered guardian name..");
		    
		    htep.selectOccupationDropdown("Service");
		    logger.info("Selected occupation..");
		    
		    htep.scrollTillViewButton();
		    logger.info("Scrolled till view button..");
		    
		    htep.selectFloorNameDropdown("Basement 1");
		    logger.info("Selected floor name..");
		    
		    htep.selectUsageTypeDropdown("RESIDENTIAL");
		    logger.info("Selected usage type..");
		    
		    htep.selectUsageCatDropdown("General");
		    logger.info("Selected usage category..");
		    
		    htep.selectFromYearDropdown("2007-2008");
		    logger.info("Selected from year..");
		    
		    htep.selectUpToYearDropdown("2025-2026");
		    logger.info("Selected up to year..");
		    
		    htep.setBuiltUpArea("1000");
		    logger.info("Entered built up area..");
		    
		    htep.selectDemandYearDropdown("2000-2001");
		    logger.info("Selected demand year..");
		    
		    htep.setAmount("10000");
		    logger.info("Entered amount..");
		    
		    htep.clickView();
		    logger.info("Clicked on view button..");
		    
		    //HouseTaxEntryViewPage
		    HouseTaxEntryViewPage htevp=new HouseTaxEntryViewPage(driver);
		    
		    htevp.scrollTillSaveButton();
		    logger.info("Scrolled till save button..");
		    
		    htevp.clickSave();
		    logger.info("Clicked on save button..");
		    
		    Thread.sleep(3000);
		    
		    //HouseTaxPaymentPage
		    
		    HouseTaxPaymentPage htpp=new HouseTaxPaymentPage(driver);
		    
		    htpp.selectPaymentMode("CHEQUE");
		    logger.info("Selected payment mode..");
		    
		    htpp.setRefNo("1");
		    logger.info("Entered ref. no. ..");
		    
		    htpp.selectCalendarRefDate();
		    logger.info("Selected date..");
		    
		    htpp.setBankName("SBI");
		    logger.info("Entered bank name..");
		    
		    htpp.setBranchName("Harmu");
		    logger.info("Entered branch name..");
		    
		    htpp.uploadFile("C:\\Users\\welcome\\Desktop\\sample PNG.png");
		    logger.info("Uploaded file..");
		    
		    htpp.setRemarks("testing purpose");
		    logger.info("Entered remarks..");
		    
		    htpp.clickPayNow();
		    logger.info("Clicked on pay now button..");
		    
		    Assert.assertTrue(true);
		    
		    }catch(Exception e) {
		    	logger.error("Test failed..");
				logger.debug("Debug logs..");
				Assert.fail();
		    }
		    
		    logger.info("*****Finished TC009_HouseTaxEntryTest*****");
		
	}

}
