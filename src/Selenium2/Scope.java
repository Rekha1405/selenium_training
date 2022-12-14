package Selenium2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		
		//count of links on the page
		
		System.setProperty("webdriver.chrome.driver", "/Users/rekha/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		// 2. count of links on the Footer
		WebElement footerDriver =driver.findElement(By.id("gf-BIG")); // limiting webdriver scope
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		//3. count of links on the Footer first column
		WebElement coloumDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		/*WebElement footerColoumDriver =driver.findElement(By.xpath("//div/table/tbody/tr/td[1]/ul"));
	    System.out.println(footerColoumDriver.findElements(By.tagName("a")).size());*/
		System.out.println(coloumDriver.findElements(By.tagName("a")).size());
		
		// 4. click on each link in the column and check if pages are opening
		
		for(int i =1; i<coloumDriver.findElements(By.tagName("a")).size();i++)
		{
			String clickonlinkTab = Keys.chord(Keys.COMMAND,Keys.ENTER);
			
			coloumDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);
		}//open all the tabs
			Set<String> abc =driver.getWindowHandles();
			Iterator <String> it = abc.iterator();
		
			while(it.hasNext())
				{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			
			
			
			
			
		
	
		

		
	}

}
