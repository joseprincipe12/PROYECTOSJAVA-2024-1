/*
Una tienda se dedica a vender unicamente dos articulos:
- Lapiceros - Cuadernos
Los cuadernos cuestan S/. 4.00
Los lapiceros cuestan S/. 0.75

Crear una aplicacion que permita calcular el
total a pagar por la compra de cierta cantidad
de articulos.
*/
package program;

import views.FrmVenta;

public class Principal 
{
    public static void main(String[] args) 
    {
        //Instanciar la clase FrmVenta
        FrmVenta ventana = new FrmVenta();
        //Modificar la ubicacion de la ventana para centrarlo
        ventana.setLocationRelativeTo(null);
        //Mostrar el objeto ventana
        ventana.setVisible(true);
    }
}
