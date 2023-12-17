Feature: map data
  @textbox
  Scenario: Map ile veri alma
    Given kullanici "demoqatext_box" sitesini acar
    Then kullanici text-box sayfasina girdigini dogrular
    And kullanici bosluklari asagidaki bilgilerle doldurur
      | Name               | Master Branch         |
      | Email              | masterbranch@mail.com |
      | Current Address    | Master                |
      | Permananet Address | Branch Academy        |
    Then kullanici basarili bir sekilde submit ettigini dogrular
      | Name:Master Branch                 |
      | Email:masterbranch@mail.com        |
      | Current Address :Master            |
      | Permananet Address :Branch Academy |











