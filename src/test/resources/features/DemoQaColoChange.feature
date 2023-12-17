Feature: Color Change

  @redcolor
  Scenario: red color
    Given kulanici demoqa.com sitesinesine gider
    Then kullanici Ana sayfanın Başarıyla yuklendigini doğrular
    Then kullanici Color Change dugmesinin class attribute de text-danger olmadigini dogrulayin
    And kullanici 5 saniye bekleme ekler
    Then kullanici Color Change dugmesinin class attribute de text-danger oldugunu dogrulayin