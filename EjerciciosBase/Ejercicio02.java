//Importar una clase
import java.util.Scanner;

public class Ejercicio02
{
	//Propiedades: caracteristicas de las clases
	public static int suma;
	
	//Metodos: comportamiento de las clases
	public static void main(String[] args) 
	{
		//Utilizar la clase importada
		//Instanciar la clase Scanner:
		//Clase variable = new Constructor()
		Scanner objTeclado = new Scanner(System.in);

		//Declarar variables
		int n1, n2;

		//Asignar valores a las variables
		/*
		n1 = 10;
		n2 = 20;
		*/

		System.out.println("Digite N1:"); //Mostrar un texto de ayuda
		n1 = objTeclado.nextInt(); //Leer desde el teclado
		
		System.out.println("Digite N2:"); //Mostrar un texto de ayuda
		n2 = objTeclado.nextInt(); //Leer desde el teclado

		//Procesar (operar)
		System.out.println("La SUMA es:");
		suma = n1 + n2;

		//Mostrar resultados
		System.out.println(suma);

	}
}