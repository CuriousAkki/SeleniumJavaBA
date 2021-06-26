package LocatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class excerciseIESalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver(); 
		driver.get("https://login.salesforce.com/?locale=in");
		
		driver.findElement(By.id("username")).sendKeys("Akshay1234");
		
		driver.findElement(By.id("password")).sendKeys("test1234");
		
		driver.findElement(By.id("Login")).click();
		
		
		System.out.println(driver.findElement(By.id("error")).getText()	);
		
		
		
		
	}

}
