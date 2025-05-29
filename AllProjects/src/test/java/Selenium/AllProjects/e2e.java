package Selenium.AllProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class e2e {

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
		
		driver.findElement(By.cssSelector("input[id *= 'chk_IndArm'] ")).click();
		

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		
		WebElement addAdult =driver.findElement(By.id("hrefIncAdt"));
		
		for(int i=0;i<3;i++) {
			addAdult.click();
		}
		driver.findElement(By.className("buttonN")).click();
		System.out.println("done");
		

		WebElement selectDr = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(selectDr);
		dropdown.selectByIndex(1);
		dropdown.selectByContainsVisibleText("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_btn_FindFlights']")).click();
		System.out.println("Ok Bye");
		driver.close();
	
	
	}

}
