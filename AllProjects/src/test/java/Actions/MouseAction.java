package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement mouse  = driver.findElement(By.id("nav-link-accountList"));
		Actions a = new Actions(driver);
		a.moveToElement(mouse).build().perform();
		a.moveToElement(mouse).contextClick().build().perform();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		driver.close();
		
	}

}
