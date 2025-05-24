package Selenium.AllProjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators {
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Samradnyi");
		driver.findElement(By.name("inputPassword")).sendKeys("Deshpande");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.className("submit")).click();
		String s =driver.findElement(By.cssSelector(".error")).getText();
		System.out.println(s);
	
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Samradnyi");
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("sam@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("1234567890");
		driver.findElement(By.className("reset-pwd-btn")).click();
		
		String password = driver.findElement(By.xpath("//form/p")).getText();
		System.out.println(password);
		
		String[] array = password.split("'");
		String[] pass =  array[1].split("'");
		String originalPass = pass[0];
		System.out.println(originalPass);
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();

		Thread.sleep(1000);

		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(originalPass);
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElement(By.cssSelector("div p")).getText(),"You are successfully logged in.");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();
	}
	
}