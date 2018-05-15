import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Google {
	WebDriver driver;
	@Test
	@Parameters({"browser"})
	public void search(String brname) throws Exception
	{
		if(brname.matches("firefox"))
		{
			driver = new FirefoxDriver();
		}
		if(brname.matches("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("selenium");
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
