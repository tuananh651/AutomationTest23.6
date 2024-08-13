package automation.testsuite;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automaiton.common.CommonBase;
import automation.constant.CT_PageURLs;

public class Day12_Checkbox extends CommonBase 
{
	
	@BeforeMethod
	public void openBrowser() 
	{
		driver = initChromeDriver(CT_PageURLs.URL_SELENIUMEASY);
	}
	
	@Test
	public void case1_CheckDefaultValue() 
	{
		WebElement defaultCheck = driver.findElement(By.xpath("//label[normalize-space()='Default Checked']/descendant::input"));
		// Expect that defaultCheck has isSelected = true;
		assertTrue(defaultCheck.isSelected());
	}	
	
		
	@Test
	public void case2_CheckThisCheckboxSuccessfully() 
	{
		WebElement thisCheckbox = driver.findElement(By.xpath("//label[normalize-space()='Click on this check box']/descendant::input"));
		if(thisCheckbox.isSelected()==false) 
		{
			thisCheckbox.click();
			// Expect that text "Success - Check box is checked" on display
			WebElement textSuccess = driver.findElement(By.id("txtAge"));
			assertTrue(textSuccess.isDisplayed());
		}
	}
	
	@Test
	public void case1_MultipleCheckboxSuccessfully()
	{
		List<WebElement> ListCheckbox = driver.findElements(By.xpath("(//div[@class='panel-body'])[3]/descendant::input[@type='checkbox']"));
		for(int i=0;i<ListCheckbox.size();i++)
		{
			WebElement checkbox = ListCheckbox.get(i);
			if (checkbox.isSelected()== false) 
			{
				checkbox.click();
				assertTrue(checkbox.isSelected());
				System.out.println("Checkbox number "+(i+1)+" is checked");
			}
		}
	}
	
	@Test
	public void case2_MultipleCheckboxSuccessfully()
	{
		List<WebElement> ListCheckbox = driver.findElements(By.xpath("(//div[@class='panel-body'])[3]/descendant::input[@type='checkbox']"));
		for(int i=0;i<ListCheckbox.size();i++)
		{
			WebElement checkbox = driver.findElement(By.xpath("(//div[@class='panel-body'])[3]/descendant::input[@type='checkbox']["+(i+1)+"]"));
			if(checkbox.isSelected()==false)
			{
				checkbox.click();
				assertTrue(checkbox.isSelected());
			}
		}
		
	}
	
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	

}
