package GreenCart;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		String[] items = {"Cucumber","Brocolli","Tomato","Cashews"};
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
		Thread.sleep(1000);
		//check cart
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.cssSelector("div[class='cart-preview active'] div[class='action-block'] button")).click();
		
	
		
		
	}

}
