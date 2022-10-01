import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Daddy {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		WebDriver driver;
		 System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
	driver= new FirefoxDriver();
	driver.get("facebook.com");
	driver.close();
	
	}

}
