
@tag5
Feature: To verify booking functionality

Background:
Given  User has to be in home page
  @tag12
  Scenario:  User has to book the hotel
   Given User has to be in search the hotel page
    When User has to enter the itinerary details 
    And click a search button 
    And user has to select the hotel 
    Then user has to book the hotel
    Then user gets the booking ID 

@tag2 
 Scenario:  User has to view the booking
   Given User has to be in booking itinerary page 
    When User has to fetch the booked orders
    And user has to select the last booking 
    Then gets the cancellation acknowledgement 