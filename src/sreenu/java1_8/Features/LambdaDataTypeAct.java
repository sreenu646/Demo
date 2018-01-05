package sreenu.java1_8.Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

@FunctionalInterface
interface dta
{
	void dtaText(WebElement e,String textData);
}
public class LambdaDataTypeAct {
public static void main(String[] args) {
	WebDriver webDriver=new FirefoxDriver();
	webDriver.manage().window().maximize();
	webDriver.get("https://www.gmail.com");
	dta d=(WebElement a,String td)->{
		if(a.isDisplayed()&&a.isEnabled())
		{
			a.clear();
			a.sendKeys(td);
		}
		else
		{
			System.out.println("element is not displayed");
		}
	};
	d.dtaText(webDriver.findElement(By.id("identifierId")), "rameshsoft.selenium");
}
}
