package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day16_BTVN_Bai1_Page {
	
	private WebDriver driver;

	public Day16_BTVN_Bai1_Page(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//xpath login
	@FindBy(xpath = "//input[@id='txtLoginUsername']") WebElement textEmail;
	@FindBy(xpath = "//input[@id='txtLoginPassword']") WebElement textPass;
	@FindBy(xpath = "//button[@class='btn btn-lg btn_pink fs18 fleft w100per pass btn_submit']") WebElement buttonLogin;
	
	//xpath changeinformation
	@FindBy(xpath = "//i[@class='fa fa-caret-down']") WebElement textInfo;
	@FindBy(xpath = "//a[text()='Chỉnh sửa thông tin']") WebElement textChinhSuaThongTin;
	@FindBy(id = "txtpassword") WebElement textOldPassword;
	@FindBy(id = "txtnewpass") WebElement textNewPassword;
	@FindBy(id = "txtrenewpass") WebElement textReNewPassword;
	@FindBy(xpath = "//button[text()='Lưu mật khẩu mới']") WebElement buttonLuuMatKhauMoi;
	
	
	public void loginPage(String email, String password)
	{
		textEmail.sendKeys(email);
		textPass.sendKeys(password);
		buttonLogin.click();
	}
	
	public void switchInformation() 
	{
		textInfo.click();
		textChinhSuaThongTin.click();
	}
	
	public void changePassword(String oldPassword, String newPassword, String reNewPassword) 
	{
		textOldPassword.sendKeys(oldPassword);
		textNewPassword.sendKeys(newPassword);
		textReNewPassword.sendKeys(reNewPassword);
		buttonLuuMatKhauMoi.click();
	}
	
	
	
	

}
