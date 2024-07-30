package automation.testsuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automaiton.common.CommonBase;

public class Day7_Test extends CommonBase {
	@BeforeMethod
	public void openBrowser() {
		System.out.println("Bat trinh duyet");
	}
	
	@Test
	public void test1() {
		System.out.println("Testcase 1");
	}
	
	@AfterMethod
	public void closeBrowser() {
		System.out.println("Dong trinh duyet");
	}

}
