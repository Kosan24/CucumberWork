@calisma
Feature:Register_User_Functionality

  @register
  Scenario: Register page(kayit sayfasi)
    Given l'utilisateur va sur la page automation_url.
    And ana sayfanin gorunur oldugunu test eder
    Then kullanici signup-login butonuna tiklar
    And kullanici New user Signup! in gorunur oldugunu test eder


  Scenario: SignUp user (ilk kayit)
    Given kullanici olarak isim ve maili girer
    And  signup butonuna tiklar
    Then acilan sayfada ENTER ACCOUNT INFORMATION yazisinn gorunur oldugunu test eder
    Then kullanici ayrintilari (birinci bolum) doldurur
    Then kullanici Sign up for our newsletter! checkbox ini secer
    Then kullanici Receive special offers from our partners! checkbox ini secer
    Then kullanici ayrintilari (ikinci bolum) doldurur
    Then kullanici Create Account butonuna tiklar
    Then kullanici hesabin olustugunu dogrular