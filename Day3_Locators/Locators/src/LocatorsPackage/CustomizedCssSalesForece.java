package LocatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizedCssSalesForece {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Work\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		//formula to create your own  xpath
//		*//tagname#id*
		
		
		driver.findElement(By.cssSelector("input#username")).sendKeys("MyCSS");
		driver.findElement(By.cssSelector("input#password")).sendKeys("1234");
		driver.findElement(By.cssSelector("input#Login")).click();


	}

}
