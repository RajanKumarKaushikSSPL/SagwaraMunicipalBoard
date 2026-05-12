package testCases;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CitizenPage;
import pageObjects.LoginPage;
import pageObjects.DashBoardPage;
import testBase.BaseClass;

public class TC001_LoginTest extends BaseClass {
    
	@Test(groups={"Smoke","Sanity","Master","Regression"})
	public void verify_login() {
		logger.info("*****Starting TC001_LoginTest*****");
		
		try {
		//CitizenPage
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
		
		//DashboardPage
		DashBoardPage dp=new DashBoardPage(driver);
		boolean targetPage=dp.isDashBoardPageExists();
		
		logger.info("Validating Dashboard Page..");
		Assert.assertTrue(targetPage); //Assert.assertEquals(targetPage, true,"Login failed");
		}catch(Exception e) {
			logger.error("Test failed..");
			logger.debug("Debug logs..");
			Assert.fail();
		}
		
		logger.info("*****Finished TC001_LoginTest*****");
	}
}
