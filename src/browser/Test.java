package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		String browser = "Firefox";

		if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Dell\\Winter2020Selenium\\crmtechfios\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

		}

	}
}
