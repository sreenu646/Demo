package sreenu.java1_8.Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

@FunctionalInterface
interface Check
{
	void click(WebElement e);
}
public class LamdaChekClick {
public static void main(String[] args) {
	WebDriver webDriver=new FirefoxDriver();
	webDriver.manage().window().maximize();
	webDriver.get("https://www.gmail.com");
	WebElement uname=webDriver.findElement(By.id("identifierId"));
	uname.clear();
	uname.sendKeys("rameshsoft.selenium");
	Check c=(WebElement e)->{if(e.isDisplayed()&&e.isEnabled())
	{
		e.click();
	}
	else
	{
		System.out.println("element is not displayed");
	}
	};
	c.click(webDriver.findElement(By.id("identifierNext")));
}
}
