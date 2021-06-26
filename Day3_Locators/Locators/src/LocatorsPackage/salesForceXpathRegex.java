package LocatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesForceXpathRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Work\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		//formula to create your own  xpath
//		*//tagname=[contains (@attribute='value')]*
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("MyOwnXpath");
	//	driver.findElement(By.cssSelector("[id*='username']")).sendKeys("regexcss"); //regexcss
		driver.findElement(By.xpath("//input [@id='password']")).sendKeys("123");
		driver.findElement(By.xpath("//input[contains(@name,'Logi')]")).click(); //regex xpath
		
		//id * = 'error'
		
		
		driver.close();


	}

}
