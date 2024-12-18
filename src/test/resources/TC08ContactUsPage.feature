@regressionnew @contactus
Feature: Contact us page scenarios

  Scenario: Users are required to log in to the SOL website.
    Given I enter username as "surya.uat@yopmail.com"
    And I enter password as "Test@12345"
    Then I login
    Then I am on homepage
    
  @updateshippingaddress
  Scenario Outline: Query can be submited from Contact Us page
   
    Given I click on contact us tab
    Then I am on contactus page
    And I select the query type "<querytype>"
    And I fill the form and submit
    Then I validate success message
    And I logout
    

    Examples: 
      | querytype   |
      | Sales Query |
