package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Create_Account {

	public static void main(String[] args) throws InterruptedException {
		
		//ChromeOptions
		ChromeOptions option = new ChromeOptions();
		
		//add arg
		option.addArguments("--guest"); 

		// Initialize the WebDriver
		ChromeDriver driver = new ChromeDriver(option);

		// maximize window
		driver.manage().window().maximize();

		// load url
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Enter a username and password.
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click the "Login" button.
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on the "CRM/SFA" link.
		driver.findElement(By.id("button")).click();

		// Click on the "Accounts" tab.
		driver.findElement(By.linkText("Accounts")).click();

		// Click on the "Create Account" button.
		driver.findElement(By.linkText("Create Account")).click();

		// Enter an account name.
		driver.findElement(By.id("accountName")).sendKeys("David787");

		// Enter a description as "Selenium Automation Tester." - Enter a Number Of
		// Employees.
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");

		// Enter a Site Name as “LeafTaps”
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");

		// Click the "Create Account" button.
		driver.findElement(By.className("smallSubmit")).click();

		// Pause or delay
		Thread.sleep(3000);

		// Close the browser window.
		driver.close();

	}

}
