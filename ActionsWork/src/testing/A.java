package testing;

import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class A {

	
	@Test
	public void tcase1()
	{
		FirefoxDriver f = new FirefoxDriver();
		f.get("https://www.facebook.com");
		f.findElementById("email").sendKeys("adedeqw");
		Actions act = new Actions(f);
		act.sendKeys(Keys.CONTROL).sendKeys("C").build().perform();
		
		
	}
	
}
