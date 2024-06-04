/*
Imprimir los primeros 100 numeros pares
*/

public class Ejercicio14
{
	public static void main(String[] args) 
	{
		/*
		//Forma 1: While
		int contarPares = 0; //Contador de pares
		int numero = 1; //Contador del numero
		//Repetir mientras la cantidad de pares sea <=100
		while(contarPares<100)
		{
			if(numero%2==0) //Si el numero es par
			{
				//Es par
				contarPares = contarPares + 1;
				System.out.println(contarPares + ": -> " + numero);	
			}
			//Incrementar el numero
			numero = numero + 1;
		}
		*/

		/*
		//Forma 2: Do While
		int contarPares = 0; //Contador de pares
		int numero = 1; //Contador del numero
		//Repetir mientras la cantidad de pares sea <=100
		do
		{
			if(numero%2==0) //Si el numero es par
			{
				//Es par
				contarPares = contarPares + 1;
				System.out.println(contarPares + ": -> " + numero);	
			}
			//Incrementar el numero
			numero = numero + 1;
		}
		while(contarPares<100);
		*/

		//Forma 3: For
		int contarPares = 0; //Contador de pares
		 
		//Repetir mientras la cantidad de pares sea <=100
		for(int numero = 1;contarPares<100;numero = numero + 1)
		{
			if(numero%2==0) //Si el numero es par
			{
				//Es par
				contarPares = contarPares + 1;
				System.out.println(contarPares + ": -> " + numero);	
			}
		}
	}
}