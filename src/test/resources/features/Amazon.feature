
@amazon
Scenario Outline: amazonda urun sepete ekleme
When "<urunAdi>" icin Arama yapar
Then sonuclarin "<urunAdi>" icerdigini dogrular
And kullanici ilk urune tiklar
And kullanici urunun adetini 2 yapar
And kullanici urunu sepete ekler
Then kullanici urunun sepete eklendigini dogrular
And kullanici sepete gider
      #Then kullanici urunun adinin sepetteki ile ayni oldugunu dogrular
Then kullanici urunun adetinin 2 oldugunu dogrular
Examples:
| urunAdi |
| watch        |
| Man Hats |
| Woman Hats |
