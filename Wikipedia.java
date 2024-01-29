package task16;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wikipedia {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		//// load URL
		driver.navigate().to("https://www.wikipedia.org/");
		
		// maximize browser
		driver.manage().window().maximize();
		
		//Searching Artificial Intelligent
		
		driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligent");
		driver.findElement(By.xpath("//i[@class=\"sprite svg-search-icon\"]")).click();
		
		// selecting Artificial intelligent
		driver.findElement(By.xpath("//a[@title=\"Artificial intelligence\"]")).click();
		
		// selecting History
		
		driver.findElement(By.xpath("//*[@id=\"toc-History\"]/a/div")).click();
		
		// printing title of element
		
		String text = driver.findElement(By.id("History")).getText();
		System.out.println(text);
		
		// close the browser
		//driver.close();
	}

}
