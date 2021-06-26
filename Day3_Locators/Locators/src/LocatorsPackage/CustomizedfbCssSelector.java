package LocatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizedfbCssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Work\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		//formula to create your own css selector
		//tagname[attribute = 'value']
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("MyCSS");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("1234");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		
		
	}

}
