import java.lang.reflect.Array;
import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.print.DocFlavor.SERVICE_FORMATTED;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Base {

		
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/rekha/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		String [] itemsNeeded = {"Beans","Cucumber","Tomato","Potato"} ;
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		
		addItems(driver, itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		// explicit wait
		
	    w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
		
	}
	
	public static void addItems (WebDriver driver, String [] itemsNeeded)
	{
		int j=0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=1;i<products.size();i++)
		{
		//	Brocolli - 1 kg
			
			String[] name =products.get(i).getText().split("-");
			String formatedName = name[0].trim();
			
			// check whether name you extracted is present array or not
			// convert array into array list for easy search
			
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
			if (itemsNeededList.contains(formatedName)) 
			{
				j++;
				//click to add cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				//if (j==3)
				if(j==itemsNeeded.length)
				{
					break;
				}
			
				
			}
			
		}
		
		

	}

}
