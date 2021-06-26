package LocatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Work\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		//driver.findElement(By.id("username")).sendKeys("Akshay");
		driver.findElement(By.cssSelector("#username")).sendKeys("Akshay");
		
		driver.findElement(By.name("pw")).sendKeys("1234");
		
		//driver.findElement(By.className("button r4 wide primary")).click();
		// to check the spaced class name error
		
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
	
		
	}

}
