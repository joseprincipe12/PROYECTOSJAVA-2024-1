/*
A partir del ingreso de 2 numeros
y el tipo de operacion (+ - x /)
realizar el calculo que corresponda
segun la operacion ingresada.
Ejm:
______________
N1 = 12
N2 = 3
Operacion = +
______________
Resultado = 15

*/

import java.util.Scanner;

public class Ejercicio08
{
	public static void main(String[] args) 
	{
		//Declarar e instanciar
		Scanner tec = new Scanner(System.in);
		//Declarar las variables
		double n1, n2, resultado;
		char operador;
		//Leer los valores
		System.out.print("N1 :");
		n1 = tec.nextDouble();
		System.out.print("N2 :");
		n2 = tec.nextDouble();
		System.out.print("Operacion :");
		operador = tec.next().charAt(0);
		//Operaciones
		if(operador=='+')
		{
			resultado = n1+n2;
		}else if(operador=='-')
		{
			resultado = n1-n2;
		}else if(operador=='x')
		{
			resultado = n1*n2;
		}else if(operador=='/')
		{
			resultado = n1/n2;
		}else{
			resultado = 0;
		}
		//Mostrar resultados
		System.out.println("Resultado :"+resultado);
	}	
}