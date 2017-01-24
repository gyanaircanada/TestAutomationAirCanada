Feature: The facebook smoke scenario

  Scenario Outline: Test login with valid credentials
    Given Open firefox and start application
    When I enter valid "<username>" and "<password>"
    Then User is able to login successfully
    Then Application should be closed
    Examples: 
      | username           | password  |
      | 0004gyan@gmail.com | !Support1 |
      | 0004gyan@gmail.com | !Support1 |
      
