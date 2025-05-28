package Selenium.AllProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		/*System.out.println(driver.findElement(By.cssSelector("input[id *= 'chk_IndArm'] ")).isSelected());
		
		driver.findElement(By.cssSelector("input[id *= 'chk_IndArm'] ")).click();
	//	driver.findElement(By.cssSelector("input[id *= 'chk_IndArm'] ")).isSelected();
		System.out.println(driver.findElement(By.cssSelector("input[id *= 'chk_IndArm'] ")).isSelected());
*/	
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id *= 'chk_IndArm'] ")).isSelected());
		driver.findElement(By.cssSelector("input[id *= 'chk_IndArm'] ")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id *= 'chk_IndArm'] ")).isSelected());

		int n =driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(n);
	}

}
