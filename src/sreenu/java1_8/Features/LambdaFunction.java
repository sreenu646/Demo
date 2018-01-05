package sreenu.java1_8.Features;

import java.util.function.Function;
import java.util.function.Predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LambdaFunction {
static Function<WebElement,String>f1=e->e.getAttribute("name");
static Function<WebElement,String>f2=e->e.getTagName();
static Predicate<WebElement>p=e->e.isDisplayed();
public static void main(String[] args) {
	WebDriver webDriver=new FirefoxDriver();
	webDriver.manage().window().maximize();
	webDriver.get("https://www.gmail.com");
	WebElement ele=webDriver.findElement(By.id("identifierId"));
	System.out.println(f1.apply(ele));
	System.out.println(f2.apply(ele));
	System.out.println(p.test(ele));
}
}
