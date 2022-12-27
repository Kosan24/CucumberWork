@Hero
Feature: US1006 Herokuapp sayfasinda add butonu testi

  Scenario: TC06 sonradan gorunen elemanlar calismali

    Given kullanici "HerokuappAddElementUrl" sayfasina gider
    When Add Element butonuna basar
    Then Delete butonu gorununceye kadar bekler
    And Delete butonunun gorunur oldugunu test eder
    Then Delete butonuna basarak butonu siler
    #And fermePage


