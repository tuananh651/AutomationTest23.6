package automation.testsuite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automaiton.common.CommonBase;
import automation.constant.CT_PageURLs;

public class Day12_Practice extends CommonBase {
	@BeforeMethod
	public void openBrowser() {
		driver = initChromeDriver(CT_PageURLs.URL_SELENIUMEASY_4);
	}

	@Test
	public void testSelectState() {
		Select sbState = new Select(driver.findElement(By.name("state")));
		// Kiểm tra select box có phải multi select hay không?
		Assert.assertFalse(sbState.isMultiple());
		System.out.println("Selectbox State not multi select");

		// Kiểm tra giá trị mặc định của selectbox State:
		Assert.assertEquals(sbState.getFirstSelectedOption().getText(), "Please select your state");
		System.out.println("Default option is oke ");

		// Kiểm tra dropdown có 52 giá trị:
		assertEquals(sbState.getOptions().size(), 52);
		System.out.println("Selectbox State is 52");

		// Kiểm tra giá trị được chọn "Alabama" có hiển thị đúng không?
		sbState.selectByVisibleText("Alabama");
		Assert.assertEquals(sbState.getFirstSelectedOption().getText(), "Alabama");
		System.out.println("Changed Alabama option is oke ");

		// Kiểm tra giá trị được chọn "Alaska" có hiển thị đúng không?
		sbState.selectByVisibleText("Alaska");
		Assert.assertEquals(sbState.getFirstSelectedOption().getText(), "Alaska");
		System.out.println("Changed Alaska option is oke ");

		// Kiểm tra giá trị được chọn "Arizona" có hiển thị đúng không?
		sbState.selectByVisibleText("Arizona");
		Assert.assertEquals(sbState.getFirstSelectedOption().getText(), "Arizona");
		System.out.println("Changed Arizona option is oke ");

		// Kiểm tra giá trị được chọn "Arkansas" có hiển thị đúng không?
		sbState.selectByVisibleText("Arkansas");
		Assert.assertEquals(sbState.getFirstSelectedOption().getText(), "Arkansas");
		System.out.println("Changed Arkansas option is oke ");

		// Kiểm tra giá trị được chọn "California" có hiển thị đúng không?
		sbState.selectByVisibleText("California");
		Assert.assertEquals(sbState.getFirstSelectedOption().getText(), "California");
		System.out.println("Changed California option is oke ");

		// Kiểm tra giá trị được chọn "Colorado" có hiển thị đúng không?
		sbState.selectByVisibleText("Colorado");
		Assert.assertEquals(sbState.getFirstSelectedOption().getText(), "Colorado");
		System.out.println("Changed Colorado option is oke ");

		// Kiểm tra giá trị được chọn "Connecticut" có hiển thị đúng không?
		sbState.selectByVisibleText("Connecticut");
		Assert.assertEquals(sbState.getFirstSelectedOption().getText(), "Connecticut");
		System.out.println("Changed Connecticut option is oke ");

		// Kiểm tra giá trị được chọn "Wyoming" có hiển thị đúng không?
		sbState.selectByVisibleText("Wyoming");
		Assert.assertEquals(sbState.getFirstSelectedOption().getText(), "Wyoming");
		System.out.println("Changed Wyoming option is oke ");
	}

	@Test
	public void testRadioButtonHosting() 
	{
		
		WebElement rbHosting1 = driver.findElement(By.xpath("//label[normalize-space()='Yes']/input"));
		WebElement rbHosting2 = driver.findElement(By.xpath("//label[normalize-space()='No']/input"));
		
		//Kiểm tra hiển thị radio button "Yes"
		System.out.println(driver.findElement(By.xpath("//label[normalize-space()='Yes']/input")).isEnabled());
		System.out.println("Radio button Yes is oke");
		
		//Kiểm tra giá trị mặc định "Selected = false" của radio button Yes
		driver.findElement(By.xpath("//label[normalize-space()='Yes']/input")).isSelected();
		if(rbHosting1.isSelected()==false)
		{
			rbHosting1.click();
			System.out.println("utton Yes selected");
			System.out.println(driver.findElement(By.xpath("//label[normalize-space()='Yes']/input")).isSelected());
		}
		
		//Kiểm tra hiển thị radio button "No"
		System.out.println(driver.findElement(By.xpath("//label[normalize-space()='Yes']/input")).isEnabled());
		System.out.println("Radio button No is oke");
		
		//Kiểm tra giá trị mặc định "Selected = false" của radio button No
		driver.findElement(By.xpath("//label[normalize-space()='Yes']/input")).click();
		if(rbHosting2.isSelected()==false)
		{
			rbHosting2.click();
			System.out.println("Button No selected");
			System.out.println(driver.findElement(By.xpath("//label[normalize-space()='No']/input")).isSelected());
		}
		
		

	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
