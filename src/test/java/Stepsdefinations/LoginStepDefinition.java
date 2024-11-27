package Stepsdefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	public static WebDriver driver;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.get("https://www.saucedemo.com");
	}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
		
		driver.findElement(By.id("user-name")).sendKeys("problem_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}

	@And("Clicks on ligin button")
	public void clicks_on_ligin_button() {
		
		driver.findElement(By.id("login-button")).click();
	
	}

	@Then("User should be navigated to homepage")
	public void user_should_be_navigated_to_homepage() {
		Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size()>0);
		System.out.println("User should be navigated to homepage");
	    
	}

	@And("close the browser")
	public void close_the_browser() {
		driver.close();
	    
	}


}
