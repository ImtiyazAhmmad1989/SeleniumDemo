import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Test {

	@org.testng.annotations.Test
	public void m1() {

		System.out.println("Running Test Form Test !!!!!!!!!!");

		WebDriverManager.iedriver().setup();

		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.google.com");

	}
}
