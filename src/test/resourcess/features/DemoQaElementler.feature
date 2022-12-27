Feature: Dinamik Elemanlar

  @Dinamik
  Scenario: Dinamik elementler tiklanabilmeli

    Given l'utilisateur va sur la page "DemoQaUrl".
    Then Will enable 5 seconds butonunun enable olmasini bekler
    And Will enable 5 seconds butonunun enable oldugunu test eder

