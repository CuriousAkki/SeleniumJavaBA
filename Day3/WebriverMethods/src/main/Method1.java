package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		
		WebDriver chrome = new ChromeDriver();
		
		chrome.get("https://www.google.com/");
		
		System.out.println(chrome.getTitle());
		
		System.out.println(chrome.getCurrentUrl());	
		
			System.out.println(chrome.getPageSource());
			
		chrome.get("https://in.yahoo.com/?p=us");
		chrome.navigate().back();
		chrome.navigate().forward();
		chrome.close();
		

	}

}
