package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.ChangePasswordPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class LoginPageTest extends BaseTest {

	WebDriver driver;
	HomePage homepage;
	ChangePasswordPage changepasswordpage;

	@Test(priority = 0, enabled = true)
	public void loginIntoApplication() throws InterruptedException {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.loginIntoApplication("bankbazar", "Admin@1234", "baar");

	}

	@Test(dependsOnMethods = { "loginIntoApplication" }, enabled = true)
	public void logoutFromApplication() {
		homepage = new HomePage(driver);
		homepage.logoutFromApplication();

	}
	
	@Test(dependsOnMethods = { "loginIntoApplication" })
	public void clickOnchangePassword() {
		homepage = new HomePage(driver);
		homepage.clickOnchangePassword();
	}

	@AfterTest(enabled = false)
	public void tearDown() {
		driver.quit();
	}

	@BeforeTest
	public void launchApplication() {
		BaseTest bt = new BaseTest();
		driver = bt.getDriver("chrome");
		driver.get("https://sipserver.ivrobd.com/login");
	}

}
