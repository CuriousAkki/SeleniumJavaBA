package dropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
			//System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		//	driver.findElement(By.cssSelector("input[id = 'ctl00_mainContent_chk_friendsandfamily']")).click();
			//ctl00$mainContent$chk_friendsandfamily
		driver.findElement(By.cssSelector("input[name*= 'friendsandfamily']")).click(); 
		// regex expression  instead of writing whole value of attribute write some words of it
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
	//System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
	
	System.out.println(driver.findElements(By.cssSelector("input[type = 'checkbox']")).size());
	
	
	
			

	}

}
