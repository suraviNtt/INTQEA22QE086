package alertHandling.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import alertHandling.handler.AlertHandler;
import alertHandling.handler.CommonMethods;

public class PageElementsUsed extends CommonMethods{

	WebDriver driver;

	public PageElementsUsed(WebDriver driver) {
		this.driver = driver;
	}

	WebElement submitButton = driver.findElement(By.name("submit"));
	
	/**
	 * 
	 */
	public void clickOnSubmitButton() {
		clickOnWebElement(submitButton);
	}
}
