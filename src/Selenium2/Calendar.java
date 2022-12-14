package Selenium2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/rekha/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
		//April 29
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@placeholder='Date of travel']")).click();
		while(!driver.findElement(By.cssSelector("[class*='flatpickr-current-month'] [class*='cur-month']")).getText().contains("April"))
		{
			Thread.sleep(1000);
			//System.out.println(driver.findElement(By.cssSelector("[class*='flatpickr-current-month'] [class*='cur-month']")).getText());
			driver.findElement(By.className("flatpickr-next-month")).click();
			Thread.sleep(1000);
		}
		List<WebElement> dates = driver.findElements(By.className("flatpickr-day"));
		//Grab the common attribute ,put in to the list and iterate
		int count = driver.findElements(By.className("flatpickr-day")).size();
		
		
		 for(int i = 0; i < count; i++) { 
			 Thread.sleep(2000); 
			 String text = driver.findElements(By.className("flatpickr-day")).get(i).getText();
		  
		  if (text.equalsIgnoreCase("15")) {
		  driver.findElements(By.className("flatpickr-day")).get(i).click(); break; }
		  
		  }
		 

		
		
		
		
		
		
			
		
		
		
	}

}
