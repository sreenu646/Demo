package sreenu.java1_8.Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

@FunctionalInterface
interface Predicate<T>
{
	boolean test(T t);
}
public class LambdaPredicate {
static Predicate<WebElement>p1=s->s.isDisplayed()&&s.isEnabled();
public static boolean isCheck(WebElement e)
{
	boolean b=p1.test(e);
	return b;
}
public static void main(String[] args) {
	WebDriver webDriver=new FirefoxDriver();
	webDriver.manage().window().maximize();
	webDriver.get("https://www.gmail.com");
	WebElement ele=webDriver.findElement(By.id("identifierId"));
	System.out.println(LambdaPredicate.isCheck(ele));
}
}
