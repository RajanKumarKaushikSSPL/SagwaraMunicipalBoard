package testCases;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.CitizenPage;
import pageObjects.DashBoardPage;
import pageObjects.HouseTaxEntryPage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC008_VerifyHouseTaxEntryTest extends BaseClass {
	
	@Test(groups={"Sanity","Master","Regression"})
	public void verify_HouseTaxEntryPageIsExists() throws InterruptedException {
		
		logger.info("*****Starting TC008_VerifyHouseTaxEntryPage*****");
		
		try {
		//CitizenPage
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
	    
	    boolean targetpage=htep.isHouseTaxEntryPageExists();
	    logger.info("Validating house tax entry page..");
	    
	    Assert.assertTrue(targetpage);
	    
		}catch(Exception e) {
			logger.error("Test failed..");
			logger.debug("Debug logs..");
			Assert.fail();
		}
		
		logger.info("*****Finished TC008_VerifyHouseTaxEntryPage*****");
	    
	}

}
