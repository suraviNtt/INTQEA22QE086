package seleniumStart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StartSel {

	public static void main(String[] args) {
		
		//web driver manger setup
		WebDriverManager.chromedriver().setup();
		//driver setup
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
//		driver.findElement(By.id("icon")).click();
//		driver.findElement(By.className("classAttributeValue"));
//		driver.findElement(By.linkText("textValueInsideLink"));
//		driver.findElement(By.name("nameAttributeValue"));
//		driver.findElement(By.partialLinkText("PartialTextOfLink"));
		
		WebElement appLogo =  driver.findElement(By.xpath("//*[@id=\"icon\"]"));
		appLogo.click();
		
		
		List<WebElement> activeLinks = driver.findElements(By.xpath("//a"));
		
		
	}
}
