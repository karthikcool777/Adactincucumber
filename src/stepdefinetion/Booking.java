package stepdefinetion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.base.Baseclass;
import com.pojo.LoginPojo;
import com.pojo.SearchhotelPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Booking extends Baseclass{

@Given("^User has to be in home page$")

public void user_has_to_be_in_home_page() throws InterruptedException {

	LoginPojo p = new LoginPojo();
    txtEntry(p.getUsername(), "karthikeyanklickz7");
    txtEntry(p.getPassword(), "7200470018");
    buttonclick(p.getLogin());
    	Thread.sleep(2000);

}

@Given("^User has to be in search the hotel page$")

public void user_has_to_be_in_search_the_hotel_page() {
  SearchhotelPojo sp = new SearchhotelPojo();
	buttonclick(sp.getSearchhoteltab());
}

@When("^User has to enter the itinerary details$")
public void user_has_to_enter_the_itinerary_details() throws InterruptedException  {
	
	  Thread.sleep(3000);
	  SearchhotelPojo sp = new SearchhotelPojo();
      dropdown(sp.getLocation(), "Melbourne");  
      dropdown(sp.getHotels(), "Hotel Sunshine");
      dropdown(sp.getRoomtype(), "Standard");
      dropdown(sp.getRoom_nos(), "2 - Two");
      dropdown(sp.getAdult_room(), "2 - Two");      
}

@When("^click a search button$")
public void click_a_search_button()  {
	 SearchhotelPojo sp = new SearchhotelPojo();
	 buttonclick(sp.getSubmit());
}

@When("^user has to select the hotel$")
public void user_has_to_select_the_hotel() throws InterruptedException  {
	Thread.sleep(2000);
	SearchhotelPojo sp = new SearchhotelPojo();
	buttonclick(sp.getRadiobutton_0());
	buttonclick(sp.getContinuebtn());
}

@Then("^user has to book the hotel$")
public void user_has_to_book_the_hotel() {
	 driver.findElement(By.id("first_name")).sendKeys("karthik");
	 driver.findElement(By.id("last_name")).sendKeys("m");
	 driver.findElement(By.id("address")).sendKeys("coimbatre");
	 driver.findElement(By.id("cc_num")).sendKeys("99853215667482331");
	 driver.findElement(By.id("cc_cvv")).sendKeys("001");
	 
	 WebElement cc_type = driver.findElement(By.id("cc_type"));
		s = new Select(cc_type);
		s.selectByVisibleText("VISA");
		
		WebElement cc_exp_year = driver.findElement(By.id("cc_exp_year"));
		s = new Select(cc_exp_year);
		s.selectByVisibleText("2022");
		
		WebElement cc_exp_month = driver.findElement(By.id("cc_exp_month"));
		s = new Select(cc_exp_month);
		s.selectByVisibleText("April");
		
		 driver.findElement(By.id("book_now")).click();
}

@Then("^user gets the booking ID$")
public void user_gets_the_booking_ID()  throws InterruptedException {
	Thread.sleep(7000);
	WebElement orderno = driver.findElement(By.xpath("//input[@id='order_no']"));
	getAttribute(orderno, "value");
}


}
