package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\softwares\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		
	}
}
