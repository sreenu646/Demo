package sreenu.java1_8.Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

@FunctionalInterface
interface Enable
{
	boolean check(WebElement e);
}
public class LambdaCheckDisplayed {
public static void main(String[] args) {
	WebDriver webDriver=new FirefoxDriver();
	webDriver.manage().window().maximize();
	webDriver.get("https://www.gmail.com");
	Enable e1=(WebElement ele)->{
		boolean b;
		if(ele.isDisplayed()&&ele.isEnabled())
		{
			b=true;
		}
		else
		{
			b=false;
		}
		return b;
	};
	boolean  b=e1.check(webDriver.findElement(By.id("identifierId")));
	System.out.println(b);
}
}
		