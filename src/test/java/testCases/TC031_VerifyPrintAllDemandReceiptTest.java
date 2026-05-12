package testCases;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CitizenPage;

import pageObjects.DashBoardPage;
import pageObjects.LoginPage;
import pageObjects.PrintAllDemandReceiptPage;
import testBase.BaseClass;

public class TC031_VerifyPrintAllDemandReceiptTest extends BaseClass {
	
	@Test(groups={"Sanity","Master","Regression"})
	public void verify_PrintAllDemandReceiptPageExists() {
		
	logger.info("*****Starting TC031_VerifyPrintAllDemandReceiptTest*****");
	
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
	    
	    dp.scrollTillPrintAllDemandReceiptSubmenu();
	    logger.info("Scrolled till print all demand receipt submenu..");
	    
	    Thread.sleep(3000);
	    
	    dp.clickPrintAllDemandReceiptSubMenu();
	    logger.info("Clicked on print all demand receipt submenu..");
	    
	    Thread.sleep(2000);
	    
	    dp.scrollTillUpMost();
	    logger.info("Scrolled till upper most of web page..");
	    
	    Thread.sleep(2000);
	    
	    PrintAllDemandReceiptPage padrp=new PrintAllDemandReceiptPage(driver);
	    
	    boolean targetpage=padrp.displayPlainTextPrintAllDemandReceipt();
	    logger.info("Validating print all deman receipt page..");
	    
	    padrp.selectWardNoDropDown("1");
	    logger.info("Selected ward no. ..");
	    
	    padrp.setAmountFrom("1");
	    logger.info("Entered amount from..");
	    
	    padrp.setAmountUpTO("100");
	    logger.info("Entered amount upto..");
	    
	    padrp.clickSearch();
	    logger.info("Clicked on search button..");
	    
	    Thread.sleep(5000);
	    
	    Assert.assertTrue(targetpage);
	    
	    }catch(Exception e) {
			logger.error("Test failed..");
			logger.debug("Debug logs..");
		    Assert.fail();
		}
	    
	    logger.info("*****Finished TC031_VerifyPrintAllDemandReceiptTest*****");
	}


}
