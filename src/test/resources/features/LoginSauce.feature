Feature: Login Sauce

  Background:
    Given Abrir pagina sauce
    When Ingreso de datos para login: usename "standard_user" y password "secret_sauce"
    Then Se valida el login exitosamente

  Scenario: Validacion carrito de compras
    Given El usuario encuentra un producto
    When Agrega al carrito el producto
    Then Remueve el producto del carrito
    And Valida que no se visualice el producto en el carrito
