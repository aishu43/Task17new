package Task17;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Snapdeal {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ChromeDriver driver;
		
@BeforeClass
public void open()
		{
		 driver =new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		}

@Test 
public void Testnew() throws InterruptedException

{
		driver.findElement(By.xpath("//div[@class=\"accountInner\"]")).click();
		driver.get("https://www.snapdeal.com/login");
		driver.findElement(By.xpath("//input[@placeholder=\"Mobile Number/ Email\"]")).sendKeys("aishukaif@gmail.com");
		driver.findElement(By.xpath("//button[@id=\"checkUser\"]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"j_number\"]")).sendKeys("8899938839");
		
		
	driver.findElement(By.xpath("//input[@id=\"j_name\"]")).sendKeys("navi");	 
	driver.findElement(By.xpath("//input[@id=\"j_password\"]")).sendKeys("Aish@4321");
    driver.findElement(By.xpath("//button[@id=\"userSignup\"]")).click();
    driver.findElement(By.xpath("//button[@id=\"registerUser\"]")).getAttribute("value");
    System.out.println("User Logged in Successfully");
	}

}
