Feature: Comprar productos en la pagina
  yo como usuario
  necesito ingrsar a la pagina web de compras
  para visualizar los productos de la pagina
   pagina para luego comprarlos


  Scenario: Cotizar compras Ingresando usuario standard_user
    Given el usuario desea comprar algunos productos
    And   ingresando con el username "standard_user" and password "secret_sauce"
    When  El usuario agrega los producto al carrito de compras
    And   procede a realizar el pago
    And   Ingresa los datos personales nombre "leonardo" apellido "castilla" codigo postal "200005"
    Then  Sistema procesa la informacion y envia mensaje


