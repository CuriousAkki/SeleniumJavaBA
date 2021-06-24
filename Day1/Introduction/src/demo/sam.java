 package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create Driver Object
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		
		driver.close();
	}

}
