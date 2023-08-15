package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Wynisco_reg {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anush\\OneDrive\\Documents\\My Selenium Softwares\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		System.out.println("Browser opened");
		//to open another site from a site
		driver.navigate().to("https://www.wynisco.com/apply.html");
		driver.manage().window().maximize();
		
		WebElement firstName = driver.findElement(By.id("First_Name"));
		firstName.sendKeys("test");
		
		driver.findElement(By.id("Last_Name")).sendKeys("tester");
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("test@gmail.com");
		
		driver.findElement(By.id("Mobile")).sendKeys("12345");
		
		//for drop downs, use select method
		Select course = new Select(driver.findElement(By.xpath("//select[@id='LEADCF9']")));
		course.selectByVisibleText("Data Analyst");
		
		Select country = new Select(driver.findElement(By.xpath("(//select[@class='zcwf_col_fld_slt'])[2]")));
		country.selectByIndex(3);
		
		
		
		
		
		
		
	}

}
