package project_name.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import project_name.tests.Hooks;
import project_name.utilities.DriverSetup;
/**
 * 
 * @author User
 *
 */
public class SearchBarPage extends Hooks {

	HomePage homePage;

	@BeforeMethod
	public void openApplication() {
		driverSetup = new DriverSetup();
		driver = driverSetup.chrome();
		System.out.println("Chrome Laucned");
		homePage = new HomePage(driver);
		System.out.println("Method called for login");
	}

	@DataProvider(name = "testData")
	public Object[][] testData() {
		Object[][] arr = { { "ABCD" , "invalidPassword"}, { "invalidXYZ" , "password" } };
		return arr;

	}

	@Test (dataProvider = "testData")
	public void verifyLoginSuccessWithValidCredentials(String searchValue , String passString) {

		homePage.searchElement(searchValue);
		homePage.searchElement(passString);

	}

	@Test
	public void verifyLoginFailuresWithInvalidUsername() {

		homePage.searchElement("ABCD");

	}

	@Test
	public void verifyLoginFailureWithInvalidPassword() {
		homePage.searchElement("ABCD");

	}

	@Test
	public void verifyLoginFailureWithNullValuesInCredentials() {

		homePage.searchElement("ABCD");

	}
	
	@Test
	public void verifyLoginFailureWithNullValuesInCredential() {

		homePage.searchElement("ABCD");

	}

	@AfterMethod(alwaysRun = true)
	public void teardown() {
		driver.quit();
		System.out.println("browser closed");

	}

}
