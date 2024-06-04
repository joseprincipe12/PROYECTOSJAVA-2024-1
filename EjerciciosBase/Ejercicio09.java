/*
Un maestro constructor cobra por cada metro lineal
de pared que construye.
El precio de cada metro depende de la altura de la pared:
- Para paredes de hasta 1.5 metros de altura el precio es S/. 15.00
- Para paredes de hasta 2.0 metros de altura el precio es S/. 20.00
- Para paredes que superen los 2.0 metros de altura el precio es S/. 20.00
 + S/. 1.00 por cada centimetro adicional.
Crear un programa que a partir del ingreso de la altura de la pared y el largo, calcule el total a pagar.
Utilizar metros como unidad de medida.
*/

import java.util.Scanner;
public class Ejercicio09
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		double altura, largo, precio, precioAdicional, total;

		System.out.print("Altura (m): ");
		altura = tec.nextDouble();

		System.out.print("Largo (m): ");
		largo = tec.nextDouble();

		//Definir el precio a cobrar
		if((altura>=0.0)&&(altura<=1.5))
		{
			precio = 15.0;
			precioAdicional = 0.0;
		}
		else if((altura>1.5)&&(altura<=2.0))
		{
			precio = 20.0;
			precioAdicional = 0.0;
		}
		else if(altura>2.0)
		{
			precio = 20.0;
			double canCentimetro = (altura - 2.0)*100.0;
			precioAdicional = 1.0*canCentimetro;
			
		}else{
			//Valores en caso no cumpla niguna condicion
			precio = 0.0;
			precioAdicional = 0.0;
		}

		//Calcular el total
		total = (precio + precioAdicional) * largo;

		//Redondear en JAVA
		//Artificio paso a paso:
		total = total * 100;
		total = Math.round(total); //Redondear a Entero
		total = total / 100;

		//Redondear precios:
		precio = Math.round(precio*100)/100;
		precioAdicional = Math.round(precioAdicional*100)/100;

		//Mostrar el resultado
		System.out.println("Precio x Metro S/. = " + precio);
		System.out.println("Precio Adicional S/. = " + precioAdicional);
		System.out.println("Total S/. = " + total);
	}
}