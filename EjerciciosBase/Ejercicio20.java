/*
	ARRAYS (Arreglos)
	Permite almacenar mas de un valor
	en una misma variable, en diferentes posiciones
	y del mismo tipado.

*/
public class Ejercicio20
{
	public static void main(String[] args) 
	{
		//DECLARAR ARRAYS
		//tipo[] variable(s) = new tipo[n];
		int[] notas = new int[5];
		//ASIGNAR VALORES
		notas[0]=10;
		notas[1]=11;
		notas[2]=12;
		notas[3]=13;
		notas[4]=14;

		//DECLARAR Y ASIGNAR VALORES
		String[] estudiantes = {"Walter","Carlos","Ricardo","Maria","Pedro"};

		//ACCEDER A CADA VALOR
		int suma = notas[0]+notas[1]+notas[2]+notas[3]+notas[4];

		//CANTIDAD DE ELEMENTOS
		int cantidad = notas.length;

		//PROMEDIAR
		double promedio = suma / cantidad;
		System.out.println("Promedio: " + promedio);


		//RECORRER EL ARRAY
		System.out.println("Forma 1: FOR");
		for(int indice=0;indice<=(notas.length-1);indice=indice+1)
		{
			System.out.println(indice + " - " + estudiantes[indice]);
			System.out.println(indice + " - " + notas[indice]);
		}

		System.out.println("Forma 2: WHILE");
		int indice=0;
		while(indice<=(notas.length-1))
		{
			System.out.println(indice + " - " + estudiantes[indice]);
			System.out.println(indice + " - " + notas[indice]);
			indice=indice+1;	
		}

		System.out.println("Forma 3: FOREACH");
		for(int elemento : notas)
		{
			System.out.println(elemento);
		}

		for(String elemento : estudiantes)
		{
			System.out.println(elemento);
		}


	}
}