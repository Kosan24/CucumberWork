@WebU
Feature: US1007 WebUniversity Window Handle

  Scenario Outline: TC07 Reusable Methods ile window Handle Testi

    Given kullanici "WebUniversityUrl" sayfasina gider
    And Login portala kadar asagi iner
    And Login portal'a tiklar
    Then Acilan diger windowa gecer
    And "<username>" ve "<password>" kutularina deger yazdirin
    And WebUniversity Login butonuna basar
    And 2 saniye bekler
    And Popup'ta cikan yazinin"validation failed"oldugunu test eder
    Then Ok diyerek Popup'i kapatir
    And Ilk sayfaya geri doner
    And Ilk sayfaya donuldugunu test eder

    Examples:

      | username | password |
      |ahmet     |kosan     |


