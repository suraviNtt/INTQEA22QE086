package project_name.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {

	/**
	 * get chrome driver
	 * @param driver
	 */
	public WebDriver chrome() {
		WebDriverManager.chromedriver().setup();
		return new ChromeDriver();
	}
}
