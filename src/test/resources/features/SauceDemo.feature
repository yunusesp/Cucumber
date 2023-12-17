Feature: Sauce Demo login Test

  @sauce
  Scenario: dropdown test
    Given kullanici "https://www.saucedemo.com/" URL'sine gider
    When kullanici "standard_user" ve "secret_sauce" girerek siteye giris yapar
    Then kullanici ana sayfanın başarıyla göründüğünü "Products" yazisi ile doğrular
    Then kullanici "Name (A to Z)" secili oldugunu dogrular
    And kullanici "Price (high to low)" option ni secer
    Then kullanici "Price (high to low)" secili oldugunu dogrular
    And kullanici 5 saniye bekler