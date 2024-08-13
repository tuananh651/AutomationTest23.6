package automation.testsuite;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automaiton.common.CommonBase;
import automation.constant.CT_PageURLs;

public class Day12_RadioButton extends CommonBase
{
	@BeforeMethod
	public void openBrowser() 
	{
		driver = initChromeDriver(CT_PageURLs.URL_SELENIUMEASY_2);
	}
	
	@Test
	public void case1_CheckDefaultValue() 
	{
		WebElement defaultRadioMale = driver.findElement(By.xpath("//input[@value='Male' and @name='optradio']"));
		// Expect that defaultCheck has isSelected = false;
		assertFalse(defaultRadioMale.isSelected());
		System.out.println("Radio Male is not choice");
		
		WebElement defaultRadioFemale = driver.findElement(By.xpath("//input[@value='Female' and @name='optradio']"));
		// Expect that defaultCheck has isSelected = false;
		assertFalse(defaultRadioFemale.isSelected());
		System.out.println("Radio Female is not choice");
	}
	
	@Test
	public void case2_checkRadioSuccessfully() 
	{
		WebElement radio0To5 = driver.findElement(By.xpath("//input[@value='0 - 5']"));
		WebElement radio5To15 = driver.findElement(By.xpath("//input[@value='5 - 15']"));
		WebElement radio15To50 = driver.findElement(By.xpath("//input[@value='15 - 50']"));
		if(radio0To5.isDisplayed())
		{
			radio0To5.click();
			assertTrue(radio0To5.isSelected());
			assertFalse(radio5To15.isSelected());
			assertFalse(radio15To50.isSelected());
			System.out.println("radio0To5 is choiced");
		}
		
		if(radio5To15.isDisplayed())
		{
			radio5To15.click();
			assertTrue(radio5To15.isSelected());
			assertFalse(radio0To5.isSelected());
			assertFalse(radio15To50.isSelected());
			System.out.println("radio5To15 is choiced");
		}
		
		if(radio15To50.isDisplayed())
		{
			radio15To50.click();
			assertTrue(radio15To50.isSelected());
			assertFalse(radio0To5.isSelected());
			assertFalse(radio5To15.isSelected());
			System.out.println("radio15To50 is choiced");
		}
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
