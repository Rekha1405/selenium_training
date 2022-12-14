package Selenium2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandleassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Parent to Child window and child to Parent window Assignment
		
		System.setProperty("webdriver.chrome.driver", "/Users/rekha/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href='/windows']")).click();
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
		Set<String> windows =driver.getWindowHandles(); //[Parentid, ChildId]
		Iterator<String>it = windows.iterator();
		String ParentId = it.next();
		//String ChildId = it.next();
		//driver.switchTo().window(ChildId);
		driver.switchTo().window(it.next());
		System.out.println(driver.findElement(By.cssSelector(".example")).getText());
		driver.switchTo().window(ParentId);
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
