import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import basepackage.Base;

public class TwoTest extends Base {
public WebDriver driver;
	@Test
	public void TestTwo() throws IOException, InterruptedException {
		
		
		System.out.println("testTwo");
		//driver=initializeDriver();
		
	driver.get("https://www.hyrtutorials.com/");
	
	

}
}