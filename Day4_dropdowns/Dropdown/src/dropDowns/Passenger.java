package dropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Passenger {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			
			driver.findElement(By.id("divpaxinfo")).click();
			Thread.sleep(2000L);
			
			driver.findElement(By.id("hrefIncAdt")).click();
		//	driver.findElement(By.id("hrefIncAdt")).click();
		//	driver.findElement(By.id("hrefIncAdt")).click();
		//	driver.findElement(By.id("hrefIncAdt")).click();
			//run all these commented lines to get multiple passengers in dropdown
			driver.findElement(By.id("btnclosepaxoption")).click();
		
		
			
			//driver.close();
		
		
	}

}
