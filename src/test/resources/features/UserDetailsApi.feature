@Regression
Feature: Get User Details API Validations

  Scenario: Get user api provides the specific user details
    Given Endpoint is setup with auth token
    When User hit the endpoint
    Then Response code should be 200
    And Response body should have below data
    |UserId|
    |7     |