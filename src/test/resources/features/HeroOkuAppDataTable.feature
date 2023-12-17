Feature: Data Table
  @table
  Scenario: tablotu datatable class ile alma
    Given kullanici "hero_oku_app" sitesini acar
    Then kullanici "Data Tables " sayfasina girdigini dogrular
    Then kullanici tablodaki verileri asagidakilerle dogrular
      | Last Name | First Name | Email                 | Due     | Web Site                 | Action      |
      | Bach      | Frank      | fbach@yahoo.com       | $51.00  | http://www.frank.com     | edit delete |
      | Conway    | Tim        | tconway@earthlink.net | $50.00  | http://www.timconway.com | edit delete |
      | Doe       | Jason      | jdoe@hotmail.com      | $100.00 | http://www.jdoe.com      | edit delete |
      | Smith     | John       | jsmith@gmail.com      | $50.00  | http://www.jsmith.com    | edit delete |