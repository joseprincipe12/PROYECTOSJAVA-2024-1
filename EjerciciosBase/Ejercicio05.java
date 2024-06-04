/*
Una tienda se dedica a vender 
unicamente dos articulos:
- Lapiceros
- Cuadernos
Los cuadernos cuestan S/. 4.00
Los lapiceros cuestan S/. 0.75

Crear una aplicacion que permita calcular el
total a pagar por la compra de cierta cantidad
de articulos.

*/
//Importar la clase Scanner del paquete java.util
import java.util.Scanner;

public class Ejercicio05
{
	public static void main(String[] args) 
	{
		//Declarar / Instanciar el objeto de la clase Scanner
		Scanner objTec =  new Scanner(System.in);
		//Declarar / asignar valor precios
		double precioCuaderno = 4.0;
		double precioLapicero = 0.75;

		//Leer la cantidad de cada articulo
		System.out.print("Cantidad Cuaderno: ");
		int canCuaderno = objTec.nextInt();
		System.out.print("Cantidad Lapicero: ");
		int canLapicero = objTec.nextInt();

		//Calculos
		double totalCuaderno = precioCuaderno*canCuaderno;
		double totalLapicero = precioLapicero*canLapicero;
		double total = totalCuaderno+totalLapicero;

		//Mostrar resultados
		System.out.println("Total Cuaderno S/."+totalCuaderno);
		System.out.println("Total Lapicero S/."+totalLapicero);
		System.out.println("Total S/."+total);


	}
}