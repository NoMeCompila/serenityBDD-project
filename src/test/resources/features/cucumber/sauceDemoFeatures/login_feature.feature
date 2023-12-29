Feature: Login to SauceDemo

  @sauceDemo
  Scenario Outline: Ingresar correctamente al sistema
    Given dado que ingreso a la web de sauce demo
    When ingreso usuario <user> contrasenia <pass> y presiono el boton login
    Then verifico el titulo de la web
    Examples:
      | user                     | pass         |
      | standard_user            | secret_sauce |
      | problem_user             | secret_sauce |
      | performance_glitch_user  | secret_sauce |
      | error_user               | secret_sauce |