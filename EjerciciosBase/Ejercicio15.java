/*

Imprimir numeros impares
que existan en un rango.
Ingresar el menor y mayor 
valor del rango.

*/

import java.util.Scanner;

public class Ejercicio15
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);

		System.out.print("Menor: ");
		int menor = tec.nextInt();
		System.out.print("MAYOR: ");
		int mayor = tec.nextInt();

		/*
		//Forma 1: While
		int n = menor;
		while(n<=mayor)
		{
			if(n%2!=0)
			{
				//Impares
				System.out.println(n);	
			}
			n = n+1;
		}
		*/

		/*
		//Forma 2: Do While
		int n = menor;
		do
		{
			if(n%2!=0)
			{
				//Impares
				System.out.println(n);	
			}
			n = n+1;
		}
		while(n<=mayor);
		*/


		//Forma 3: For
		for(int n = menor;n<=mayor;n=n+1)
		{
			if(n%2!=0)
			{
				//Impares
				System.out.println(n);	
			}
		}
	}

}