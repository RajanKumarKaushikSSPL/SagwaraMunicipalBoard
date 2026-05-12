package testCases;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CitizenPage;
import pageObjects.DashBoardPage;
import pageObjects.LegacyEntryPage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC011_LegacyEntryTest extends BaseClass  {
    
	@Test(groups={"Sanity","Master","Regression"})
	public void verify_LegacyEntryPage() throws InterruptedException {
		
	  logger.info("*****Starting TC011_LegacyEntryTest*****");
	  
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
	    
	    dp.clickLegacyEntrySubMenu();
	    logger.info("Clicked on legacy entry sub menu..");
	    
	    Thread.sleep(3000);
	    
	    //LegacyEntryPage
	    
	    LegacyEntryPage lep=new LegacyEntryPage(driver);
	    
	    lep.setServiceNo(randomNumber());
	    logger.info("Entered service no. ..");
	    
	    lep.selectWardNoDropdown("1");
	    logger.info("Selected ward no. ..");
	    
	    lep.clickArrowAreaName();
	    logger.info("Clicked on area name arrow..");
	    
	    Thread.sleep(2000);
	    
	    lep.setAreaName("test area - (88)");
	    logger.info("Entered area name ..");
	    
	    lep.selectRoadTypeDropdown("Interior Road");
	    logger.info("Selected road type..");
	    
	    lep.setPlotArea("1000");
	    logger.info("Entered plot area..");
	    
	    lep.setPlinthArea("1000");
	    logger.info("Entered plinth area..");
	    
	    lep.setVaccantArea("0");
	    logger.info("Entered vaccant area..");
	    
	    lep.selectMultiStorageComplex("No");
	    logger.info("Selected multi storage complex..");
	    
	    lep.setPermanentAddressHouseNo(randomNumber());
	    logger.info("Entered permanent address house no. ..");
	    
	    lep.setPermanentAddressCity(randomString());
	    logger.info("Entered permanent address city..");
	    
	    lep.setPermanentAddressMohalla(randomString());
	    logger.info("Entered permanent address mohalla..");
	    
	    lep.setPermanentAddressLandmark(randomString());
	    logger.info("Entered permanent address landmark..");
	    
	    lep.setPermanentAddressPincode(randomPinCode());
	    logger.info("Entered permanent address pincode..");
	    
	    lep.setPermanentAddressContactNo(randomNumber());
	    logger.info("Entered permanent address contact no. ..");
	    
	    lep.setPermanentAddress(randomString());
	    logger.info("Entered permanent address..");
	    
	    lep.scrollTillCurrentAddressPlainText();
	    logger.info("Scrolled till current address plain text..");
	    
	    lep.setCurrentAddressHouseNo(randomNumber());
	    logger.info("Entered Current address house no. ..");
	    
	    lep.setCurrentAddressCity(randomString());
	    logger.info("Entered Current address city..");
	    
	    lep.setCurrentAddressMohalla(randomString());
	    logger.info("Entered Current address mohalla..");
	    
	    lep.setCurrentAddressLandmark(randomString());
	    logger.info("Entered Current address landmark..");
	    
	    lep.setCurrentAddressPincode(randomPinCode());
	    logger.info("Entered Current address pincode..");
	    
	    lep.setCurrentAddressContactNo(randomNumber());
	    logger.info("Entered Current address contact no. ..");
	    
	    lep.setCurrentAddress(randomString());
	    logger.info("Entered Current address..");
	    
	    lep.setOwnerName(randomString());
	    logger.info("Entered owner name..");
	    
	    lep.selectGenderDropDown("Male");
	    logger.info("Selected gender dropdown..");
	    
	    lep.setAge(randomAge());
	    logger.info("Entered age..");
	    
	    lep.setMobileNumber(randomNumber());
	    logger.info("Entered mobile no. ..");
	    
	    lep.selectRelationDropDown("S/O");
	    logger.info("Selected relation dropdown..");
	    
	    lep.setGuardianName(randomString());
	    logger.info("Entered guardian name..");
	    
	    lep.selectOccupationDropDown("Service");
	    logger.info("Selected occupation dropdown..");
	    
	    lep.scrollTillSaveButton();
	    logger.info("Scrolled till save button..");
	    
	    lep.selectFinYearDropDown("2007-2008");
	    logger.info("Selected financial year..");
	    
	    lep.setYearlyTax("10000");
	    logger.info("Entered yearly tax..");
	    
	    lep.uploadFile("C:\\Users\\welcome\\Desktop\\sample PNG.png");
	    logger.info("uploaded document..");
	    
	    lep.setRemarks(randomString());
	    logger.info("Entered remarks..");
	    
	    lep.clickSave();
	    logger.info("Clicked on save button");
	    
	    boolean msgdisplayed=lep.isPropertyEntryConfirmationMsgDisplayed();
	    logger.info("Validating confirmation msg..");
	    
	    Assert.assertTrue(msgdisplayed);
	    
	    }catch(Exception e) {
			logger.error("Test failed..");
			logger.debug("Debug logs..");
			Assert.fail();
		}
	
	  logger.info("*****Finished TC011_LegacyEntryTest*****");
	
	}
	
}
