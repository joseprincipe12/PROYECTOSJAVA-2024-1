/*

	Imprimir los 10 primeros numeros enteros

*/

public class Ejercicio13
{
	public static void main(String[] args) 
	{
		System.out.println("Forma #1 -");
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);

		System.out.println("Forma #2 - While");

		int contador1 = 1; //Declarar e inicializar el contador
		while(contador1<=10)
		{
			System.out.println(contador1);
			contador1 = contador1 + 1; //Expresion de incremento
		}

		System.out.println("Forma #3 - Do - While");

		int contador2 = 1; //Declarar e inicializar el contador
		do
		{
			System.out.println(contador2);
			contador2 = contador2 + 1; //Expresion de incremento
		}while(contador2<=10);

		System.out.println("Forma #4 - For");

		for(int contador3 = 1;contador3<=10;contador3 = contador3 + 1)
		{
			System.out.println(contador3);
		}

	}
}