package dropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class passengerLoop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			
			driver.findElement(By.id("divpaxinfo")).click();
			Thread.sleep(2000L);
			
			int i =1 ;
			
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			while(i<5) // we can also use for loop
			{
				driver.findElement(By.id("hrefIncAdt")).click();
				
				i++;
			}
			
			
			
			driver.findElement(By.id("btnclosepaxoption")).click();
			
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
