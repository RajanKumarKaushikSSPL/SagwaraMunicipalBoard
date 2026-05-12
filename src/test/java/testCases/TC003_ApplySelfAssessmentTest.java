package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CitizenPage;
import pageObjects.NewAssessmentPage;
import pageObjects.PropertyDetailsPage;
import pageObjects.PropertyTaxPage;
import testBase.BaseClass;

public class TC003_ApplySelfAssessmentTest extends BaseClass{
   
	@Test(groups={"Sanity","Master","Regression"})
	public void verify_applySelfAssessmentPage() throws InterruptedException {
		
		logger.info("*****Starting TC003_ApplySelfAssessment*****");
		
		try {
		//CitizenPage
		CitizenPage cp=new CitizenPage(driver);
		
		cp.clickOnUDTApplySelfAssessment();
		logger.info("Clicked on UDT Apply Self Assessment option..");
		
		//PropertyTaxPage
		PropertyTaxPage ptp=new PropertyTaxPage(driver);
		
		ptp.clickBtnSearch();
		logger.info("Clicked on Search Button..");
		
		//NewAssessmentPage
		NewAssessmentPage nap=new NewAssessmentPage(driver);
		
		nap.setMobileNo(randomNumber());
		logger.info("Entered Mobile No. ..");
		
		nap.clickVerify();
		logger.info("Clicked on Verify Button..");
		
		nap.setOTP("98357");
		logger.info("Entered OTP..");
		
		nap.clickVerifyOTP();
		logger.info("Clicked on verify OTP button..");
		
		nap.selectDrpDwnWardNo("1");
		logger.info("Selecting Ward no. ..");
		
		nap.selectDrpDwnAreaName("test area - (88)");
		logger.info("Selecting area name..");
		
		nap.selectRoadType("Interior Road");
		logger.info("Selecting road type..");
		
		nap.clearPlotArea();
		logger.info("Clearing plot area..");
		
		nap.setPlotArea("1000");
		logger.info("Entered Plot Area ..");
		
        nap.clearPlinthArea();
        logger.info("Clearing plinth area..");
        
		nap.setPlinthArea("1000");
		logger.info("Entered Plinth Area ..");
		
		//nap.clearVacantArea();
        //logger.info("Clearing Vacant area..");
        
		//nap.setVacantArea("0");
		//logger.info("Entered Vacant Area ..");
		
		nap.clickVacantArea();
		logger.info("Clicked in vacant Area ..");
		
		nap.selectMultiStorageComplex("No");
		logger.info("Selecting multi storage complex..");
		
		nap.selectIsExParty("No");
		logger.info("Selecting is ex party..");
		
		nap.scrollTillCurrentAddressCity();
		logger.info("Scrolling new assessment page till current address city..");
		
		nap.setPermanentHouseNo(randomNumber());
		logger.info("Entered permanent house no. ..");
		
		nap.setPermanentAddressColony(randomString());
		logger.info("Entered permanent address colony..");
		
		nap.setPermanentAddressStreet(randomString());
		logger.info("Entered permanent address street..");
		
		nap.setPermanentAddressLandmark(randomString());
		logger.info("Entered permanent address landmark..");
		
		nap.setPermanentAddressPinCode(randomPinCode());
		logger.info("Entered permanent address pin code..");
		
		nap.setPermanentAddressCity(randomString());
		logger.info("Entered permanent address city..");
		
		nap.setCurrentHouseNo(randomNumber());
		logger.info("Entered Current house no. ..");
		
		nap.setCurrentAddressColony(randomString());
		logger.info("Entered Current address colony..");
		
		nap.setCurrentAddressStreet(randomString());
		logger.info("Entered Current address street..");
		
		nap.setCurrentAddressLandmark(randomString());
		logger.info("Entered Current address landmark..");
		
		nap.setCurrentAddressPinCode(randomPinCode());
		logger.info("Entered Current address pin code..");
		
		nap.setCurrentAddressContactno(randomNumber());
		logger.info("Entered Current address contact no. ..");
		
		nap.setCurrentAddressCity(randomString());
		logger.info("Entered Current address city..");
		
		nap.scrollTillOwnerDetailsPlainText();
		logger.info("Scrolling new assessment page till owner details plain text..");
		
		nap.setOwnerName(randomString());
		logger.info("Entered Owner name..");
		
		nap.selectGenderDropdown("Male");
		logger.info("Selected Gender..");
		
		nap.setAge(randomAge());
		logger.info("Entered age..");
		
	    nap.selectRelationDropDown("S/O");
		logger.info("Selected relation..");
		
		nap.setGuardianName(randomString());
		logger.info("Entered guardian name..");
		
		nap.selectOccupationDropDown("Service");
		logger.info("Selected occupation..");
		
		nap.scrollTillOccuptationDropDown();
		logger.info("Scrolling new assessment page till occupation dropdown..");
		
		nap.selectFloorNameDropDown("Basement 1");
		logger.info("Selected floor name..");
		
		nap.selectUsageTypeDropDown("RESIDENTIAL");
		logger.info("Selected usage type..");
		
		nap.selectUsageCatDropDown("General");
		logger.info("Selected usage category..");
		
		nap.selectFromYearDropDown("2007-2008");
		logger.info("Selected from year..");
		
		nap.selectUpToYearDropDown("2025-2026");
		logger.info("Selected upto year..");
		
		nap.setBuiltUpArea("1000");
		logger.info("Entered built up area..");
		
		nap.setLattitude(randomNumber());
		logger.info("Set lattitude");
		
		nap.setLongitude(randomNumber());
		logger.info("Set longitude");
		
		nap.clickView();
		logger.info("Clicked on view button..");
		
		Thread.sleep(3000);
		
		nap.scrollTillBottomOfPage();
		logger.info("Scrolling till bottom of new assessment page..");
		
		Thread.sleep(3000);
		
	    nap.clickSave();
		logger.info("Clicked on save button");
		
		Thread.sleep(3000);
		
		nap.getServiceNoPlainText();
		logger.info("Get service no. ..");
		
        Thread.sleep(3000);
		
		//PropertyDetails Page 
        PropertyDetailsPage pdp=new PropertyDetailsPage(driver);
        
        pdp.scrollTillFloorDetailsPlainText();
		logger.info("Scrolling till bottom of floor details plain text..");
        
        //pdp.scrollTillDocumentUploadPlainText();
		//logger.info("Scrolling till bottom of document upload plain text..");
        
		Thread.sleep(3000);
		
        pdp.clickDocumentUpload1();
        logger.info("Clicked on upload button1..");
		
        Thread.sleep(3000);
		
		pdp.selectRadioButtonElectricityBill();
		logger.info("Selected electricity bill radio button..");
		
		pdp.uploadFile1("C:\\Users\\welcome\\Desktop\\sample PNG.png");
		logger.info("Uploaded file1..");
		
		pdp.clickUploadButtonOnModal1();
		logger.info("Clicked on upload button on modal1..");
		
		pdp.scrollTillDocumentUploadPlainText();
		logger.info("Scrolling till bottom of document upload plain text..");
		
		Thread.sleep(3000);
		
		pdp.clickDocumentUpload2();
        logger.info("Clicked on upload button2..");
        
        Thread.sleep(3000);
        
        pdp.selectRadioButtonVoterCard();
		logger.info("Selected voter card radio button..");
		
		pdp.uploadFile2("C:\\Users\\welcome\\Desktop\\sample PNG.png");
		logger.info("Uploaded file2..");
		
		pdp.clickUploadButtonOnModal2();
		logger.info("Clicked on upload button on modal2..");
		
		pdp.scrollTillDocumentUploadPlainText();
		logger.info("Scrolling till bottom of document upload plain text..");
		
		Thread.sleep(3000);
		
		pdp.clickDocumentUpload3();
        logger.info("Clicked on upload button3..");
        
        Thread.sleep(3000);
        
        pdp.selectRadioButtonKhataCopy();
		logger.info("Selected khata copy radio button..");
		
		pdp.uploadFile3("C:\\Users\\welcome\\Desktop\\sample PNG.png");
		logger.info("Uploaded file3..");
		
		pdp.clickUploadButtonOnModal3();
		logger.info("Clicked on upload button on modal3..");
		
		pdp.scrollTillDocumentUploadPlainText();
		logger.info("Scrolling till bottom of document upload plain text..");
		
		Thread.sleep(3000);
		
		pdp.clickSubmit();
		logger.info("Clicked on submit button..");
		
		Thread.sleep(3000);
		
		pdp.scrollTillPropertyDetailsPlainText();
		logger.info("Scrolling till property details plain text..");
		
		Thread.sleep(3000);
		
		pdp.clickViewLedger();
		logger.info("Clicked on view ledger button..");
		
		Thread.sleep(3000);
		
		pdp.clickBack();
		logger.info("Clicked on back button..");
		
		Thread.sleep(3000);
		
		pdp.clickPayUDTax();
		logger.info("Clicked on pay UD tax button..");
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		pdp.clickPayHouseTax();
		logger.info("Clicked on house tax button..");
		
		Thread.sleep(3000);
		
		}catch(Exception e) {
			logger.error("Test failed..");
			logger.debug("Debug logs..");
			Assert.fail();
		}
		
		logger.info("*****Finished TC003_ApplySelfAssessment*****");
		
	}
	
	
	
	
	
	
	
	
	
	
}
