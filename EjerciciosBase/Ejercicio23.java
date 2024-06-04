/*
 La clase String
*/

public class Ejercicio23
{
	public static void main(String[] args) 
	{
		/*
		String tipo de dato NO nativo.
		String array de caracteres (char).
		String es una Clase de la libreria estandar de JAVA creada para 
		almacenar textos largo.
		*/
		//Declarar una variable y asignar valor
		String texto = "SENATI ETI";

		//Mostrar el valor
		System.out.println("Texto: " + texto);

		//length(): calcula la cantidad de caracteres
		int cantidadCaracteres = texto.length();
		System.out.println("Cantidad de Caracteres: " + cantidadCaracteres);

		//Recorrer letra por letra
		for(int i=0;i<=cantidadCaracteres-1;i=i+1)
		{
			System.out.println(texto.charAt(i));
		}

		//indexOf() : Buscar un texto dentro de otro texto
		int posicionEncontrada = texto.indexOf("NAT"); //Retorna la posicion encontrada
		//Si no ubica el texto => retorna -1
		System.out.println("Posicion Encontrada de NAT: " + posicionEncontrada);

		//substring() : Extraer un texto de otro texto desde una posicion inicial hasta una posicion final
		//No se incluye la posicion final en el retorno.

		String subTexto = texto.substring(2,5);
		System.out.println("Sub Texto: [2-5] " + subTexto);

		//toLowerCase() toUpperCase(): convertir a minusculas y mayusculas
		String minuscula = texto.toLowerCase();
		String mayuscula = minuscula.toUpperCase();

		System.out.println("minuscula: " + minuscula);
		System.out.println("mayuscula: " + mayuscula);

		//equals() : Compara dos textos
		boolean comparacion = texto.equals("SENATI");
		System.out.println("Comparado con SENATI: " + comparacion);
		
		comparacion = texto.equals("SENATI ETI");
		System.out.println("Comparado con SENATI ETI: " + comparacion);

	}
}