package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	
	WebDriver driver;
	NewTest_PO nt ; 
	
  @Test
  public void gratifi() {
	  
	   nt.selectProduct(driver);
	   
  }
  @BeforeTest
  public void beforeTest() {
	  
	  	System.setProperty("webdriver.chrome.driver", "D:/FreeTime/Jar Files/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com");
		nt = new NewTest_PO(driver);
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
