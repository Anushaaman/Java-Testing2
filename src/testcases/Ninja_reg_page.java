package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ninja_reg_page {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anush\\OneDrive\\Documents\\My Selenium Softwares\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		System.out.println("Browser opened");
		//to open another site from a site
		driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
		
		WebElement firstName = driver.findElement(By.id("input-firstname"));
		firstName.sendKeys("Anu");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Aman");
		driver.findElement(By.id("input-email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.name("telephone")).sendKeys("1233456");
		driver.findElement(By.id("input-password")).sendKeys("absdfgh1234");
		driver.findElement(By.id("input-confirm")).sendKeys("absdfgh1234");
		
		WebElement newsletter = driver.findElement(By.name("newsletter"));
		newsletter.click();
		WebElement checkbox = driver.findElement(By.name("agree"));
		checkbox.click();
		WebElement clickbutton = driver.findElement(By.xpath("//input[@type='submit']"));
		clickbutton.click();
	
		

	}

}
