package Sample.mavenproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSample {
	
	public void TestSample()
	
	{
		  System.setProperty(Constants.BROWSER_PROP_KEY, Constants.BROWSER_PROP_VALUE);
		  WebDriver driver = new ChromeDriver();
		  driver.get(Constants.URL);
		  //locator by id
		String paragraph=  driver.findElement(By.xpath(Locators.paragraphXpath)).getText();
		  
		System.out.println(paragraph);
	}

}
