import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckboxExercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/rekha/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.cssSelector("input[name='name']:nth-child(2)")).sendKeys("Rekha Sharma");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("rekhabhardwaj1405@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Shamvivek@1");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		WebElement StaticDropdown = driver.findElement(By.cssSelector("select[id='exampleFormControlSelect1']"));
		Select dropdown = new Select(StaticDropdown);
		dropdown.selectByIndex(1);
		// System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.findElement(By.xpath("//input[@id='inlineRadio1']")).click();
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("08/15/1988");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		driver.findElement(By.cssSelector("div[class*='dismissible']")).getText();

	}

}
