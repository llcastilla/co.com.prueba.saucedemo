Feature: login standard user
  yo como usuario
  necesito ingrsar a la pagina web de compras
  para visualizar los productos de la pagina


  Scenario: loguearse de forma exitosa
    Given el usuario desea ingresar a la pagina web para comprar algunos productos de la pagina
    When el usuario ingresa con el username "standard_user" and password "secret_sauce"
    Then usuario ingresa a la pagina de forma exitosa "https://www.saucedemo.com/inventory.html"





