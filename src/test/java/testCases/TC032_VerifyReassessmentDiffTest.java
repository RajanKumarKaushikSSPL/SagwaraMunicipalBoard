package testCases;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CitizenPage;
import pageObjects.DashBoardPage;
import pageObjects.LoginPage;
import pageObjects.ReassessmentDiffReportPage;
import testBase.BaseClass;

public class TC032_VerifyReassessmentDiffTest extends BaseClass {
	
	@Test(groups={"Sanity","Master","Regression"})
	public void verify_ReassessmentDiffReportPageExists() {
		
	logger.info("*****Starting TC032_VerifyReassessmentDiffTest*****");
	
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
	    
	    dp.scrollTillReassessmentDiffSubmenu();
	    logger.info("Scrolled till reassessment diff submenu..");
	    
	    Thread.sleep(3000);
	    
	    dp.clickReassessmentDiffSubMenu();
	    logger.info("Clicked on reassessment diff submenu..");
	    
	    Thread.sleep(2000);
	    
	    dp.scrollTillUpMost();
	    logger.info("Scrolled till upper most of web page..");
	    
	    Thread.sleep(2000);
	    
	    ReassessmentDiffReportPage rdrp=new ReassessmentDiffReportPage(driver);
	    
	    boolean targetpage=rdrp.displayPlainTextReassessmentDiffReport();
	    logger.info("Validating reassessment diff. report page..");
	    
	    rdrp.clickSearch();
	    logger.info("Clicked on search button..");
	    
	    Thread.sleep(3000);
	    
	    Assert.assertTrue(targetpage);
	    
	    }catch(Exception e) {
			logger.error("Test failed..");
			logger.debug("Debug logs..");
		    Assert.fail();
		}
	    
	    logger.info("*****Finished TC032_VerifyReassessmentDiffTest*****");
	}


}
