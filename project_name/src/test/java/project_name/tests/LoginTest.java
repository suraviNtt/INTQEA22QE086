package project_name.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import project_name.pages.HomePage;
import project_name.utilities.DriverSetup;

public class LoginTest extends Hooks{

	HomePage homePage;	
	
	@BeforeMethod
	public void openApplication() {
		driverSetup = new DriverSetup();
		driver = driverSetup.chrome();
		System.out.println("Chrome Laucned");
		homePage = new HomePage(driver);
	}

	@Test(groups = "sanity")
	public void verifyLoginSuccessWithValidCredentials() {
		homePage.searchElement("ABCD");

	}

	@Test(groups = "regression")
	public void verifyLoginFailuresWithInvalidUsername() {
		homePage.searchElement("ABCD");

	}

	@Test(groups = "regression")
	public void verifyLoginFailureWithInvalidPassword() {
		homePage.searchElement("ABCD");

	}

	@Test(groups = "regression")
	public void verifyLoginFailureWithNullValuesInCredentials() {
		homePage.searchElement("ABCD");

	}
	
	@AfterMethod(alwaysRun = true)
	public void teardown() {
		driver.quit();
		System.out.println("browser closed");

	}
}
