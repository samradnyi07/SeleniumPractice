package Scopes;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class MultipleWindows {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> it = handle.iterator();
		String parentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		driver.get("https://rahulshettyacademy.com/");
		String name =driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		driver.switchTo().window(parentId);
		
		WebElement name2 = driver.findElement(By.cssSelector("input[name ='name']"));
		name2.sendKeys(name);
		 File file= name2.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(file, new File("D://logo.png"));
		System.out.println( name2.getRect().getDimension().getWidth());
		
		 System.out.println( name2.getRect().getDimension().getHeight());
	}

}
