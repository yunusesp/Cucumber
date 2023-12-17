Feature: enable element verification

  @DemoQa
  Scenario: willEnable
    Given kulanici demoqa.com sitesinesine gider
    Then kullanici Ana sayfanın Başarıyla yuklendigini doğrular
    Then Kullanici Will enable bes seconds' dugmesinin disable oldugunu dogrular
    And kullanici 5 saniye bekleme ekler
    Then kullanici Will enable bes seconds' dugmesinin enable oldugunu dogrular


  @books
  Scenario: kitap listesi
    Given kullanici "book_List" sitesini acar
    Then kullanici books page girdigini "Book Store" Dogrular
    When kullanici kitaplarin yazar isimlerini bir liste atar
    Then kullaini yazarlarin asagidaki listedekiler oldugunu dogrular
      | Richard E. Silverman |
      | Addy Osmani          |
      | Glenn Block et al.   |
      | Axel Rauschmayer     |
      | Kyle Simpson         |
      | Eric Elliott         |
      | Marijn Haverbeke     |
      | Nicholas C. Zakas    |





