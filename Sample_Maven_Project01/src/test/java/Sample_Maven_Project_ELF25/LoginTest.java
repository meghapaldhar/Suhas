package Sample_Maven_Project_ELF25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_Utility.Utility_Functions;

public class LoginTest {
	
	@DataProvider(name="TestData")
	public Object[][] testdata()
	{
		Object[][] data=new Object[1][2];
		data[0][0]="megha1997@gmail.com";
		data[0][1]="123456";
		return data;
		
	}
	
	@Test(dataProvider="TestData")
	public void TC01(String email,String password) {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String link = "http://demowebshop.tricentis.com/";
		driver.get(link);
		driver.manage().window().maximize();
		
		WebElement login=driver.findElement(By.xpath("(//a[@class='ico-login'])[1]"));
		Utility_Functions.Click_Element(login);
		
		WebElement email1=driver.findElement(By.xpath("//input[@class='email']"));
		Utility_Functions.Enter_Value_In_Edit_Field(email1,email);
		
		WebElement password1=driver.findElement(By.xpath("//input[@class='password']"));
		Utility_Functions.Enter_Value_In_Edit_Field(password1,password);
		
		WebElement login_button=driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
		Utility_Functions.Click_Element(login_button);
		
		driver.close();
		
	}
	

}
