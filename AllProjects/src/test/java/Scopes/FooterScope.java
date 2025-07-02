package Scopes;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.ShiftLeft;

public class FooterScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		WebElement columndriver = footerDriver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]"));
		int cnt =columndriver.findElements(By.tagName("a")).size();
		System.out.println(cnt);
		
		for(int i=1;i<cnt;i++) {
			String clickWindow = Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickWindow);
		}
		 Set<String> abc = driver.getWindowHandles();
		 Iterator<String> it = abc.iterator();
		 
		 while(it.hasNext()) {
			 driver.switchTo().window(it.next());
			 System.out.println(driver.getTitle());
		 }
		driver.close();
		
	}
}
