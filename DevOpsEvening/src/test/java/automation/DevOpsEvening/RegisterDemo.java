package automation.DevOpsEvening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegisterDemo {

	public WebDriver driver;
	
	// Parameterized all Input Values
	String URL = "https://nxtgenaiacademy.com/";
	
	@BeforeClass
	public void launchApplication() {
		// To Set System Property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		// To Create Driver Object in Driver Interface
		driver = new ChromeDriver();

		// Step:2 Launch the Home URL"https://aiforevery1.com".

		// Launch the Home URL
		driver.get(URL);

		// To Maximize Window
		driver.manage().window().maximize();
		System.out.println("Application is launched");

	}

	@AfterClass
	public void closeApplication() {
		driver.close();
		System.out.println("Application is closed");
	}



	@Test
	public void registerDemo() {
		System.out.println("User is registered");
	}
}
