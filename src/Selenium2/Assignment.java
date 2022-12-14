package Selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/rekha/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption3")).click();
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	    String abc =driver.findElement(By.cssSelector("label[for='honda']")).getText();
	    WebElement staticdriver = driver.findElement(By.id("dropdown-class-example"));
	    Select dropDown = new Select(staticdriver);
	    dropDown.selectByVisibleText(abc);
	    
	    driver.findElement(By.id("name")).sendKeys(abc);
	    
	    driver.findElement(By.xpath("//input[@value='Alert']")).click();
	    System.out.println(driver.switchTo().alert().getText());
	    Thread.sleep(5000);
	    String text = driver.switchTo().alert().getText();
	    driver.switchTo().alert().accept();
	    if (text.contains(abc))
	    {
	    	System.out.println("Text is present in alert");
	    	
	    }
	    else {
	    	
	    	System.out.println("Text is not present in alert");
	    }
	    Thread.sleep(5000);
	    
		
		
		
		
		
		
		
		
		
	}

}
