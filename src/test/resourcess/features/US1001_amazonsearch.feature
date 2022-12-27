Feature: US1001_amazon_search


  @paralel1
  Scenario: TC01_Amazon Search Test

    # Gherkin ile yazma sekli

    Given l'utilisateur va sur la page amazon.
    And recherche iPhone
    Then les tests dont les résultats incluent l'iPhone

    Given l'utilisateur va sur la page amazon.
    And recherche tea pot
    Then les tests dont les résultats incluent tea pot

    Given l'utilisateur va sur la page amazon.
    And recherche flower
    Then les tests dont les résultats incluent flower