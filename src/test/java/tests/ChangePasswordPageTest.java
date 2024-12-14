package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.ChangePasswordPage;

public class ChangePasswordPageTest extends BaseTest {

	WebDriver driver;
	ChangePasswordPage changepasswordpage;

	@Test
	public void changeUserPassword() {
		changepasswordpage = new ChangePasswordPage(driver);
		changepasswordpage.changePasswordofUser("Admin@1234", "Admin@12345", "Admin@12345");
	}
}
