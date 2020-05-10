package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {
		String browser = "Firefox";
		WebDriver driver;

		if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Dell\\Winter2020Selenium\\crmtechfios\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();

		}

		else if (browser.equalsIgnoreCase("firefox"))

		{
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Dell\\Winter2020Selenium\\crmtechfios\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();

		}

	}
}
