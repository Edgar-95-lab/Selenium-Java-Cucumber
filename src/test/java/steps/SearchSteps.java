package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SearchSteps {
	
	WebDriver driver;
	
	@Given("the user is in the index page")
	public void theUserIsInIndexPage() {
		
		String DriverByBrowser = "drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", DriverByBrowser);
		//ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("--headless");
		//driver = new ChromeDriver(chromeOptions);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
	}
	
	@When("the user enters dresses in the search bar")
	public void userEntersDressesInSearchBar() {
		
		driver.findElement(By.id("search_query_top")).sendKeys("dresses");
		
	}
	
	@When("the user clicks the search button")
	public void userClicksSearchButton() {
		
		driver.findElement(By.name("submit_search")).click();
		
	}
	
	@Then("the dresses page appears")
	public void dressesPage() {
		
		String title = driver.findElement(By.cssSelector("span.lighter")).getText().trim();
		Assert.assertEquals(title, "\"DRESSES\"");
		
		//exit
		driver.close();
		driver.quit();
		
	}

}
