package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class SearchhotelPojo extends Baseclass{

	public SearchhotelPojo() {
	PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//a[text()='Search Hotel']")
	private WebElement Searchhoteltab;
	
	@FindBy(id="location")
	private WebElement location;

	@FindBy(id="hotels")
	private WebElement hotels;

	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement room_nos;

	@FindBy(id="adult_room")
	private WebElement adult_room;
	
	@FindBy(id="Submit")
	private WebElement Submit;

	@FindBy(id="radiobutton_0")
	private WebElement radiobutton_0;
	
	@FindBy(id="continue")
	private WebElement continuebtn;
	
	

	public WebElement getSearchhoteltab() {
		return Searchhoteltab;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoom_nos() {
		return room_nos;
	}

	public WebElement getAdult_room() {
		return adult_room;
	}

	public WebElement getSubmit() {
		return Submit;
	}

	public WebElement getRadiobutton_0() {
		return radiobutton_0;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}
	


	
	
}
