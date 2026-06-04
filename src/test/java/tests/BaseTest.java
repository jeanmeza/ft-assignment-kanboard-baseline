package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {

	public static final String password = "admin";
	public static final String app_url = "http://192.168.1.50:8080";
	public WebDriver driver;

	@BeforeEach
	public void setUp() {
		setupNativeBrowser();
		driver.get(app_url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}

	public void setupRemoteWebdriver() {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--no-sandbox", "--headless=new", "--disable-gpu", "--screen-info={1920x1080}");
		try {
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions);
			driver.get(app_url);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void setupNativeBrowser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-search-engine-choice-screen", "--disable-gpu", "--headless=new", "--screen-info={1920x1080}");
		options.setBrowserVersion("127");
		driver = new ChromeDriver(options);
	}

	@AfterEach
	public void quit() {
		driver.quit();
	}

}
