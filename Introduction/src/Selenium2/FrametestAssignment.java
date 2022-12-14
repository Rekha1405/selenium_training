package Selenium2;

import java.util.Set;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrametestAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/rekha/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		//driver.findElement(By.cssSelector("a[href='/frames']")).click();
		//driver.findElement(By.cssSelector("a[href='/nested_frames']")).click();
		//driver.findElement(By.linkText("Frames")).click();
	    driver.findElement(By.linkText("Nested Frames")).click();
	    System.out.println(driver.findElements(By.tagName("frame")).size());
	    driver.switchTo().frame("frame-top");
	    driver.switchTo().frame("frame-middle");
	    System.out.println(driver.findElement(By.id("content")).getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
