package Selenium2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/rekha/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		// Broken URL
		// step 1 - Is get to all URL's tied up to the links using Selenium
		// Java methods will call URL'sand gets you the status code
		// Is status code > 400 then that url is not working --link which tied to url is
		// broken
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links = driver.findElements(By.cssSelector("li[class*='gf'] a"));
		SoftAssert sf = new SoftAssert();

		for (WebElement link : links) {
			String url = link.getAttribute("href");

			// String url =
			// driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
			// String url =
			// driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
			// java open connection method
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respcode = conn.getResponseCode();
			System.out.println(respcode);
			sf.assertTrue(respcode < 400, "The link with text" + link.getText() + " is broken with code" + respcode);
			/*
			 * if (respcode>400) { System.out.println("The link with text" + link.getText()
			 * + " is broken with code" + respcode); Assert.assertTrue(false); }
			 */

		}

		sf.assertAll();

	}

}
