package alertHandling.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverPropHelper {
	
	private static WebDriver driver;

	private static void setUpChrome() {
		WebDriverManager.chromedriver().setup();
		
	}

	private static void setUpFirefox() {
		WebDriverManager.firefoxdriver().setup();
	}
	
	public static WebDriver setDriver(String browser) {
		switch (browser) {
		case "chrome":
			setUpChrome();
			driver = new ChromeDriver();
			break;
		case "firefox":
			setUpFirefox();
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Please select an defined browser");
			break;
		}
		
		return driver;
	}
}
