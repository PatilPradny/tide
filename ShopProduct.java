package mindtree.myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tide.com/en-us");
		//driver.get("(//a[@class=\"menu-item-title event_menu_click \"])[1]")
		driver.findElement(By.xpath("(//a[@class=\"menu-item-title event_menu_click \"])[1]")).click();
		driver.findElement(By.xpath("(//span[@class=\"ps-button-label\"])[1]")).click();
		for(String mychild:driver.getWindowHandles()) 
		{
			driver.switchTo().window(mychild);
		}
		driver.findElement(By.xpath("(//button[@class=\"ps-online-buy-button unavailable ps-online-seller-button\"])[2]")).click();
		

	}

}
