package Selenium.AllProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddPassenger {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		
		WebElement addAdult =driver.findElement(By.id("hrefIncAdt"));
		
		for(int i=0;i<3;i++) {
			addAdult.click();
		}
		driver.findElement(By.className("buttonN")).click();
		System.out.println("done");
	}

}
