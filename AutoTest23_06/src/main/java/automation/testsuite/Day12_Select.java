package automation.testsuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automaiton.common.CommonBase;
import automation.constant.CT_PageURLs;

public class Day12_Select extends CommonBase 
{
	@BeforeMethod
	public void openBrowser() 
	{
		driver = initChromeDriver(CT_PageURLs.URL_SELENIUMEASY_3);
	}
	
	@Test
	public void case1_selectDefault()
	{
		Select selectDefault = new Select(driver.findElement(By.id("select-demo"))) ;
		//Case0: Kiểm tra giá trị mặc định
		assertEquals(selectDefault.getFirstSelectedOption().getText(), "Please select"); 
		
		//Case1: kiểm tra size là 8
		assertEquals(selectDefault.getOptions().size(),8);
		
		//Case 2: chọn Monday và kiểm tra giá trị
		selectDefault.selectByVisibleText("Monday");
		assertEquals(selectDefault.getFirstSelectedOption().getText(), "Monday"); 
		
		//Case 3: Chọn Tuesday và kiểm tra giá trị
		selectDefault.selectByVisibleText("Tuesday");
		assertEquals(selectDefault.getFirstSelectedOption().getText(), "Tuesday");
		
		//Case 4: Chọn Sunday và kiểm tra giá trị theo kiểu index
		selectDefault.selectByIndex(1);
		assertEquals(selectDefault.getFirstSelectedOption().getText(), "Sunday");
	}
	
	@AfterMethod
	public void closeBrowser() 
	{
		driver.quit();
	}

}
