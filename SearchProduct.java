package mindtree.myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tide.com/en-us");
		
		driver.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys("Tide Powder");
		driver.findElement(By.xpath("//*[@id='site-header']/div[2]/div/div/div/form/div/button/svg")).click();
		driver.findElement(By.xpath("(//span[@class=\"ps-button-label\"])[1]")).click();
		for(String mychild:driver.getWindowHandles()) 
		{
			driver.switchTo().window(mychild);
		}
		driver.findElement(By.xpath("(//button[@class=\"ps-online-buy-button unavailable ps-online-seller-button\"])[2]")).click();
	}

}
