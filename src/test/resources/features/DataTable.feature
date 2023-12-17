Feature: New User Register into Data Table

  @newuser
  Scenario: new add
    Given kullanici "https://editor.datatables.net/" URL'sine gider
    When kullanici new user button nina tiklar
    And kullanici firstname input boxa "Davud" verisini girer
    And kullanici lasttname input boxa "Kerim" verisini girer
    And kullanici position input boxa "QA Tester" verisini girer
    And kullanici office input boxa "Sevilla office" verisini girer
    And kullanici extension input boxa "MD" verisini girer
    And kullanici start date input boxa "2023-09-27" verisini girer
    And kullanici salary input boxa "120000" verisini girer
    And kullanici 3 saniye bekler
    And kullanici create button nina tiklar
    And kullanici searchbox a "Davud" verisini girer
    And kullanici 5 saniye bekler
    Then kullanici kayidin saglikli bir sekilde yapildigini "Davud" ile dogrular