/*
Obs: No utilizar la clase Math
A partir del ingreso de un numero 
y el exponente, calcular la potencia.
*/

import java.util.Scanner;

public class Ejercicio19
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);

		System.out.print("Numero: ");
		int numero = tec.nextInt();
		System.out.print("Exponente: ");
		int exponente = tec.nextInt();

		/*
		//Forma 1
		int n = 1; //Contador
		int potencia = 1; //Acumulador
		while(n<=exponente)
		{
			potencia = potencia * numero;
			n = n+1;
		}
		*/
		/*
		//Forma 2
		int potencia = 1; //Acumulador
		for(int n = 1;n<=exponente;n = n+1)
		{
			potencia = potencia * numero;
		}
		*/
		
		//Forma 3
		int n = 1; //Contador
		int potencia = 1; //Acumulador
		
		do
		{
			if(exponente==0)
			{
				break;
			}
			potencia = potencia * numero;
			n = n+1;
		}
		while(n<=exponente);


		System.out.println("Potencia: " + potencia);

	}
}