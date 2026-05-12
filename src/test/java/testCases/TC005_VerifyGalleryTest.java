package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.CitizenPage;
import pageObjects.GalleryPage;
import testBase.BaseClass;

public class TC005_VerifyGalleryTest extends BaseClass {
	
	@Test(groups={"Sanity","Master","Regression"})
	public void verify_GalleryPageIsExists() throws InterruptedException {
		
		logger.info("*****Starting TC005_GalleryTest*****");
		
		try {
		//CitizenPage
		CitizenPage cp=new CitizenPage(driver);
		
		cp.clickGalleryLink();
		logger.info("Clicked on Gallery link..");
		
		Thread.sleep(3000);
		
		//GalleryPage
		GalleryPage gp=new GalleryPage(driver);
		
		boolean targetPage=gp.isGalleryPageExists();
		logger.info("Validating gallery page..");
		
		Assert.assertTrue(targetPage);
		
		}catch(Exception e) {
			logger.error("Test failed..");
			logger.debug("Debug logs..");
			Assert.fail();
		}
		
		logger.info("*****Finished TC005_GalleryTest*****");
		
	}

}
