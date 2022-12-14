package Selenium2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://chromedriver.chromium.org/capabilities
		// Modify network behavior
		ChromeOptions options = new ChromeOptions();
		FirefoxOptions options1 = new FirefoxOptions();
		EdgeOptions options2 = new EdgeOptions();
		options.setAcceptInsecureCerts(true);
		//options.addExtensions("path"); - Add a ChromeDriver-specific capability.
		//options.addExtensions(new File("/path/to/extension.crx"));
		
		// Add the WebDriver proxy capability.
		Proxy proxy =new Proxy();
		proxy.setHttpProxy("ipaddress:4444");
		options.setCapability("proxy", proxy); // 2 proxy object
		
		//Set download directory
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "/directory/path");
		options.setExperimentalOption("prefs", prefs);
		
		//Block pop-up windows
		options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		
		System.setProperty("webdriver.chrome.driver", "/Users/rekha/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
	    System.out.println(driver.getTitle());
		
		
		
		
		

	}

}
