package ishahomes.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IshaHomes {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ishahomes.com/");
		WebElement livechaFrame = driver.findElement(By.id("livservMiddleFrame"));
		WebElement livechatMinimizeButton = driver.findElement(By.xpath("//td[@id='td2']/div"));
		driver.switchTo().frame(livechaFrame);
		livechatMinimizeButton.click();
	}
}
