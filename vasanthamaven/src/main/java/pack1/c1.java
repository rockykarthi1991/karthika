package pack1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c1 {

	@Test(groups="One")
	public void t1() throws InterruptedException
	
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.seleniumeasy.com");
	 //method1: page up and down
		ob.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);

		
	
		ob.quit();
		
	}
}
