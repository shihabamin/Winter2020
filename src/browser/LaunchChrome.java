package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Winter2020Selenium\\LaunchBrowser\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
		
	}

}
