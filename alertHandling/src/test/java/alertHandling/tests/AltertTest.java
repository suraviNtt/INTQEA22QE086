package alertHandling.tests;

import org.openqa.selenium.WebDriver;

import alertHandling.helper.DriverPropHelper;
import alertHandling.helper.PropertiesReader;

public class AltertTest {
	
	public static void main(String[] args) {
		WebDriver driver = DriverPropHelper.setDriver(PropertiesReader.getBrowserName());
		
	}

}
