package basepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Base{

 public WebDriver driver; 
public WebDriver initializeDriver() throws IOException {

//	
//	Properties prop=new Properties();
//	String propPath=System.getProperty("C:\\Users\\ashok\\eclipse-workspace\\Realdriver\\src\\main\\java\\basepackage\\data.properties");
//	
//	FileInputStream fis=new FileInputStream(propPath);
//	prop.load(fis);
//	
	// String browserName=prop.getProperty("browser");
	   
	String browserName="chrome";
	 
	if(browserName.equalsIgnoreCase("chrome")) {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   
	    
	   
   }
   
   else if(browserName.equalsIgnoreCase("firefox")) {
	   WebDriverManager.firefoxdriver().setup();
	   driver=new FirefoxDriver();
	   
  }

   else if (browserName.equalsIgnoreCase("IE")) {
	   WebDriverManager.iedriver().setup();
	   driver=new InternetExplorerDriver();
	   }

   driver.manage().window().maximize();
  //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

           return driver;
    
  }

public String TakeScreenShot(String testName,WebDriver driver) throws IOException {
	
  File SourceFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  String destinationFilePath=System.getProperty("user.dir")+"\\Screenshots\\"+testName+".png";
	FileUtils.copyFile(SourceFile,new File(destinationFilePath));
      return destinationFilePath;
}
}
