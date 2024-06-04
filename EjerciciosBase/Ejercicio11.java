/*
Crear un programar que permita calcular el pago por liquidación
de un trabajador. 
Se debe ingresar el sueldo actual, 
el año que inicio sus labores y el año que concluyo. 
Por cada año de servicio le corresponde una compensación
que es igual a un sueldo. 
La SUNAT realiza un descuento por impuesto a la renta según:
- Si el monto supera los 50 000 se le descuenta el 5%
- Si el monto supera los 100 000 se le descuenta el 10%
- Si el monto supera los 200 000 se le descuenta el 15%
Imprimir el monto total, el descuento y monto a pagar.
*/

import java.util.Scanner;

public class Ejercicio11
{

	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		double sueldoActual;
		int annoInicio, annoFin;
		System.out.print("Sueldo Actual S/.:");
		sueldoActual = tec.nextDouble();
		System.out.print("Inicio:");
		annoInicio = tec.nextInt();
		System.out.print("Fin:");
		annoFin = tec.nextInt();

		int tiempoServicio = (annoFin-annoInicio) + 1;

		double compensacion = tiempoServicio * sueldoActual;

		double descuento;

		if(compensacion>200000){
			descuento = 0.15*compensacion;
		}else if(compensacion>100000){
			descuento = 0.10*compensacion;
		}else if(compensacion>50000){
			descuento = 0.05*compensacion;
		}else{
			descuento = 0.0;
		}

		double montoTotal = compensacion - descuento;

		System.out.println("Compensacion S/. " + compensacion);
		System.out.println("Renta S/. " + descuento);
		System.out.println("Monto Total S/. " + montoTotal);

	}
}
