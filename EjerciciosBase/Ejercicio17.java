/*
A partir del ingreso de varias notas
calcular el promedio.
El ingreso de notas se detiene 
cuando se digite -1.
*/

import java.util.Scanner;

public class Ejercicio17
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);

		int i=0;
		double suma=0.0;

		/*
		//Forma 1: While
		double nota=0.0;
		while(nota!=-1)
		{
			System.out.print("Nota "+(i+1)+":");	
			nota = tec.nextDouble();
			//Validando la nota
			if(nota>=0&&nota<=20)
			{
				i=i+1;
				suma = suma + nota;
			}
		}
		*/

		/*
		//Forma 2: Do While
		double nota=0.0;
		
		do
		{
			System.out.print("Nota "+(i+1)+":");	
			nota = tec.nextDouble();
			//Validando la nota
			if(nota>=0&&nota<=20)
			{
				i=i+1;
				suma = suma + nota;
			}
		}
		while(nota!=-1);
		*/


		//Forma 3: For
		for(double nota=100;nota!=-1;nota=tec.nextDouble())
		{
			//Validando la nota
			if(nota>=0&&nota<=20)
			{
				i=i+1;
				suma = suma + nota;
			}

			System.out.print("Nota " + (i+1) + ":");

			//Ejecuta la expresion #3 del For
		}

		//Mostrar resultados
		System.out.println("Cantidad = " + i);
		System.out.println("Suma = " + suma);
		System.out.println("Promedio = " + (suma/i));
	}
}