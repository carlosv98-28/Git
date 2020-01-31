Feature: Realizar una compra
  como usurio quiero realizar una compra.

#  Scenario: El usuario no tiene una cuenta para ingresar a la pagina
#    Given El usurio se encuentra en la pagina home new
#    When Se dirige a sign in
#    And Luego se dirige a Create an account
#    And ingresa los datos de registro
#    Then Se verifica que se registro correctamente
#
#  Scenario: El usurio tiene una cuenta para el ingreso a la pagina
#    Given El usurio se encuentra en la pagina home
#    When Se dirige a sign in new
#    And Ingresa los datos de la cuenta
#    Then Se verifica que se ingreso correctamente

  Scenario: El usuario quiere realizar una compra
      Given El usurio se encuentra en la pagina home
      When Se dirige a sign in new
      And Ingresa los datos de la cuenta
      And El usuario esta logueado y se encuentra en my account se dirige a home
      And Se dirige a la categoria women
      And Selecciona el producto a comprar
      And Selecciona la cantidad
      And selecciona el tamaño del producto
      And Seleciona Comprar
      And selecciona metodo de pago
      And confirma la compra
      Then se verifica la compra correcta
      And Se dirige a mis compras
      And Se descarga comprobante de compra
