package mindtree.myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log_In {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tide.com/en-us");
		driver.findElement(By.xpath("//*[@id=\"site-header\"]/div[1]/div/div/div/div[2]/span/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"site-content\"]/div/div/div/div/div[1]/div/div/div/div[2]/div/p[6]/a")).click();
		for(String mychild:driver.getWindowHandles()) 
		{
			driver.switchTo().window(mychild);
		}
		driver.findElement(By.xpath("//*[@id=\"scroll\"]/div/div/div/div/div[2]/form/div[7]/div/button")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"login-email\"]")).sendKeys("patilpradnya3012@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"login-password\"]")).sendKeys("Pradnya@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/main/div/div[2]/div/div[3]/div[2]/div/form/div[5]/div[1]/input")).click();
	}   

}