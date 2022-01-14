package Framework_Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility_Functions {
	
	
	

	//Test configuration method
	public static String Test_Configuration(String key) throws IOException
	{
		String filepath="./Test_Configuration/Config.properties";
		FileInputStream fis=new FileInputStream(filepath);
		
		//properties object creation
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;
	}
	
	
	
//utility function to enter value in edit field
	public static void Enter_Value_In_Edit_Field(WebElement element,String value)
	{
		element.sendKeys(value);
	}
	
	public static void Click_Element(WebElement element)
	{
		element.click();
	}
	
	public static void select_by_text(WebElement ele,String txt)
	{
		Select sel=new Select(ele);
		sel.selectByVisibleText(txt);
	}
	
	public static void select_by_value(WebElement ele,String txt)
	{
		Select sel=new Select(ele);
		sel.selectByValue(txt);
	}
	public static void select_by_index1(WebElement ele,int index)
	{
		Select sel=new Select(ele);
		sel.selectByIndex(index);
	}
}	
	
	



