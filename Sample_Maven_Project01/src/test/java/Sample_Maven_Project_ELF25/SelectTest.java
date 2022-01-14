package Sample_Maven_Project_ELF25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_Utility.Utility_Functions;

public class SelectTest {

	

@DataProvider(name="TestData")
public Object[][] testdata()
{
	Object[][] data=new Object[1][1];

	//List iteration
	data[0][0]=1;


	return data;
}


@Test(dataProvider="TestData")
public void Tc_01(int sort1)
{
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String link = "http://demowebshop.tricentis.com/";
	driver.get(link);
	driver.manage().window().maximize();
	WebElement books=driver.findElement(By.xpath("(//a[@href='/books'])[1]"));	
	Utility_Functions.Click_Element(books);
	WebElement sort=driver.findElement(By.xpath("//select[@name='products-orderby']"));
	Utility_Functions.select_by_index1(sort, sort1);
	
	driver.close();

}

}
