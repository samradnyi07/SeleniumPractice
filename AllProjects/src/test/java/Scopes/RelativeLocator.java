package Scopes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
public class RelativeLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement nameBox =driver.findElement(By.cssSelector("input[name ='name']"));
	System.out.println(driver.findElement(with(By.tagName("label")).above(nameBox)).getText());
		
	WebElement dateofBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));
	driver.findElement(with(By.tagName("input")).below(dateofBirth)).click();
	
	  WebElement checkBoxText=driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
	  driver.findElement(with(By.tagName("input")).toLeftOf(checkBoxText)).click();
	}

}
