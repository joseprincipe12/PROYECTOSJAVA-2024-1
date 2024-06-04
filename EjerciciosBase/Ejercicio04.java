/*
A partir del ingreso del precio de un producto
y la cantidad de venta, calcular el total
el IGV y el Total a Pagar incluido IGV.
Ejem:
________________________
Precio S/. : 27.00
Cantidad : 3
Total S/. : 81.00
IGV S/. : 14.58
Total IGV S/. : 95.58
________________________
*/

//Importar la clase Scanner del paquete java.util
import java.util.Scanner;

//Declarar la clase
public class Ejercicio04
{
	//Declarar el metodo principal
	public static void main(String[] args)
	{
		//Declarar el objeto de la clase Scanner
		Scanner objTec;
		//Instanciar el objeto de la clase Scanner
		objTec =  new Scanner(System.in);
		//Declarar la variable precio
		double precio;
		int cantidad;

		//Mostrar etiqueta
		System.out.print("Precio S/. :");
		//Leer los datos de entrada
		precio = objTec.nextDouble();

		//Mostrar etiqueta
		System.out.print("Cantidad :");
		//Leer los datos de entrada
		cantidad = objTec.nextInt();

		//Calculos
		//Declarando la variable y asignando valor
		double total = precio*cantidad;
		double igv = 0.18*total;
		double totalIgv = total + igv;

		//Mostrar resultado
		System.out.println("Total S/.:" + total);
		System.out.println("IGV S/.:" + igv);
		System.out.println("Total IGV S/.:" + totalIgv);



	}
}