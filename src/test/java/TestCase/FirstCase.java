package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class FirstCase {
	
	
	public void Browser()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		String expected = "Practice Page";
	      String	actual = driver.getTitle();
	      
	      Assert.assertEquals(actual,expected );
	      
	      System.out.println("Rahul shetty website " + actual);
	      
	      driver.close();
		
		
	}

}
