package Framework_Utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Framework_Utility.Utility_Functions;

public class Browser_Setup {
	
	public WebDriver driver;
	@BeforeClass
	public void TestReg() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","E:\\ECLIPSE\\SELENIUM_TRAINING\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		String url=Utility_Functions.Test_Configuration("Appurl");
		driver.get(url);
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	@AfterClass
	public void close()
	{
		driver.close();
	}
}


