Feature: US1009 Amazon Belgique search

  @AmazonBelgique
  Scenario: TC08 Amazon Belgique search test
    Given l'utilisateur va sur la page AmazonBelgiqueUrl.
    And recherche Samsung S20
    Then les test dont les resultat Samsung S20
    Then fermePage

    Given l'utilisateur va sur la page AmazonBelgiqueUrl.
    And recherche iphone 14 promax
    Then les test dont les resultat iphone 14 promax

    Given l'utilisateur va sur la page AmazonBelgiqueUrl.
    And recherche Machine et Cafe
    Then les test dont les resultat Machibe et Cafe
