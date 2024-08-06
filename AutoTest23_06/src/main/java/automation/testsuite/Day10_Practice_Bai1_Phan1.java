package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automaiton.common.CommonBase;

public class Day10_Practice_Bai1_Phan1 extends CommonBase{
	
	@BeforeMethod
	public void openBrowser() {
		driver = initChromeDriver("https://alada.vn/tai-khoan/dang-ky.html ");
	}
	
	@Test
	public void testCombined() {
		WebElement txtHoVaTen = driver.findElement(By.xpath("//input[starts-with(@placeholder,'Nhập họ')]"));
		System.out.println("txtHoVaTen is oke");
		
		WebElement txtEnmail = driver.findElement(By.xpath("//label[text()='Địa chỉ Email']"));
		System.out.println("txtEnmail is oke");
		
		WebElement txtNhapLaiEmail = driver.findElement(By.xpath("//label[normalize-space()='Nhập lại Email']"));
		System.out.println("txtNhapLaiEmail is oke");
		
		WebElement txtMatKhau = driver.findElement(By.xpath("//input[contains(@id,'txtPassword')]"));
		System.out.println("txtMatKhau is oke");
		
		WebElement txtNhapLaiMatKhau = driver.findElement(By.xpath("//input[contains(@placeholder,'Nhập lại mật khẩu') and @id='txtCPassword']"));
		System.out.println("txtNhapLaiMatKhau is oke");
		
		WebElement txtDienThoai = driver.findElement(By.xpath("//input[contains(@id,'txtPhone')] "));
		System.out.println("txtDienThoai is oke");
		
		WebElement cbToiDongY = driver.findElement(By.xpath("//div[starts-with(normalize-space(),'Tôi đồng ý với các')]"));
		System.out.println("cbToiDongY is oke");
		
		WebElement btnDangKy = driver.findElement(By.xpath("//button[starts-with(text(),'ĐĂNG KÝ') and @type='submit']"));
		System.out.println("btnDangKy is oke");
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
