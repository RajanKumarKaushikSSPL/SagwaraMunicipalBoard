package testCases;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AllModuleReportPage;
import pageObjects.CitizenPage;
import pageObjects.DashBoardPage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC026_VerifyULBReportTest extends BaseClass {

	@Test(groups={"Sanity","Master","Regression"})
	public void verify_AllModuleReportPageExists() {
		
	logger.info("*****Starting TC026_VerifyULBReportTest*****");
	
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
	    
	    dp.clickULBReportSubMenu();
	    logger.info("Clicked on ULB report submenu..");
	    
	    Thread.sleep(2000);
	    
	    AllModuleReportPage amrp=new AllModuleReportPage(driver);
	    
	    boolean targetpage=amrp.displayPlainTextAllModuleReport();
	    logger.info("Validating all module report page..");
	    
	    amrp.clickSearch();
	    logger.info("Clicked on search button..");
	    
	    Assert.assertTrue(targetpage);
	    
	    }catch(Exception e) {
			logger.error("Test failed..");
			logger.debug("Debug logs..");
		    Assert.fail();
		}
	    
	    logger.info("*****Finished TC026_VerifyULBReportTest*****");
	}

}
