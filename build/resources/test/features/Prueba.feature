Feature: Inicio de sesion en Sauce Labs

  Scenario: Iniciar sesión con credenciales validas
    Given El usuario está en la página de Sauce Labs
    When ingresa usuario "standard_user"
    When ingresa Contraseña "secret_sauce"
    Then Dar click en el boton login
    And validar el inicio


    Scenario: Se realiza la compra del objecto
      Given El usuario confirmo el producto
      When El usario realiza la compra
