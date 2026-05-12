package testCases;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.CitizenPage;
import pageObjects.LoginPage;
import pageObjects.DashBoardPage;
import testBase.BaseClass;
import utilities.DataProviders;


public class TC002_LoginDDTTest extends BaseClass {
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class,groups="Datadriven") //getting data provider from different class
	public void verify_loginDDT(String username,String pwd,String exp) {
        
		logger.info("*****Starting TC002_LoginDDTTest*****");
		
		try {
		//Citizen Page
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
		
		lp.clearUserName();
		logger.info("Cleared Username..");
		
		lp.setUserName(username);
		logger.info("Entered Username..");
		
		lp.clearPassword();
		logger.info("Cleared Password..");
		
		lp.setPassword(pwd);
		logger.info("Entered Password..");
		
		lp.clickLogin();
		logger.info("Clicked on Login Button..");
		
		//DashBoardPage
		DashBoardPage dp=new DashBoardPage(driver);
		boolean targetPage=dp.isDashBoardPageExists();
		
		/*Data is valid -login success -test pass - logout
		                -login failed -test fail
		 
		  Data is invalid -login success -test fail - logout
		                  -login failed -test pass
		 */
		
		if(exp.equalsIgnoreCase("Valid")) {
			if(targetPage==true) {
				dp.clickLogoSuperAdminProfile();
				logger.info("Clicked on super admin profile..");
				
				dp.clickBtnLogOut();
				logger.info("Clicked on Logout Button..");
				
				driver.switchTo().window(parentWindow);
				
				Assert.assertTrue(true);
			}else {
				Assert.assertTrue(false);
			}
		}
		
		if(exp.equalsIgnoreCase("Invalid")) {
			if(targetPage==true) {
				dp.clickBtnLogOut();
				logger.info("Clicked on Logout Button..");
				driver.switchTo().window(parentWindow);
				Assert.assertTrue(false);
			}else {
				driver.switchTo().window(parentWindow);
				Assert.assertTrue(true);
			}
		}
		
		}catch(Exception e) {
			logger.error("Test failed..");
			logger.debug("Debug logs..");
			Assert.fail();
		}
		logger.info("*****Finished TC002_LoginDDTTest*****");
		
	}

}
