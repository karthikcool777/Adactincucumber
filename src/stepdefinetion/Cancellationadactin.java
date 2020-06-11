package stepdefinetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Baseclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cancellationadactin extends Baseclass {
	@Given("^User has to be in booking itinerary page$")
	public void user_has_to_be_in_booking_itinerary_page() {
	    driver.findElement(By.xpath("//a[text()='Booked Itinerary']")).click();
	}

	@When("^User has to fetch the booked orders$")
	public void user_has_to_fetch_the_booked_orders() throws InterruptedException{
		Thread.sleep(5000);
		
		WebElement idna = driver.findElement(By.xpath("//input[@id='btn_id_346095']"));
	System.out.println(idna.getAttribute("value"));
	

		
		WebElement table = driver.findElement(By.xpath("//table[@cellpadding='5']"));
	
	List<WebElement> rows = table.findElements(By.tagName("tr"));
	System.out.println(rows.size());
	for (int i = 0; i < rows.size(); i++) {
		WebElement row = rows.get(i);
		
		List<WebElement> columns = row.findElements(By.tagName("td"));
		System.out.println(columns.size());
		for (int j = 2; j<3; j++) {
			
			WebElement column = columns.get(j);
			String orderId = column.getAttribute("onclick");
			System.out.println(orderId);
		}
		
	}
	}

	@When("^user has to select the last booking$")
	public void user_has_to_select_the_last_booking() {

	}

	@Then("^gets the cancellation acknowledgement$")
	public void gets_the_cancellation_acknowledgement() {
	
	}


}
