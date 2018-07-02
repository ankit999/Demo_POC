package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewTest_PO {

	
	@FindBy(xpath = ".//a[@class='login']")
	private WebElement SingIn;
	
	
	@FindBy(xpath = ".//div[@class='desktop-navLink']/a[text()='Women']")
	private WebElement WomenCategoryLink;
	
	

	
	
	
	public NewTest_PO(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void selectProduct(WebDriver driver)
	{
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(".//a[text()='Women']"))).moveToElement(driver.findElement(By.xpath("//*[@id='listing-nav-dropdown']/li[text()='New']"))).click().build().perform();
		
	}
}
