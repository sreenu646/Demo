package sreenu.java.lang;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetClassDemo {
public static  void main(String[] args) {
	WebDriver webDriver=new FirefoxDriver();
	webDriver.manage().window().maximize();
	webDriver.get("https://www.google.com");
	WebElement element=webDriver.findElement(By.id("lst-ib"));
	System.out.println(element.getClass().getName());
}
}
