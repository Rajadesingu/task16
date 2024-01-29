package task16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		// load URL
		driver.navigate().to("https://www.demoblaze.com/");
		
		// maximize browser
		driver.manage().window().maximize();
		
		String acualTitle = driver.getTitle();
		System.out.println(acualTitle);
		
		String expectedTitle = "STORE";
		
		if(acualTitle.equalsIgnoreCase(expectedTitle)) {
			
			System.out.println("Page landed correct website");
		}else {
			
			System.out.println("Page not landed correct website");
		}
		
		// close the browser
		//driver.close();
		
	}
}
