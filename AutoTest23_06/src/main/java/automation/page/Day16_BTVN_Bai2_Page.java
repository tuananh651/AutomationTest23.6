package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Day16_BTVN_Bai2_Page {
	
	private WebDriver driver;

	public Day16_BTVN_Bai2_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	

}
