
@tag
Feature: To validate the list of items  

  @tag1
  Scenario Outline: To verify User can search product and view list of products
    Given user can access fishpond site
    When User can search "<product>"
    And User can view list of items 
    Then Items confirmed 

    Examples: 
      |product| 
      |Samsung galaxy|   
      |i phone6|
      |ear phone|
      |charger|
      |Dell laptop|
      |Mouse|
      |Keyboard|
      |Sports shoe|
      |Travel bag|
 
