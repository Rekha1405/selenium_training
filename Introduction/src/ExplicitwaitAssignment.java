import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitwaitAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "/Users/rekha/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//label[@class='customradio'])[2]")).click();
		//driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[class='modal-body'] p")).getText();
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
		WebElement staticDropdown = driver.findElement(By.xpath("//select[@data-style='btn-info']"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(2);
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
	    driver.findElement(By.cssSelector("input[id='signInBtn']")).click();
	    wdw.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[id='signInBtn']")));
	    wdw.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
	    List<WebElement> items = driver.findElements(By.cssSelector("div[class='card-footer']"));
	   
	    for(int i=0; i<items.size();i++)
	    {
	    	items.get(i).click();
	    }
	     driver.findElement(By.partialLinkText("Checkout")).click();
	    	
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		

	}

}
