package testCases;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CitizenPage;
import pageObjects.DashBoardPage;
import pageObjects.LoginPage;
import pageObjects.PropertyUpdateReportPage;

import testBase.BaseClass;

public class TC042_VerifyAllUpdationReportTest extends BaseClass {
	
	@Test(groups={"Sanity","Master","Regression"})
	public void verify_AllUpdationReportPageExists() {
		
	logger.info("*****Starting TC042_VerifyAllUpdationReportTest*****");
	
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
	    
	    dp.scrollTillAllUpdationReportSubmenu();
	    logger.info("Scrolled till all updation report submenu..");
	    
        Thread.sleep(3000);
	    
	    dp.clickAllUpdationReportSubMenu();
	    logger.info("Clicked on all updation report submenu..");
	    
	    Thread.sleep(2000);
	    
	    dp.scrollTillUpMost();
	    logger.info("Scrolled till upper most of web page..");
	    
	    Thread.sleep(2000);
	    
	    PropertyUpdateReportPage purp=new PropertyUpdateReportPage(driver);
	    
	    boolean targetpage=purp.displayPlainTextPropertyUpdateReport();
	    logger.info("Validating property update report page..");
	    
	    purp.clickSearch();
	    logger.info("Clicked on search button..");
	    
	    Thread.sleep(3000);
	    
	    boolean targetreport=purp.displayPlainTextNoneToNoneReportStatus();
	    logger.info("Validating None to None report..");
	    
	    Assert.assertTrue(targetpage);
	    
	    Assert.assertTrue(targetreport);
	    
	    }catch(Exception e) {
			logger.error("Test failed..");
			logger.debug("Debug logs..");
		    Assert.fail();
		}
	    
	    logger.info("*****Finished TC042_VerifyAllUpdationReportTest*****");
	}


}
