Feature: Login to SauceDemo

  Scenario: Ingresar correctamente al sistema
    Given dado que ingreso a la web de sauce demo
    When ingreso las credenciales y presiono el boton login
    Then verifico el titulo de la web