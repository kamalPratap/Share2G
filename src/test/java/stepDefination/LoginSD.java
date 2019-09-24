package stepDefination;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSD {
	
	WebDriver driver;
	
	@Given("^Open chrome and start appliction$")
	public void open_chrome_and_start_appliction() throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://test-app.frevvo.com");
	}

	@When("^Enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_valid_and(String arg1, String arg2) throws Throwable {
		driver.findElement(By.id("username")).sendKeys(arg1);
		driver.findElement(By.id("password")).sendKeys(arg2);
	}

	@When("^Click on login button$")
	public void click_on_login_button() throws Throwable {
		driver.findElement(By.id("login-button")).click();
	}

	@Then("^user should able to login successfully$")
	public void user_should_able_to_login_successfully() throws Throwable {
	    System.out.println("login successfull");
	}

	/*
	 * @Then("^Close the browser$") public void close_the_browser() throws Throwable
	 * { driver.quit(); }
	 */

	@Then("^Click on plus icon$")
	public void click_on_plus_icon() throws Throwable {
		driver.findElement(By.xpath("//a[@title='Add new content']/img")).click();    
	}

	@Then("^Click on upload project$")
	public void click_on_upload_project() throws Throwable {
	    //driver.findElement(By.xpath("//a/paper-icon-item/iron-icon[@icon='frevvo-common-icons:cloud-upload']")).click();
		driver.findElement(By.xpath("//div[@class='a-dropdown-menu-content']/paper-listbox //a[@href='app?edit=true']")).click();
	}
	

	@Then("^Click on Choose project$")
	public void click_on_Choose_project() throws Throwable {
		//driver.findElement(By.xpath("//input[@id='app-file']")).click();
		driver.findElement(By.xpath("//label[text()='Project File']")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\IT\\bdd\\AutoITexeFile\\FileUpload.exe");
		driver.findElement(By.id("upload-application")).click();
		Thread.sleep(10000);
	}
}
