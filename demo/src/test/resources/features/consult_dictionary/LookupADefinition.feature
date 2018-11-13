Feature: Lookup a definition
  In order to talk better
  As an English student
  I want to look up word definitions

  Scenario: running assignment 1
   Given the user is on the Automation home page
    When the user looks up for dress key 'Printed evening dress with straight sleeves with black thin waist belt and ruffled linings'
    Then they should see the product 'Printed evening dress with straight sleeves with black thin waist belt and ruffled linings'
    When the user changes the size to 'M'
    Then the user adds product to cart remember order amount and continue shopping
    When the user looks up for dress key 'Sleeveless knee-length chiffon dress. V-neckline with elastic under the bust lining'
    Then they should see the product 'Sleeveless knee-length chiffon dress. V-neckline with elastic under the bust lining'
    Then the user adds product to cart remember order amount and proceed to checkout