package GreenCart;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
	//	Thread.sleep(3000);
		String[] items = {"Cucumber","Brocolli","Tomato","Cashews"};
		add(driver,items);
		Thread.sleep(1000);
		//check cart
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.cssSelector("div[class='cart-preview active'] div[class='action-block'] button")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class ='promoCode']")));
		driver.findElement(By.xpath("//input[@class ='promoCode']")).sendKeys("rahulshettyacademy");
		w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("button.promoBtn"))));
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='promoInfo']")));
		System.out.println(driver.findElement(By.cssSelector("span[class='promoInfo']")).getText());
		
		driver.close();
	}
	public static void add(WebDriver driver,String[] items) {
		List<WebElement> names =driver.findElements(By.xpath("//h4[@class='product-name']"));
		List<String> ls = Arrays.asList(items);
		int j=0;
		for(int i=0;i<names.size();i++) {
			String name = names.get(i).getText();
			String[] itemsArray = name.split("-");
			String itemName = itemsArray[0].trim();
			
			
			if(ls.contains(itemName)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j==items.length) {
					break;
				}
				j++;
			}
			
		}
	}

}
