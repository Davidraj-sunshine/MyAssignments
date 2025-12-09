package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Create_Lead {

	public static void main(String[] args) {

		// ChromeOptions
		ChromeOptions option = new ChromeOptions();

		// add arg
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

		// Click on the "Leads" tab.
		driver.findElement(By.linkText("Leads")).click();

		// Click on the "Create Lead" button.
		driver.findElement(By.linkText("Create Lead")).click();

		// Enter a FirstName.
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jackie");

		// Enter a LastName.
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Frankie");

		// Enter a CompanyName.
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		// Enter a Title .
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Java-Selenium");

		// Click the "Create Lead" button.
		driver.findElement(By.name("submitButton")).click();

	}

}
