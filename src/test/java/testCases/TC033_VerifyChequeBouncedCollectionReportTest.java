package testCases;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ChequeBouncedCollectionReportPage;
import pageObjects.CitizenPage;
import pageObjects.DashBoardPage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC033_VerifyChequeBouncedCollectionReportTest extends BaseClass {
	
	@Test(groups={"Sanity","Master","Regression"})
	public void verify_ChequeBouncedCollectionReportPageExists() {
		
	logger.info("*****Starting TC033_VerifyChequeBouncedCollectionReportTest*****");
	
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
	    
	    dp.scrollTillChequeBouncedCollectionReportSubmenu();
	    logger.info("Scrolled till cheque bounced collection report submenu..");
	    
	    Thread.sleep(3000);
	    
	    dp.clickChequeBouncedCollectionReportSubMenu();
	    logger.info("Clicked on cheque bounced collection report submenu..");
	    
	    Thread.sleep(2000);
	    
	    dp.scrollTillUpMost();
	    logger.info("Scrolled till upper most of web page..");
	    
	    Thread.sleep(2000);
	    
	    ChequeBouncedCollectionReportPage rdrp=new ChequeBouncedCollectionReportPage(driver);
	    
	    boolean targetpage=rdrp.displayPlainTextChequeBouncedCollectionReport();
	    logger.info("Validating cheque bounced collection report page..");
	    
	    rdrp.clickSearch();
	    logger.info("Clicked on search button..");
	    
	    Thread.sleep(3000);
	    
	    Assert.assertTrue(targetpage);
	    
	    }catch(Exception e) {
			logger.error("Test failed..");
			logger.debug("Debug logs..");
		    Assert.fail();
		}
	    
	    logger.info("*****Finished TC033_VerifyChequeBouncedCollectionReportTest*****");
	}


}
