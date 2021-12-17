Feature: Search functionality
  @Smoke
  Scenario Outline: Search the buy car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click ‘Search Cars’ link
    Then I navigate to "New & Used Car Search - carsguide" page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results
  Examples:
  |make|model|location|price|
  |Honda|CR-V     | SA - South East   | $30,000  |
  |Honda|Jazz     | NSW - New England | $40,000  |
  |Audi |A1       |NSW - Central Coast |$50,000 |
  |Holden|Caprice |  NSW - New England |$60,000 |
  |Jeep |Compass  |NSW - Central West |$40,000  |
  |Kia |Niro      |NSW - New England  |$40,000 |
 @Sanity
  Scenario Outline: Search the used car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click 'Used' link
    Then I navigate to "Used Cars For Sale" page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results
    Examples:
      |make|model|location|price|
      |Honda      |CR-V       |NSW - Newcastle    |$60,000|
      |Mazda      |B2500      |NSW - Sydney       |$40,000|
      |Land Rover |Any Model  |Any Location       |$60,000|
      |Land Rover |Range Rover|NSW - South Coast  |$50,000|
      |Nissan     |C20        |NSW - Sydney       |$40,000|
      |Hyundai    |Getz       |NSW - New England  |$15,000|
