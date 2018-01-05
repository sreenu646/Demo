package sreenu.java1_8.Features;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class StreamDemo {
public static void main(String[] args) {
	WebDriver webDriver=new FirefoxDriver();
	webDriver.manage().window().maximize();
	webDriver.get("https://www.facebook.com");
	Select s=new Select(webDriver.findElement(By.id("day")));
	List<WebElement>e=s.getOptions();
	//List<WebElement>e2=s.getAllSelectedOptions();
	List l=e.stream().filter(e1->e1.isDisplayed()).collect(Collectors.toList());
	//List l1=e.stream().filter(e2->e2.isDisplayed()).collect(Collectors.toList());
	System.out.println(l.size());
	//System.out.println(l1.);
}
	

}
