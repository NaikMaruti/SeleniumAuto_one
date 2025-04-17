Feature:Sign in feature

  @mrt
  Scenario Outline: To verify the error msg with invalid Credentials
    Given User to navigate to "<url>"
    When User enters credentials "<UserName>" "<Password>"
    And user click on signin
    Then user to validate the error message "<errMsg>"

    Examples:
      | url                                              | UserName | Password | errMsg                           |
      | https://rahulshettyacademy.com/locatorspractice/ | rahul    | hello123 | * Incorrect username or password |


  @mrt
  Scenario Outline: To verify the error msg with valid Credentials
    Given User to navigate to "<url>"
    When User enters credentials "<UserName>" "<Password>"
    And user click on signin
    Then user to validate the error message "<errMsg>"

    Examples:
      | url                                              | UserName | Password | errMsg                           |
      | https://rahulshettyacademy.com/locatorspractice/ | rahul    | hello123 | * Incorrect username or password |
      #| https://rahulshettyacademy.com/locatorspractice/ | rahul    | rahulshettyacademy | * Incorrect username or password |
