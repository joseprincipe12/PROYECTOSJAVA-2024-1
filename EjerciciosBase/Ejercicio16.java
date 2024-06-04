/*
A partir del ingreso del menor numero 
de una serie y la cantidad de elementos
Imprimir los numeros pares
y la suma de los impares.
*/

import java.util.Scanner;

public class Ejercicio16
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		System.out.print("Menor: ");
		int menor = tec.nextInt();
		System.out.print("Cantidad: ");
		int cantidad = tec.nextInt();

		/*
		//Forma 1: While
		int numero = menor;
		int i = 1;
		int sumaImpar = 0; //Acumulador
		while(i<=cantidad)
		{
			if(numero%2==0)
			{
				System.out.println(numero);	
			}else{
				sumaImpar=sumaImpar+numero;
			}
			
			numero=numero+1;
			i=i+1;
		}
		*/
		//Forma 2: For
		int numero = menor;
		int sumaImpar = 0; //Acumulador
		for(int i=1;i<=cantidad;i=i+1)
		{
			if(numero%2==0)
			{
				System.out.println(numero);	
			}else{
				sumaImpar=sumaImpar+numero;
			}
			
			numero=numero+1;
		}
		System.out.println("Suma IMPARES = " + sumaImpar);
	}
}