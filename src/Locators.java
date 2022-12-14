import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException   {
		
		
		//implicit wait- 5 second time out. after driver we can set the driver 
		
		/*css selector
		 * Class name ->tagname.classname -> button.signInBtn -> .error
		  
		 * Id -> tagname#id -> input#inputUsername
		 * id (id=value)********
		 
		 * Tagname[attribute = 'value']
		 <input type="text"placeholder="Username"value="">
		 input[placeholder='Username']
		 
		 * //Tagname[@attribute='value']:nth-child(index). - child	items
		 * Parenttagname Childtagname  /*******[id='value'] childtagname
		 * tagname[attribute*='value'] // static four letters of value - regular expression
		 * tagname
		 * .classname td:nth-child(4)----(4)column no
		 
		  
		 * X Path
		 * //Tagname[@attribute='value']
		  //input[@placeholder='Username']
		   <inputtype="text"placeholder="Name">
		   //input[@placeholder='Name'] 
		 * //Tagname[@attribute='value'][index]
		 * //Tagname[text()='add to cart']--when attribute not present
		 * //parentTagname/childTagname some times [index value]
		 * //tagname[contains(@attribute,'value')] //static value - regular expression
		 *  //tagname
		 *  //header/div/button[1]/following-sibling::button[1] ---sibling 
		 *  //header/div/button[1]/parent::div/parent::header ---child to parent
		 *  (//label[@class='customradio'])[2]-new
		     // //td[4]
		
					
		*/
		
		System.setProperty("webdriver.chrome.driver", "/Users/rekha/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
	    System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rekha");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("Rekha@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("2224443331");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		//div[@class='forgot-pwd-btn-conainer']/button[1]
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@value='rmbrUsername']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		//driver.close();		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
