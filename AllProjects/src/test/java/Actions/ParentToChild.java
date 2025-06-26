package Actions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentToChild {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();
		driver.findElement(By.className("blinkingText")).click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		String parentId = it.next();
		String childId = it.next();
		Thread.sleep(1000);
		driver.switchTo().window(childId);
		Thread.sleep(1000);
		System.out.print(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String fullText = driver.findElement(By.cssSelector(".im-para.red")).getText();
		String[] splir = fullText.split("at");
		String[] pass = splir[1].trim().split("with");
		String password = pass[0].trim();
		
		driver.switchTo().window(parentId);
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys(password);
		driver.close();
	}

}
