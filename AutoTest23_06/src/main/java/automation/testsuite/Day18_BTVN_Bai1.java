package automation.testsuite;

import static org.testng.Assert.assertTrue;
import java.util.Set;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class Day18_BTVN_Bai1 extends CommonBase{

	
//	@BeforeMethod
//	public void openBrowser() {
//		driver = initChromeDriver(CT_PageURLs.URL_DIENMAYHUNGANH);
//	}
	
	@BeforeMethod
	@Parameters("browser")
	public void openBrowser(@Optional("filefox") String browser) 
	{
		setupDriver(browser);
		driver.get(CT_PageURLs.URL_DIENMAYHUNGANH);
	}
	
	@Test
	public void handleWindow() 
	{
		click(By.xpath("//a[@href='https://zalo.me/0988169282']"));
		String mainWindow = driver.getWindowHandle();
		System.out.println("main window is: "+mainWindow);
		Set<String> listWindows = driver.getWindowHandles();
		for(String windowItem:listWindows) 
		{
			System.out.println("window is: "+windowItem);
			if(!windowItem.equals(mainWindow)) 
			{
				driver.switchTo().window(windowItem);
				assertTrue(driver.findElement(By.xpath("//h1[text()='ĐIỆN MÁY HÙNG ANH']")).isDisplayed());
				driver.close();
			}
		}
		driver.switchTo().window(mainWindow);
		assertTrue(isElementVisibility(By.xpath("//a[@href='https://zalo.me/0988169282']")));
	}

}
