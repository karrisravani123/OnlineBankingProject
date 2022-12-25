package seleniumproject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Account {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\adi reddy\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://onlinetestinghelp.com/projects/banking/admin/?page=accounts/manage_account");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		driver.findElement(By.xpath("  //p[normalize-space()='Account Management']")).click();
		driver.findElement(By.xpath( "  //p[text()='Manage Account']")).click();
		//logout
	//Clickble option
		//i want click
Thread.sleep(3000);
driver.findElement(By.xpath("//span[text()='Adminstrator Admin']")).click();
driver.findElement(By.xpath("//a[@class=\"dropdown-item\"][2]")).click();
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin123");
//Go To Website
driver.findElement(By.xpath("//a[text()='Go to Website']")).click();

driver.findElement(By.xpath("//input[@name='email']")).sendKeys("krohinibala2141998@gmail.com");
driver.findElement(By.xpath("//input[@name='password']]")).sendKeys("2354821");
driver.findElement(By.xpath("//button[text()='Login']")).click();



Select drpdown= new Select(driver.findElement(By.name("Adminstrator Admin")));
drpdown.selectByVisibleText("logout");
List<WebElement>drp=drpdown.getOptions();
System.out.println("elements of drpdown is "+drp.size());
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("krohinibala21998@gmail.com");
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("2354891");
driver.findElement(By.xpath("//button[text()='Login']")).click();






		



		
	
	}

}
