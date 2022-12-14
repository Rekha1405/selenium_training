import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/rekha/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		// //a[@value='MAA']--- X-path for chennai
		// //a[@value='BLR']--- X-path for bengaluru
		// //div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']
		// //div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']

		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

	}
}
