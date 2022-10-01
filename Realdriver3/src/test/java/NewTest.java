import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basepackage.Base;
import pageobjects.AccountPage;
import pageobjects.LandingPage;
import pageobjects.LoginPage;

     public class NewTest extends Base {
    public	 WebDriver driver;
   
   // Logger log;
   // LogManager LogManager;

    	 @Test(dataProvider="getLoginData")
	public void login(String email,String password,String expectedResult) throws IOException, Exception {
	
      		 // LogManager logManager = new LogManager();
			//	log=LogManager.getLogger(NewTest.class.getName()); 
    		
 
   // 	 driver=initializeDriver();
//	driver.get("http://www.tutorialsninja.com/demo/");
		
		  
		LandingPage landingPage= new LandingPage(driver);
		
			landingPage. myAccountDropdown().click();
		// log.debug("Click on My Account dropdown");
		landingPage.loginOption().click();
	//	log.debug("Click on loginoption");	
		Thread.sleep(3000);

		  LoginPage loginpage=new LoginPage(driver); 
		  loginpage.emailAddressField().sendKeys(email); 
		//  log.debug("email address got entered");
		  
		  
		  loginpage.passwordField().sendKeys(password); 
		//  log.debug("password got entered");
		  
		  loginpage.loginButton().click();
		  System.out.println("ashok");
		//  log.debug("Click on loginButton");
		  AccountPage accountPage=new AccountPage(driver);
		
		  String actualResult = null;
		  try {
			  
			  if(accountPage.editAccountInformationOption().isDisplayed()) 
			  actualResult="successful";
			  
		  }catch(Exception e) {
			  actualResult="failure";
			  
		  }
		  Assert.assertEquals(actualResult,expectedResult);
	//	log.debug("Login Test got passed");
		 // accountPage.editAccountInformationOption().isDisplayed();
		  
		
		
    	 }	
    	 
    	 @BeforeMethod 
    	 public void openApplication() throws IOException {
    		
    //	log=LogManager.getLogger(NewTest.class.getName()); 	
     			 
    		 
    		 driver=initializeDriver();
    		 driver.get("http://www.tutorialsninja.com/demo/");
    				// log.debug("browser got launched");
    			
    			//log.debug("Navigateded to application url");
    				
    	 }
	
    	 
	   @AfterMethod 
      public void closure() { 
    	  driver.close();
    	 // log.debug("browser got closed");
      }
     
	 
	   
   @DataProvider
public Object[][] getLoginData() throws Exception {
	   	  Object[][] Data=
	  {{"kishorereddy@gmail.com","kishore12345","successful"}};      
     
    Thread.sleep(2000); 
	return Data;
	
   }
   }


		
		
