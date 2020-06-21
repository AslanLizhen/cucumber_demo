@setenv @clearTestDataStorageHelper
Feature:

  Scenario Outline: Search in baidu.feature
    Given user go to bai du page
    And user input <keyword>
#    Then user can find search result

    Examples:
      |keyword|
      |jmeter |