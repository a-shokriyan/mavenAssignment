package tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitle {
	
	@Test
	public void getGoogleTitle() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		String actual = driver.getTitle();
		AssertJUnit.assertEquals(actual, "Google");
		driver.quit();
	}

}
