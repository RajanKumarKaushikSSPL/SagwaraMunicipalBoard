package testCases;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.CitizenPage;
import pageObjects.DashBoardPage;
import pageObjects.LoginPage;
import pageObjects.TransactionDeactivateReportPage;
import testBase.BaseClass;

public class TC027_VerifyTransactionDeactivateReportTest extends BaseClass {
	
	@Test(groups={"Sanity","Master","Regression"})
	public void verify_TransactionDeactivateReportPageExists() {
		
	logger.info("*****Starting TC027_VerifyTransactionDeactivateReportTest*****");
	
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
	    
	    dp.clickTransactionDeactivateReportSubMenu();
	    logger.info("Clicked on transaction deactivate report submenu..");
	    
	    Thread.sleep(2000);
	    
	    TransactionDeactivateReportPage tdrp=new TransactionDeactivateReportPage(driver);
	    
	    boolean targetpage=tdrp.displayPlainTextTransactionDeactivateReport();
	    logger.info("Validating transaction deactivate report page..");
	    
	    tdrp.clickSearch();
	    logger.info("Clicked on search button..");
	    
	    Thread.sleep(3000);
	    
	    boolean targetreport=tdrp.displayPlainTextNoneToNoneReportStatus();
	    logger.info("Validating transaction deactivate report..");
	    
	    Assert.assertTrue(targetpage);
	    
	    Assert.assertTrue(targetreport);
	    
		}catch(Exception e) {
			logger.error("Test failed..");
			logger.debug("Debug logs..");
		    Assert.fail();
		}
	    
	    logger.info("*****Finished TC027_VerifyTransactionDeactivateReportTest*****");
	}

}
