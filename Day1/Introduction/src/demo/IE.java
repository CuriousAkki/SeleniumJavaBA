package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE {
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.ie.driver", "C:\\Work\\IEDriverServer.exe");
		
		WebDriver driver =  new InternetExplorerDriver(); 
		
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
	}

}
