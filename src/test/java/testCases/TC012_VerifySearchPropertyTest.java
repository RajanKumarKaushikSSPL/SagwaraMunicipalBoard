package testCases;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CitizenPage;
import pageObjects.DashBoardPage;
import pageObjects.LoginPage;
import pageObjects.PropertyListPage;
import pageObjects.SearchPropertyPage;
import testBase.BaseClass;

public class TC012_VerifySearchPropertyTest extends BaseClass {
	
	@Test(groups={"Sanity","Master","Regression"})
	public void verify_PropertyListPageExists() throws InterruptedException {
		
		logger.info("*****Starting TC012_VerifySearchPropertyTest*****");
		
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
	    
	    dp.clickUDTaxMenu();
	    logger.info("Clicked on UD Tax menu..");
	    
	    Thread.sleep(2000);
	    
	    dp.clickSearchPropertySubMenu();
	    logger.info("Clicked on search property submenu..");
	    
	    Thread.sleep(2000);
	    
	    //SearchPropertyPage
	    SearchPropertyPage spp=new SearchPropertyPage(driver);
	    
	    spp.selectWardNoDropDown("1");
	    logger.info("Selected ward no. ..");
	    
	    spp.scrollTillSearchButton();
	    logger.info("Scrolled till search button..");
	    
	    spp.clickSearch();
	    logger.info("clicked on search button..");
	    
	    Thread.sleep(3000);
	    
	    //PropertyListPage
	    PropertyListPage plp=new PropertyListPage(driver);
	    
	    boolean targetpage=plp.isPropertyListPageExists();
	    logger.info("Validating property list page..");
	    
	    Assert.assertTrue(targetpage);
	    
		}catch(Exception e) {
			logger.error("Test failed..");
			logger.debug("Debug logs..");
		    Assert.fail();
		}
		
		logger.info("*****Finished TC012_VerifySearchPropertyTest*****");
	}
	
	
	

}
