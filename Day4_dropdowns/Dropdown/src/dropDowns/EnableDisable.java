package dropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EnableDisable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			
			//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
			// eventhough we haven't enabled the round trip radio button it is giving true in return eventhough 
			//return date option is not enabled
			// this is the drawback of  isEnabled Method
			System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
			//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
			
			System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
			if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
			{
				System.out.println("Return Date is enabled");
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertFalse(false);
			}
			
			
			
			
			
		

	}

}
