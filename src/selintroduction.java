import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selintroduction {

	public static void main(String[] args) {
		// Invoking Browser
        // Chrome - Chromedriver ->Methods close get
		// Firefox - FirefoxDriver -> Methods close get
		// Safari - SafariDriver -> Methods close get
		// WebDriver close get (interface)
		// WebDriver Methods + class Methods
		
		// Chromedriver.exe-> Chrome Browser (windows)
		System.setProperty("webdriver.chrome.driver","/Users/rekha/Downloads/chromedriver");
		
		// Webdriver.chrome.driver-> value of path (where is chrome driver present in your local)
		
	      WebDriver driver = new ChromeDriver();
	      
	      System.setProperty("webdriver.edge.driver", "/Users/rekha/Downloads/msedgedriver");
	      WebDriver driver2 = new EdgeDriver();
	      
		
		/*//Firefox launch
		//GeckoDriver
		//WebDriver.gecko.driver
		System.setProperty("webdriver.gecko.driver","/Users/rekha/Downloads/geckodriver");
		
		WebDriver driver1 = new FirefoxDriver();
		
	
		
		driver.get("https://www.amazon.com/gp/cart/view.html?ref_=nav_cart");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//driver.quit();*/
		
	}
}