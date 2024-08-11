package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automaiton.common.CommonBase;

public class Day11_Practice_Bai2 extends CommonBase {

	@BeforeMethod
	public void openBrowser() {
		driver = initChromeDriver("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
	}

	@Test
	public void testCombined() {
		WebElement dropdownPlzSelect = driver.findElement(By.xpath("//*[text()='Please select']/ancestor::select"));
		System.out.println("dropdownPlzSelect is oke");
		
		WebElement mutiSelectListDemo = driver.findElement(By.xpath("//*[text()='First Selected']/preceding::select[@name='States']"));
		System.out.println("mutiSelectListDemo is oke");
		
		WebElement ddSelectMonday = driver.findElement(By.xpath("//*[text()='Please select']/ancestor::select//following-sibling::option[text()='Monday']"));
		System.out.println("ddSelectMonday is oke");
		
		WebElement ddSelectThusrday = driver.findElement(By.xpath("//option[text()='Please select']/ancestor::select/child::option[text()='Thursday']"));
		System.out.println("ddSelectThusrday is oke");

	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}