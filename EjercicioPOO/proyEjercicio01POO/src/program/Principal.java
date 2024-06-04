package program;

import java.util.Scanner;

public class Principal 
{
    //Metodo Principal
    public static void main(String[] args) 
    {
        System.out.println("Esta es la clase Principal");
        //Instanciar la Clase: Scanner
        //Crear un objeto de la clase Scanner
        Scanner objTeclado = new Scanner(System.in);
        
        //Instanciar la Clase: Venta
        //Crear un objeto de la clase: Venta
        Venta objVenta = new Venta();
        
        //Leer los datos y asignarlos a las propiedades
        System.out.print("Precio S/. :");
        objVenta.precio = objTeclado.nextDouble();
        System.out.print("Cantidad :");
        objVenta.cantidad = objTeclado.nextInt();
        
        //Ejecutar el metodo del objeto: objVenta
        objVenta.mostrarResultados();
        
        System.out.println("==================");
        
        //Recogiendo el valor retornado
        double total = objVenta.calcularTotal();
        double igv = objVenta.calcularIgv();
        double totalIgv = objVenta.calcularTotalIgv();
        
        //Mostrar el valor
        System.out.println(">> Total S/. " + total);
        System.out.println(">> IGV S/. " + igv);
        System.out.println(">> Total IGV S/. " + totalIgv);
        
   }
            
}
