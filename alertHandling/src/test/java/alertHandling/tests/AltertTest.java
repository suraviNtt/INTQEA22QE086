package alertHandling.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import alertHandling.handler.AlertHandler;
import alertHandling.handler.CommonMethods;
import alertHandling.helper.DriverPropHelper;
import alertHandling.helper.PropertiesReader;
import alertHandling.pages.PageElementsUsed;

public class AltertTest {
	
	public static WebDriver driver = null;
	public static void main(String[] args) {
		PropertiesReader propRead = new PropertiesReader();
		CommonMethods commonMethods = new CommonMethods();
		 driver= DriverPropHelper.setDriver(propRead.getBrowserName());
		commonMethods.launchApplication(driver);
		PageElementsUsed pageElementsUsed = new PageElementsUsed(driver);
		AlertHandler alertHandler = new AlertHandler(driver);
		pageElementsUsed.clickOnSubmitButton();
		alertHandler.acceptAlert();
		alertHandler.acceptAlert();
		driver.close();
	}

}
