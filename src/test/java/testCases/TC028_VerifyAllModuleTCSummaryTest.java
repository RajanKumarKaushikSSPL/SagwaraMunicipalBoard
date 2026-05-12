package testCases;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AllModuleOperatorWiseCollectionPage;
import pageObjects.CitizenPage;
import pageObjects.DashBoardPage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC028_VerifyAllModuleTCSummaryTest extends BaseClass {
	
	@Test(groups={"Sanity","Master","Regression"})
	public void verify_AllModuleOperatorWiseCollectionPageExists() {
		
	logger.info("*****Starting TC028_VerifyAllModuleTCSummaryTest*****");
	
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
	    
	    dp.clickAllModuleTCSummarySubMenu();
	    logger.info("Clicked on all module TC summary submenu..");
	    
	    Thread.sleep(2000);
	    
	    AllModuleOperatorWiseCollectionPage amowcp=new AllModuleOperatorWiseCollectionPage(driver);
	    
	    boolean targetpage=amowcp.displayPlainTextAllModuleOperatorWiseCollection();
	    logger.info("Validating all module operator wise collection page..");
	    
	    amowcp.clickSearch();
	    logger.info("Clicked on search button..");
	    
	    Thread.sleep(3000);
	    
	    boolean targetreport=amowcp.displayPlainTextNoneToNoneReportStatus();
	    logger.info("Validating all module operator wise collection report..");
	    
	    Assert.assertTrue(targetpage);
	    
	    Assert.assertTrue(targetreport);
	    
		}catch(Exception e) {
			logger.error("Test failed..");
			logger.debug("Debug logs..");
		    Assert.fail();
		}
	    
	    logger.info("*****Finished TC028_VerifyAllModuleTCSummaryTest*****");
	}

}
