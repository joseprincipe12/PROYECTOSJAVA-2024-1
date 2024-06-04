/*
A partir del ingreso de los lados de un rectangulo
calcular el perimetro, el area y la diagonal.
*/

//Importar la clase Scanner del paquete java.util
import java.util.Scanner;


public class Ejercicio06
{
	public static void main(String[] args) 
	{
		//Declarando e instanciando la clase Scanner		
		Scanner t = new Scanner(System.in);
		//Leer el largo y el ancho del rectangulo
		System.out.print("Largo: ");
		double largo = t.nextDouble();
		System.out.print("Ancho: ");
		double ancho = t.nextDouble();
		//Calculos
		double perimetro = 2 * (largo+ancho);
		double area = largo*ancho;
		double diagonal = Math.sqrt(Math.pow(largo,2)+Math.pow(ancho,2));

		//Mostrar resultados
		System.out.println("Perimetro: "+perimetro);
		System.out.println("Area: "+area);
		System.out.println("Diagonal: "+diagonal);

	}
}