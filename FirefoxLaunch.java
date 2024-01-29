package task16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {
	public static void main(String[] args) {

		FirefoxDriver driver = new FirefoxDriver();
		// load URL
		driver.navigate().to("https://www.google.co.in/");
		
		// maximize browser
		driver.manage().window().maximize();
		
		// getting current URL
		String currentUrl = driver.getCurrentUrl();
		System.out.println(" URL is of Current Page :" + currentUrl);
		
		// refresh the page
		driver.navigate().refresh();
				
		// close the browser
		driver.close();
		
	}
}
