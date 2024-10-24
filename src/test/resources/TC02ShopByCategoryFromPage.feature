@regression @regressionaddproducts
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

    Examples: 
      | category name  | range1 | range2 |
      | Road Transport |    100 | 199.99 |

  @addantifreezecoolantproduct
  Scenario Outline: Shop the Anti-Freeze Coolant products from the homepage and validate product added in the cart
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
      | category name       | range1 | range2 |
      | Anti-Freeze Coolant |   1000 |      0 |

  @addbrakeandclutchfluid
  Scenario Outline: Shop the Brake & Clutch Fluid products from the homepage and validate product added in the cart
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
      | category name        | range1 | range2 |
      | Brake & Clutch Fluid |   1000 |      0 |

  @adddieselengineoils
  Scenario Outline: Shop the Diesel Engine Oils products from the homepage and validate product added in the cart
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
      | category name      | range1 | range2 |
      | Diesel Engine Oils |   1000 |      0 |

  @addgasolineengineoils
  Scenario Outline: Shop the Gasoline Engine Oils from the homepage and validate product added in the cart
    products from the homepage and complete the checkout

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
      | category name        | range1 | range2 |
      | Gasoline Engine Oils |   1000 |      0 |


  @addtransmissionproduct
  Scenario Outline: Shop the Transmission products from the homepage and validate product added in the cart
    products from the homepage and complete the checkout

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
      | category name | range1 | range2 |
      | Transmission  |   1000 | 199.99 |