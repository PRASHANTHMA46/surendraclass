package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Secondcase {
	
	public void browserseconf()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		System.out.println("browser Lanuched");
		
		driver.quit();
		
	}

}
