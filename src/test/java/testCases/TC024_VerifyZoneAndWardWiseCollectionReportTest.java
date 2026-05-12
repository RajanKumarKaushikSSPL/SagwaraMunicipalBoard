package testCases;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CitizenPage;
import pageObjects.DashBoardPage;
import pageObjects.LoginPage;
import pageObjects.WardWiseCollectionReportPage;
import testBase.BaseClass;

public class TC024_VerifyZoneAndWardWiseCollectionReportTest extends BaseClass {
	
	@Test(groups={"Sanity","Master","Regression"})
	public void verify_WardWiseCollectionReportPageExists() {
		
	logger.info("*****Starting TC024_VerifyZoneAndWardWiseCollectionTest*****");
	
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
	    
	    dp.clickUDTaxReportMenu();
	    logger.info("Clicked on UD Tax report menu..");
	    
	    Thread.sleep(2000);
	    
	    dp.clickZoneAndWardWiseCollectionReportSubMenu();
	    logger.info("Clicked on zone and ward wise collection report submenu..");
	    
	    Thread.sleep(2000);
	    
	   
	    WardWiseCollectionReportPage wwcrp=new WardWiseCollectionReportPage(driver);
	    
	    boolean targetpage=wwcrp.displayPlainTextWardWiseCollectionReport();
	    logger.info("Validating ward wise collection report page..");
	    
	    wwcrp.clickSearch();
	    logger.info("Clicked on search button..");
	    
	    Thread.sleep(3000);
	    
	    boolean targetreport=wwcrp.displayPlainTextNoneToNoneReportStatus();
	    logger.info("Validating ward wise collection report..");
	    
	    Assert.assertTrue(targetpage);
	    
	    Assert.assertTrue(targetreport);
	    
		}catch(Exception e) {
			logger.error("Test failed..");
			logger.debug("Debug logs..");
		    Assert.fail();
		}
	    
	    logger.info("*****Finished TC024_VerifyZoneAndWardWiseCollectionTest*****");
	}

}
