@regressionnew @regressionaddproducts
Feature: Shop the Industry products from the homepage and complete the checkout

  Scenario: Users are required to log in to the SOL website in order to access the dashboard module and review the order status on the dashboard page.
    When I enter username as "gurpreet.singh22@yopmail.com"
    And I enter password as "Test@123456789"
    Then I login
    Then I am on homepage

  @addindustryproduct
  Scenario Outline: Shop the Industry products from the homepage and validate product added in the cart
    Given I am on Homepage
    When I select the product category "<category name>"
    And I select the price filter from "<range1>" to "<range2>"
    And I add the product to the cart
    And I open the wishlist
    Then I validate the product added in the cart
    And I click checkout
    And I contiue with billing and shipping information
    And I add preffered date and time "9AM-12PM"
    And I validate product in the checkout page
    And I click sol logo
    And I open the wishlist
    And I remove the product from the cart and close the cart

    Examples: 
      | category name | range1 | range2 |
      | Industry      |    100 | 199.99 |

  @addroadtransportproduct
  Scenario Outline: Shop the Road transport products from the homepage and validate product added in the cart
    Given I am on Homepage
    When I select the product category "<category name>"
    And I select the price filter from "<range1>" to "<range2>"
    And I add the product to the cart
    And I open the wishlist
    Then I validate the product added in the cart
    And I click checkout
    And I contiue with billing and shipping information
    And I add preffered date and time "9AM-12PM"
    And I validate product in the checkout page
    And I click sol logo
    And I open the wishlist
    And I remove the product from the cart and close the cart
    And I logout
    
    Examples: 
      | category name  | range1 | range2 |
      | Road Transport |    100 | 199.99 |

 