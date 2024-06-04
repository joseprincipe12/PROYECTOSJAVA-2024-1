/*
A partir del ingreso de 4 notas calcular el promedio, 
su estado: "Aprobado"/"Desaprobado" y su calificación:

- Promedio es 18 o más "Excelente"
- Promedio es 16 o más "Muy Bueno"
- Promedio es 14 o más "Bueno"
- Promedio es 11 o más "Regular"
- Promedio es menos que 11 "En Progreso"

Para calcular el promedio, 
se debe duplicar la mayor nota y descartar la menor nota.

*/

import java.util.Scanner;

public class Ejercicio12
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);

		//Leer 4 notas
		System.out.println("Digite 4 notas: ");
		double n1 = tec.nextDouble();
		double n2 = tec.nextDouble();
		double n3 = tec.nextDouble();
		double n4 = tec.nextDouble();

		//Determinar el menor y el MAYOR
		double menor, mayor;
		
		menor = n1;
		mayor = n1;

		if(n2<menor){
			menor = n2;
		}
		if(n2>mayor)
		{
			mayor = n2;
		}
		if(n3<menor){
			menor = n3;
		}
		if(n3>mayor)
		{
			mayor = n3;
		}
		if(n4<menor){
			menor = n4;
		}
		if(n4>mayor)
		{
			mayor = n4;
		}

		//Calcular
		double promedio = (n1+n2+n3+n4-menor+mayor)/4.0;

		//Estado - utilizando el ternario
		String estado = (promedio>=11)?"Aprobado":"Desaprobado";

		//Calificacion
		String calificacion;

		if(promedio>=18.0){
			calificacion="Excelente";
		}else if(promedio>=16.0){
			calificacion="Muy bueno";
		}else if(promedio>=14.0){
			calificacion="Bueno";
		}else if(promedio>=11.0){
			calificacion="Regular";
		}else{
			calificacion="En progreso";
		}

		//Mostrar resultados
		System.out.println("menor : " + menor);
		System.out.println("MAYOR : " + mayor);
		System.out.println("Promedio : " + promedio);
		System.out.println("Estado : " + estado);
		System.out.println("Calificacion : " + calificacion);
	}
}