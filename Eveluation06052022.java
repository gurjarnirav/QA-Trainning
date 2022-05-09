package nirav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eveluation06052022 {

	public static void main(String[] args)   throws InterruptedException {
		
		// TODO Auto-generated method stub
		
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "D:\\OneDrive - Krish Compusoft Services Pvt Ltd\\Desktop\\selenium\\chromedriver.exe");
		
		ChromeDriver driver1 = new ChromeDriver();
		
		driver1.manage().window().maximize(); 
		
		driver1.get("\r\n"
				+ "https://demoqa.com/webtables\r\n"
				+ "");
		
		driver1.findElement(By.id("addNewRecordButton")).click();
		driver1.findElement(By.id("firstName")).sendKeys("nirav");
		Thread.sleep(3000);
		driver1.findElement(By.id("lastName")).sendKeys("gurjar");
		Thread.sleep(3000);
		driver1.findElement(By.id("userEmail")).sendKeys("nirav@gmail.com");
		Thread.sleep(3000);
		driver1.findElement(By.id("age")).sendKeys("35");
		Thread.sleep(3000);
		driver1.findElement(By.id("salary")).sendKeys("15500");
		Thread.sleep(3000);
		driver1.findElement(By.id("department")).sendKeys("QA");
		Thread.sleep(5000);
		driver1.findElement(By.id("submit")).click();
		
		driver1.findElement(By.xpath("//*[@id=\"edit-record-4\"]/svg/path")).click();
		Thread.sleep(3000);
		driver1.findElement(By.id("userEmail")).sendKeys("nirav@gmail.com");
		Thread.sleep(2000);
		driver1.findElement(By.id("submit")).click();
	}
}
