package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	//methods
	//variables
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Superuser\\june22_selenium\\1stSelenium\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();  //implements from chromedriver
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		// Scanner snc = new Scanner(System.in);
		Thread.sleep(3000);
		driver.close();
	}
	

}
