package stepdefinetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class fishpondsearch {
	static WebDriver driver;
	@Given("^user can access fishpond site$")
	
	public void user_can_access_fishpond_site()  {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\TestngProject\\driver\\chromedriver1.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.fishpond.com.au/");
	}
	
	@When("^User can search \"([^\"]*)\"$")
	public void user_can_search(String s1) throws InterruptedException  {
	    driver.findElement(By.id("searchbar")).sendKeys(s1);
	    driver.findElement(By.xpath("//span[@class='search__button-icon flat-icon']")).click();
	    Thread.sleep(3000);
	    System.out.println(s1);
	}

	@When("^User can view list of items$")
	public void user_can_view_list_of_items()  {
	    List<WebElement> Itemlist = driver.findElements(By.xpath("//a[@class='item-block__title-link']"));
	    for (WebElement x : Itemlist) {
			System.out.println(x.getText());
		}
	}

	@Then("^Items confirmed$")
	public void items_confirmed()  {
	    System.out.println("Success");
	    driver.quit();
	}

}
