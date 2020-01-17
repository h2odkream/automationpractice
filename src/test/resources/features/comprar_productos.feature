#Author: h2otatiana@gmail.com
# language:es
Característica:  Prueba practica.
  Realizar la compra de productos a automation practice

  Esquema del escenario: Comprar los productos
    Dado que karen ingresa a la pagina automation practice
      | usuario   | contrasena   |
      | <usuario> | <contrasena> |
    Cuando agrego los productos al carrito y realizo la compra

    Entonces verificar que compra fue exitosa <mensaje>
    Ejemplos:
      | usuario              | contrasena   |mensaje|
      | h2okaren@hotmail.com | Agualimpia95 |Your order on My Store is complete.|
