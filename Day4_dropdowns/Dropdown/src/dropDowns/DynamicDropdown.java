package dropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// //a[@value = 'MAA'] xpath for chennai
		//	//a[@value = 'BLR'] xpath for banglore
			
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			driver.findElement(By.xpath("(//a[@value = 'MAA'])")).click();
			
			driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
			
			//driver.findElement(By.xpath("(//a[@value = 'BLR'])")).click(); #try this xpath u will get an error
			driver.findElement(By.xpath("(//a[@value = 'BLR'])[2]")).click();
			
			//to identify city from 2nd dropdown we need to specify index as 2 
			
	}

}
