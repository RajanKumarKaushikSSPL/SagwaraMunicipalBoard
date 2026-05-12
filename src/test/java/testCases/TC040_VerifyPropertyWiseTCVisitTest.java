package testCases;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CitizenPage;
import pageObjects.DashBoardPage;
import pageObjects.LoginPage;
import pageObjects.PropertyWiseTCVisitPage;
import testBase.BaseClass;

public class TC040_VerifyPropertyWiseTCVisitTest extends BaseClass {
	
	@Test(groups={"Sanity","Master","Regression"})
	public void verify_PropertyWiseTCVisitPageExists() {
		
	logger.info("*****Starting TC040_VerifyPropertyWiseTCVisitTest*****");
	
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
	    
	    dp.scrollTillPropertyWiseTCVisitSubmenu();
	    logger.info("Scrolled till property wise TC visit submenu..");
	    
        Thread.sleep(3000);
	    
	    dp.clickPropertyWiseTCVisitSubMenu();
	    logger.info("Clicked on property wise TC visit submenu..");
	    
	    Thread.sleep(2000);
	    
	    dp.scrollTillUpMost();
	    logger.info("Scrolled till upper most of web page..");
	    
	    Thread.sleep(2000);
	    
	    PropertyWiseTCVisitPage pwtcvp=new PropertyWiseTCVisitPage(driver);
	    
	    boolean targetpage=pwtcvp.displayPlainTextPropertyWiseTCVisit();
	    logger.info("Validating property wise TC visit page..");
	    
	    pwtcvp.clickSearch();
	    logger.info("Clicked on search button..");
	    
	    Thread.sleep(3000);
	    
	    boolean targetreport=pwtcvp.displayPlainTextNoneToNoneReportStatus();
	    logger.info("Validating None to None report..");
	    
	    Assert.assertTrue(targetpage);
	    
	    Assert.assertTrue(targetreport);
	    
	    }catch(Exception e) {
			logger.error("Test failed..");
			logger.debug("Debug logs..");
		    Assert.fail();
		}
	    
	    logger.info("*****Finished TC040_VerifyPropertyWiseTCVisitTest*****");
	}


}
