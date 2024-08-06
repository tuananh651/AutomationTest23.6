package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automaiton.common.CommonBase;

public class Day10_Practice_Bai2 extends CommonBase{
	
	@BeforeMethod
	public void openBrowser() {
		driver = initChromeDriver("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
	}
	
	@Test
	public void testCombined() {
		WebElement rdoMale = driver.findElement(By.xpath("//input[contains(@value,'Male') and @name='gender']"));
		System.out.println("rdoMale is oke");
		
		WebElement rdoFemale = driver.findElement(By.xpath("//input[contains(@value,'Female') and @name='gender']"));
		System.out.println("rdoFemale is oke");
		
		WebElement rdo0to5 = driver.findElement(By.xpath("//input[contains(@value,'0 - 5') and @name='ageGroup']"));
		System.out.println("rdo0to5 is oke");
		
		WebElement rdo5to15 = driver.findElement(By.xpath("//input[contains(@value,'5 - 15') and @name='ageGroup']"));
		System.out.println("rdo5to15 is oke");
		
		WebElement rdo15to50 = driver.findElement(By.xpath("//input[contains(@value,'15 - 50') and @name='ageGroup']"));
		System.out.println("rdo15to50 is oke");
		
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
