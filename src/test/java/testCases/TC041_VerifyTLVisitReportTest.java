package testCases;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CitizenPage;
import pageObjects.DashBoardPage;
import pageObjects.LoginPage;

import pageObjects.TLVisitReportPage;
import testBase.BaseClass;

public class TC041_VerifyTLVisitReportTest extends BaseClass {
	
	@Test(groups={"Sanity","Master","Regression"})
	public void verify_TLVisitReportPageExists() {
		
	logger.info("*****Starting TC041_VerifyTLVisitReportTest*****");
	
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
	    
	    dp.scrollTillTLVisitReportSubmenu();
	    logger.info("Scrolled till TL visit report submenu..");
	    
        Thread.sleep(3000);
	    
	    dp.clickTLVisitReportSubMenu();
	    logger.info("Clicked on TL visit report submenu..");
	    
	    Thread.sleep(2000);
	    
	    dp.scrollTillUpMost();
	    logger.info("Scrolled till upper most of web page..");
	    
	    Thread.sleep(2000);
	    
	    TLVisitReportPage tlvrp=new TLVisitReportPage(driver);
	    
	    boolean targetpage=tlvrp.displayPlainTextTLVisitReport();
	    logger.info("Validating TL visit report page..");
	    
	    tlvrp.clickSearch();
	    logger.info("Clicked on search button..");
	    
	    Thread.sleep(2000);
	    
	    Assert.assertTrue(targetpage);
	    
	    }catch(Exception e) {
			logger.error("Test failed..");
			logger.debug("Debug logs..");
		    Assert.fail();
		}
	    
	    logger.info("*****Finished TC041_VerifyTLVisitReportTest*****");
	}

}
