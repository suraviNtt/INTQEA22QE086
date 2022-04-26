package ishahomes.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IshaHomes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ishahomes.com/");
		Thread.sleep(3000);
		WebElement livechaFrame = driver.findElement(By.id("livservMiddleFrame"));
		driver.switchTo().frame(livechaFrame);
		Thread.sleep(2000);
		WebElement livechatMinimizeButton = driver.findElement(By.xpath("//*[@id='titleBar']//td[2]"));
		livechatMinimizeButton.click();
		driver.switchTo().parentFrame();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(8));
		WebElement popupScreen = driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/button"));
		if(wait.until(ExpectedConditions.elementToBeClickable(popupScreen)).isEnabled()) {
		Thread.sleep(2000);
		popupScreen.click();
		}
		
	}
}
