package dropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class E2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			
			
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@value='HYD']")).click();
			
	///	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='HYD']")).click();
			
			driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
			
			driver.findElement(By.xpath("(//a[@value='JAI'])[2]")).click();
			
			driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
			
			if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
			{
				System.out.println("Return Date is disabled");
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertFalse(true);
			}
			
		driver.findElement(By.id("divpaxinfo")).click();
		
		
		Thread.sleep(3000);
		int i=1;
		while(i<5)                         
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			
			i++;
		}
		

		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		
			
		//driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		//driver.findElement(By.cssSelector("input#ctl00_mainContent_btn_FindFlights")).click();
		
	//driver.findElement(By.cssSelector("input[value = 'Search']")).click();
		
	//	driver.findElement(By.cssSelector("[value = 'Search']")).click();
		driver.findElement(By.xpath("//input[@value = 'Search']")).click();
	}

}
