/*
Crear un programa que permita calcular el promedio de las notas ingresadas.
Para ello debera digitar la cantidad de notas ingresadas.
Digitar el nombre del curso y nota respectiva.
Imprimir la lista de los cursos con sus respectivas notas y el promedio final.
Determinar la mayor y menor nota.
Calcular el promedio descartando la menor nota y duplicando la mayor nota.
-- Descartar las notas fuera de rango.(0-20)
*/

import java.util.Scanner;
public class Ejercicio21
{
	public static void main(String[] args) 
	{
		//Leer Notas
		Scanner tec = new Scanner(System.in);
		System.out.print("Cantidad: ");
		int cantidad = tec.nextInt();
		String[] cursos = new String[cantidad];
		double[] notas = new double[cantidad];

		String curso = "";
		double nota=0.0;

		for(int i=0;i<=(cantidad-1);i++)
		{
			do
			{
				System.out.print("Curso: ");
				curso = tec.next();
				System.out.print("Nota: ");
				nota = tec.nextDouble();
				if((nota<0)||(nota>20))
				{
					System.out.println("Nota fuera de Rango! - Vuelva a ingresar ...");
				}
			}while((nota<0)||(nota>20));

			cursos[i]=curso;
			notas[i]=nota;
		}

		//Determinar la mayor y menor nota

		double mayor = notas[0];
		double menor = notas[0];

		for(int i=0;i<=(cantidad-1);i++)
		{
			//Mayor
			if(notas[i]>mayor)
			{
				mayor = notas[i]; 
			}

			//menor
			if(notas[i]<menor)
			{
				menor = notas[i]; 
			}
		}

		//Calcular el promedio
		double suma = 0;
		for(int i=0;i<=(cantidad-1);i++)
		{
			suma = suma+notas[i];			
		}

		double promedio = suma/cantidad;
		promedio = Math.round(promedio*100)/100;

		double promedioPonderado = (suma-menor+mayor)/cantidad;
		promedioPonderado = Math.round(promedioPonderado*100)/100;

		//Mostrar los resultados
		for(int i=0;i<=(cantidad-1);i++)
		{
			System.out.println((i+1) + "- " + cursos[i] + " - " + notas[i]);
		}

		System.out.println("______________________");
		System.out.println("Promedio: " + promedio);
		System.out.println("Prom. Pond.: " + promedioPonderado);

	}
}
