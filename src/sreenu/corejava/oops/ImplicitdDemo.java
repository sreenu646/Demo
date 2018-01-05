package sreenu.corejava.oops;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitdDemo {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
	

	//d.manage().timeouts().implicitlyWait(69, TimeUnit.SECONDS);
	d.manage().window().maximize();
	d.get("https://www.gmail.com");
	
}
}