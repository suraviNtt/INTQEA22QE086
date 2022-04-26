package project_name.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	
	@FindBy(id = "icon")
	WebElement icon;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void searchElement(String searchText){
		System.out.println("clickOnsearch");
		System.out.println("enterTheSerchItemValue : "+searchText);
		System.out.println("ClickOnSearchIcon");
	}
	
}
