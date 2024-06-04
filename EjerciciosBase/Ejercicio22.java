/*
Utilizar ARRAY LIST:
===================
Crear un programa que permita calcular el promedio de las notas ingresadas.
NO --> Para ello debera digitar la cantidad de notas ingresadas.
Digitar el nombre del curso y nota respectiva.
Imprimir la lista de los cursos con sus respectivas notas y el promedio final.
Determinar la mayor y menor nota.
Calcular el promedio descartando la menor nota y duplicando la mayor nota.
-- Descartar las notas fuera de rango.(0-20)
*/

//Importar la clase Scanner
import java.util.Scanner;
//Importar la clase ArrayList
import java.util.ArrayList;

public class Ejercicio22
{
	public static void main(String[] args) 
	{
		//Instanciar la clase Scanner
		Scanner tec = new Scanner(System.in);

		//Declarar ArrayList: Tipos NO NATIVOS
		ArrayList<String> cursos = new ArrayList<String>();
		ArrayList<Double> notas = new ArrayList<Double>();

		//Declarar variables para leer el curso y nota
		String curso;
		double nota;
		char respuesta;

		//Ingreso de los cursos y sus notas
		do
		{
			//Leer valores
			System.out.print("Curso: ");
			curso = tec.next();
			System.out.print("Nota: ");
			nota = tec.nextDouble();

			//Validar
			if((nota>=0)&&(nota<=20))
			{
				//Agregar el elemento al ArrayList
				cursos.add(curso);
				notas.add(nota);
			}
			else
			{
				//Mensaje de error
				System.out.println("-- Nota fuera de Rango! --");
			}

			//Pregunta de control
			System.out.print("Continuar ? [s/n]: ");
			respuesta = tec.next().charAt(0);
		}
		while(respuesta=='s');

		//Determinar la menor, la mayor nota y la suma
		double menor = notas.get(0);
		double mayor = notas.get(0);
		double suma = 0;

		//FOR EACH - Recorrer el ArrayList
		for(double elemento:notas)
		{
			if(elemento<menor)
			{
				menor = elemento;
			}

			if(elemento>mayor)
			{
				mayor = elemento;
			}

			suma = suma + elemento;
		}

		double promedio = suma / notas.size(); //Cantidad de Elementos

		double promedioPonderado = (suma-menor+mayor) / notas.size();


		//Mostrar resultados

		System.out.println("______________________");

		for(int indice=0;indice<=(notas.size()-1);indice=indice+1)
		{
			System.out.println(cursos.get(indice) + " - " + notas.get(indice));
		}

		System.out.println("______________________");
		System.out.println("Promedio: " + promedio);
		System.out.println("Prom. Pond.: " + promedioPonderado);

	}
}