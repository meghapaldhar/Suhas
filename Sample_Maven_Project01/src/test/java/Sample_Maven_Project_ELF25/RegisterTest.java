package Sample_Maven_Project_ELF25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_Utility.Utility_Functions;

public class RegisterTest {
	
	
	@DataProvider(name="TestData")
	public Object[][] testdata()
	{
		Object[][] data=new Object[1][4];

		//List iteration
		data[0][0]="Megha";
		data[0][1]="Paldhar";
		data[0][2]="megha1997@gmail.com";
		data[0][3]="123456";
		return data;
	}


	@Test(dataProvider="TestData")
	public void Tc_01(String FirstName1, String LastName1,String Email1, String Password1)
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String link = "http://demowebshop.tricentis.com/";
		driver.get(link);
		driver.manage().window().maximize();

		WebElement register=driver.findElement(By.cssSelector("a[class='ico-register']"));
		Utility_Functions.Click_Element(register);

		WebElement firstname=driver.findElement(By.cssSelector("input[name='FirstName"));
		Utility_Functions.Enter_Value_In_Edit_Field(firstname,FirstName1);

		WebElement lastname=driver.findElement(By.cssSelector("input[name='LastName"));
		Utility_Functions.Enter_Value_In_Edit_Field(lastname,LastName1);

		WebElement email=driver.findElement(By.xpath("//input[@type='text']"));
		Utility_Functions.Enter_Value_In_Edit_Field(email,Email1);

		WebElement pwd=driver.findElement(By.xpath("//input[@type='password']"));
		Utility_Functions.Enter_Value_In_Edit_Field(pwd,Password1);

		WebElement cpwd=driver.findElement(By.xpath("//input[@type='password']"));
		Utility_Functions.Enter_Value_In_Edit_Field(cpwd,Password1);


		WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
		Utility_Functions.Click_Element(submit);
		
		driver.close();

	}
}	


