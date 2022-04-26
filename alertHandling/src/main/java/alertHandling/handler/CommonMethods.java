package alertHandling.handler;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import alertHandling.helper.PropertiesReader;

public class CommonMethods {
	
	private PropertiesReader  reader;
	
	/**
	 * 
	 * @param driver
	 */
	public void launchApplication(WebDriver driver) {
		reader = new PropertiesReader();
		driver.get(reader.getAppURL());
	}
	
	public void clickOnWebElement(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void waitForElementToBeClickable( WebDriver driver, WebElement element) {
		try {
			reader = new PropertiesReader();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(reader.getExplicitWait()));
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

