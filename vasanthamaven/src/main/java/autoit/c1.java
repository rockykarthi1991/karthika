package autoit;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		//classname objectname= new classname();
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://www.filemail.com/share/upload-file");
		Thread.sleep(3000);
		ob.findElementByCssSelector("#addBtn").click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("D:\\kar.exe");

	}
}
