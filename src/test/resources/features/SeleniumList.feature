Feature: Selenium List

  @seleniumList
  Scenario: dropdown list
    Given kullanici "seleniumUrl" sitesine gider
    Then  kullanici selenium sayfasina giris yatigini dogrular
    When  kullanici About dugmesine tiklar
    Then  kullanici About dropdown listesini asagidakilerle dogrular
      | About Selenium           |
      | Structure and Governance |
      | Events                   |
      | Ecosystem                |
      | History                  |
      | Get Involved             |
      | Sponsors                 |


  @selenium2
  Scenario: about selenium ayni sira liste halinde
    Given kullanici "seleniumUrl" sitesine gider
    Then kullanici selenium sayfasina giris yaptigini "About" yazisi ile dogrular.
    When kullanici About dugmesine tiklar
    Then kullanici About dropdown listesini asagidakilerle dogrular
      | About Selenium | Structure and Governance | Events | Ecosystem | History | Get Involved | Sponsors |
    And kullanici 3 saniye bekler