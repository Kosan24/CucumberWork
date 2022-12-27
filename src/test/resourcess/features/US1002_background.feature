@paralel2

Feature: US1002 Amazon search test with background

  Background: aller sur la page amazon
    Given l'utilisateur va sur la page amazon.

    @
  Scenario: TC02_Amazon iPhone Search Test

    And recherche iPhone
    Then les tests dont les résultats incluent l'iPhone

      @wip
  Scenario: TC03_Amazon tea pot Search Test
    And recherche tea pot
    Then les tests dont les résultats incluent tea pot

  Scenario: TC04_Amazon flower Search Test
    And recherche flower
    Then les tests dont les résultats incluent flower