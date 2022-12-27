Feature: Trendyol Invalide Testi

  @Trendyol
  Scenario: Invalid e-mail ile giris yapilamaz
    Given l'utilisateur va sur la page "TrendyolUrl".
    And user sign in linkine tiklar
    And email kutusuna @isareti olmayan email adresi yazar ve enter'a tiklar
    Then error mesajinin “Invalid email address” oldugunu dogrulayin
