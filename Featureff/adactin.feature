@Regression

Feature: To verify booking functionality 

Background: 
Given: User has to be in home page


  Scenario: User has to book a hotel 
    Given User has to be in search hotel page
    When User has to enter itinerary details 
    And click search button 
    And user has to select a hotel 
    Then user has to book a hotel
    Then user gets a booking ID 

 
  Scenario: User has to cancel the hotel
    Given User has to be cancellation page 
    When User has to cancel the booking 
    Then User gets the acknowledgement 

   