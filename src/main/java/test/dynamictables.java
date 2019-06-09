package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamictables {
	public static void main(String [] args)
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/selenium-webdriver/handle-dynamic-webtables-in-selenium-webdriver/");
		driver.findElement(By.xpath("//td[text()='Free']")).getText();
	}
	//*[@id="ctl00_MainContent_orderGrid"]/tbody
	//http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx
}
