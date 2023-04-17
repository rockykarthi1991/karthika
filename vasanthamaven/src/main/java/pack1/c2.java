package pack1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class c2 {

	
	@Test(groups="One")
	public void t2() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://jqueryui.com/slider/");
		//switch ur control to that frame
		// frame: id, index, name
		ob.switchTo().frame(0);
		//slider= horizontal   move along x axis, y value will be 0
		//vertical             move along y axis, x value will be 0
		WebElement ele = ob.findElementById("slider");
		Actions ac= new Actions(ob);
		ac.dragAndDropBy(ele,40 ,0 ).build().perform();
		File f = ob.getScreenshotAs(OutputType.FILE);
		//copy, paste => FileUtils => apache directory studio common io
		FileUtils.copyFile(f, new File("C:\\Users\\hp\\eclipse-workspace\\vasanthamaven\\screenshots\\k.png"));
		Thread.sleep(3000);
		ob.quit();
	}
}
