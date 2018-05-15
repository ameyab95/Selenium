package a52242;

import org.openqa.selenium.firefox.FirefoxDriver;

public class google3 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize(); //maximize the browser
		driver.get("http://www.google.com");
		if(driver.getCurrentUrl().length()>5)
		{
			System.out.println(driver.getCurrentUrl());
		}
		else
		{
			System.out.println(driver.getCurrentUrl().length()+" "+driver.getCurrentUrl());
		}		
	}
}