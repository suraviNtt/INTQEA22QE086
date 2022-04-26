package project_name.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import project_name.utilities.DriverSetup;

public class Hooks {
	
	protected WebDriver driver;
	protected DriverSetup driverSetup;
}
