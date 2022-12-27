@parametreTest
Feature: US1003 Creating a step definition with a parameter

  Scenario: TC05_utiliser parametre

    Given l'utilisateur va sur la page amazon.
    And recherche "iPhone"
    Then les tests dont les résultats incluent "iPhone"
    And fermePage