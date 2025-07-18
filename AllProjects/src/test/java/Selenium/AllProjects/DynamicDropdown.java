package Selenium.AllProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR']//a[@value='BLR']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
		
		driver.findElement(By.cssSelector("a[class = 'ui-state-default ui-state-active']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("input[name='ctl00$mainContent$view_date2']")).isEnabled());
		
		String atrr = driver.findElement(By.id("Div1")).getDomAttribute("style");
		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
		if(atrr.contains("1")) {
			System.out.println("It is enabled");
		}
		else {
			System.out.println("It is disabled");

		}
		/*
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); */
		
	}

}
