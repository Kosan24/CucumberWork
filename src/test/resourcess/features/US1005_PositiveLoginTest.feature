@hotel
Feature: US1005 Positive login Test

  Scenario: TC08 Positive login

    Given l'utilisateur va sur la page "HMCUrl"
    And cliquez sur le lien de login
    Then Entrez "ValidUsername" comme nom d'utilisateur
    And Entrez "ValidPassword" comme mot de passe
    And Appuie sur le bouton Login
    Then Teste la connexion réussie
    #And fermePage