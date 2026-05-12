package testCases;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CitizenPage;

import pageObjects.DashBoardPage;
import pageObjects.LoginPage;
import pageObjects.SAFReportPage;
import testBase.BaseClass;

public class TC023_VerifySAFReportTest extends BaseClass{
	
	@Test(groups={"Sanity","Master","Regression"})
	public void verify_SAFReportPageExists() {
		
		logger.info("*****Starting TC023_VerifySAFReportTest*****");
		
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
		    
		    dp.clickSAFReportSubMenu();
		    logger.info("Clicked on SAF Report submenu..");
		    
		    Thread.sleep(2000);
		    
		    //SAFReportPage
		    SAFReportPage srp=new SAFReportPage(driver);
		    
		    boolean targetpage=srp.displayPlainTextSAFReport();
		    logger.info("Validating SAF report page..");
		    
	        Assert.assertTrue(targetpage);
		    
		    }catch(Exception e) {
				logger.error("Test failed..");
				logger.debug("Debug logs..");
			    Assert.fail();
			}
		    
		    logger.info("*****Finished TC023_VerifySAFReportTest*****");
		}
	
}
