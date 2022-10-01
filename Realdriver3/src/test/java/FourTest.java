import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import basepackage.Base;

public class FourTest extends Base {
	public WebDriver driver;
	@Test
	 public void testfour() throws IOException, InterruptedException {
		 
		 driver=initializeDriver();
		 driver.get("https://www.hyrtutorials.com/");
		 Thread.sleep(2000);
		 Assert.assertTrue(false);
		 
		 Thread.sleep(2000);
	 }
	@AfterMethod
	public void closingBrowser() {
		driver.close();
	}
	
}
    