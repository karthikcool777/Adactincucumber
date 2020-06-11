package stepdefinetion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Adactinbooking {
	static WebDriver driver;
	Select s ;
	
	@Given("^User has to be in search hotel page$")
	public void user_has_to_be_in_search_hotel_page() throws InterruptedException  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Cucumberday1\\driver\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.get("http://adactinhotelapp.com/index.php");
		    driver.findElement(By.id("username")).sendKeys("karthikeyanklickz7");
		    driver.findElement(By.id("password")).sendKeys("7200470018");
		    driver.findElement(By.id("login")).click();
		    Thread.sleep(3000);
	
	}

	@When("^User has to enter itinerary details$")
	public void user_has_to_enter_itinerary_details()  {
		
		WebElement location = driver.findElement(By.id("location"));
		s = new Select(location);
		s.selectByVisibleText("Melbourne");
		
		WebElement hotels = driver.findElement(By.id("hotels"));
		s = new Select(hotels);
		s.selectByValue("Hotel Sunshine");
		
		WebElement roomtype = driver.findElement(By.id("room_type"));
		s = new Select(roomtype);
		s.selectByVisibleText("Standard");
		
		WebElement room_nos = driver.findElement(By.id("room_nos"));
		s = new Select(room_nos);
		s.selectByVisibleText("2 - Two");
		
		WebElement adult_room = driver.findElement(By.id("adult_room"));
		s = new Select(adult_room);
		s.selectByVisibleText("2 - Two");
		
	}

	@When("^click search button$")
	public void click_search_button() throws InterruptedException  {
		  driver.findElement(By.id("Submit")).click();
		  Thread.sleep(2000);
	}

	@When("^user has to select a hotel$")
	public void user_has_to_select_a_hotel()  {
		driver.findElement(By.id("radiobutton_0")).click();
		 driver.findElement(By.id("continue")).click();
	}

	@Then("^user has to book a hotel$")
	public void user_has_to_book_a_hotel(){
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

	@Then("^user gets a booking ID$")
	public void user_gets_a_booking_ID() throws InterruptedException {
		Thread.sleep(7000);
		WebElement orderno = driver.findElement(By.xpath("//input[@id='order_no']"));
		String order = orderno.getAttribute("value");
		System.out.println(order);
	}
	
	
	
	
	
	
	
	
	@Given("^User has to be cancellation page$")
	public void user_has_to_be_cancellation_page()  {
	   System.out.println("--");
	}

	@When("^User has to cancel the booking$")
	public void user_has_to_cancel_the_booking(){
	    
	}

	@Then("^User gets the acknowledgement$")
	public void user_gets_the_acknowledgement(){
	    
	}
}
