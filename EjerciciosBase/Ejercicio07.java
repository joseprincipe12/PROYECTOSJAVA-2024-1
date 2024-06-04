/*
A partir del ingreso de 3 numeros
determinar el menor y el mayor.

if(condicion) {
	
}

*/

//Importar la clase Scanner del paquete java.util
import java.util.Scanner;

public class Ejercicio07
{
	public static void main(String[] args) 
	{
		//Declarando e instanciando la clase Scanner		
		Scanner t = new Scanner(System.in);
		//Leer los numeros
		System.out.print("N1=");
		int n1 = t.nextInt();
		System.out.print("N2=");
		int n2 = t.nextInt();
		System.out.print("N3=");
		int n3 = t.nextInt();

		//Declarar e inicializar variables
		int menor = n1;
		int mayor = n1;

		//Determinar el menor de los numeros
		//Comparar con los demas valores
		if(n2<menor)
		{
			menor = n2;
		}

		if(n3<menor)
		{
			menor=n3;
		}

		//Determinar el MAYOR de los numeros
		//Comparar con los demas valores
		if(n2>mayor)
		{
			mayor=n2;
		}

		if(n3>mayor)
		{
			mayor=n3;
		}

		//Mostrar los resultados
		System.out.println("Menor = " + menor);
		System.out.println("Mayor = " + mayor);
	}
}