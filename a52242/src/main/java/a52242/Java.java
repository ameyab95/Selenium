package a52242;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Java 
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("java");
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(10000);
	
		//WebElement w =	driver.findElement(By.id("resultStats"));
		//System.out.println(w.getText());
        //System.out.println(driver.findElement(By.xpath("//div[contains(.,'results')]")).getText());
		List<WebElement> lst = driver.findElements(By.xpath("//div[@class='card-section']/child::p[@class='brs_col']"));
		//List<WebElement> lst = driver.findElements(By.xpath(""));
		for(WebElement q1 : lst)
		{
			System.out.println(q1.getText());
		}
	}

}
