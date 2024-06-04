/*

A partir le ingreso un NUMERO
calcular su factorial.

5! = 1x2x3x4x5 = 120

*/

import java.util.Scanner;

public class Ejercicio18
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);

		System.out.print("Numero: ");
		int numero = tec.nextInt();

		/*
		//Forma 1:
		int n = 1; //Contador (1,2,3 ... )
		int factorial=1; //Acumulador (1x2x3 ...)
		while(n<=numero)
		{
			factorial = factorial * n;
			n = n+1;
		}
		*/

		/*
		//Forma 2:
		int factorial=1; //Acumulador (1x2x3 ...)
		for(int n = 1;n<=numero;n=n+1)
		{
			factorial = factorial * n;
		}
		*/


		//Forma 3:
		int n = 1; //Contador (1,2,3 ... )
		int factorial=1; //Acumulador (1x2x3 ...)
		
		do
		{
			if(numero==0)
			{
				factorial=0;
				break;
			}
			factorial = factorial * n;
			n = n+1;
		}
		while(n<=numero);

		System.out.println("Factorial : " + factorial);

	}
}