package testCases;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.CitizenPage;
import pageObjects.DashBoardPage;
import pageObjects.LoginPage;
import pageObjects.PrintAllPaymentReceiptPage;
import testBase.BaseClass;

public class TC029_VerifyPrintAllPaymentReceiptTest extends BaseClass {
	
	@Test(groups={"Sanity","Master","Regression"})
	public void verify_PrintAllPaymentReceiptPageExists() {
		
	logger.info("*****Starting TC029_VerifyPrintAllPaymentReceiptTest*****");
	
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
	    
	    dp.clickPrintAllPaymentReceiptSubMenu();
	    logger.info("Clicked on print all payment receipt submenu..");
	    
	    Thread.sleep(2000);
	    
	    PrintAllPaymentReceiptPage paprp=new PrintAllPaymentReceiptPage(driver);
	    
	    boolean targetpage=paprp.displayPlainTextPrintAllPaymentReceipt();
	    logger.info("Validating print all payment receipt page..");
	    
	    paprp.clickSearch();
	    logger.info("Clicked on search button..");
	    
	    Thread.sleep(3000);
	    
	    Assert.assertTrue(targetpage);
	    
	    }catch(Exception e) {
			logger.error("Test failed..");
			logger.debug("Debug logs..");
		    Assert.fail();
		}
	    
	    logger.info("*****Finished TC029_VerifyPrintAllPaymentReceiptTest*****");
	}

}
