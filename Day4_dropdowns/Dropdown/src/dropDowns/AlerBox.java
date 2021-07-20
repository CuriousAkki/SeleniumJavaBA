package dropDowns;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlerBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String text = "Akshay";
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.findElement(By.id("name")).sendKeys(text);
			driver.findElement(By.cssSelector("[id ='alertbtn']")).click();
			System.out.println(driver.switchTo().alert().getText());
			Thread.sleep(3000);
			driver.switchTo().alert().accept(); 
			driver.findElement(By.id("confirmbtn")).click();
			Thread.sleep(3000);
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().dismiss();
			//driver.switchTo().alert() is used to switch context from browser to alert
			//accept() method is used to click on ok button i.e we are accepting the alert
			//alert is class and accept and dismiss are the methods

	}

}
