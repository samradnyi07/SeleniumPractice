package Scopes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,500)");
		
		WebElement table = driver.findElement(By.className("tableFixHead"));
		js.executeScript("document.querySelector('.tableFixHead').scrollTop =5000");
		
		List<WebElement> values =driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum =0;
		for(int i=0;i<values.size();i++) {
			sum += Integer.parseInt(values.get(i).getText());
		}
		
		System.out.println(sum);
		String fullString = driver.findElement(By.className("totalAmount")).getText();
		
		int amt = Integer.parseInt(fullString.split(":")[1].trim());
		
		Assert.assertEquals(sum, amt);
		driver.close();
		

	}

}
