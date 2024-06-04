/*
TIPOS DE DATOS
*/
public class Ejercicio03
{
	public static void main(String[] args) 
	{
		//-- DECLARACION DE VARIABLES --
		//Tipos Nativos
		int entero;
		long enteroLargo;
		float decimal;
		double decimalDoble;
		char caracter;
		boolean logico;

		//Tipos No Nativos (clases)
		String texto; //Array de caracteres
		Integer _entero;
		Long _enteroLargo;
		Double _decimalDoble;

		//Observacion String:
		/*
			"SENATI"=="SENATI"; No funciona adecuadamente
		*/

		//-- ASIGNACION DE VARIABLES --
		entero = 10; // 4 bytes (-2 Millones -> 2 Millones)
		enteroLargo = 1000; // 8 bytes (-9 Trillones -> 9 Trillones)
		decimal = 3.14f; // 4 bytes (6 decimales)
		decimalDoble = 3.1416d; // 8 bytes (15 decimales)
		caracter = 'A'; // 2 bytes
		logico = true; // 1 bit (0|1)
		texto = "SENATI"; // 2 bytes x Cantidad Caracteres

		//-- CONVERSION DE TIPOS DE DATOS

		// CASTING
		System.out.println("Entero #0:" + entero);
		
		entero = (int) enteroLargo;
		System.out.println("Entero #1:" + entero);

		entero = (int) decimalDoble;
		System.out.println("Entero #2:" + entero);

		System.out.println("Decimal #0:" + decimal);

		decimal = (float) decimalDoble;
		System.out.println("Decimal #1:" + decimal);

		// PARSE
		// Tipos NO NATIVOS

		String n1 = "100";
		String n2 = "10.5";

		System.out.println("n1:" + n1);
		System.out.println("n2:" + n2);
		System.out.println("n1 + n2:" + (n1 + n2));

		//Convertir a Enteros y Decimales
		int n1_entero = Integer.parseInt(n1);
		double n2_decimal = Double.parseDouble(n2);
		System.out.println("n1 + n2:" + (n1_entero + n2_decimal));

		//Convertir a Texto
		String n1_texto = Integer.toString(n1_entero);
		String n2_texto = Double.toString(n2_decimal);
		System.out.println("n1 + n2:" + (n1_texto + n2_texto));
	}
}