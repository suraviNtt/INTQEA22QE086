package alertHandling.handler;

import org.openqa.selenium.WebDriver;

public class AlertHandler {

	private static WebDriver driver;

	public AlertHandler(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * 
	 */
	public void acceptAlert() {
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("");
		}
	}

	/**
	 * 
	 */
	public void dismissAlert() {
		try {
			driver.switchTo().alert().dismiss();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("");
		}
	}

	/**
	 * 
	 * @param alertText
	 */
	public void sendTextToAlert(String alertText) {
		try {
			driver.switchTo().alert().sendKeys(alertText);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("");
		}
	}

}
