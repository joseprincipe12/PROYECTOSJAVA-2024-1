/*
A partir del ingreso de los lados de un triangulo:
Determinar si existe o no el triangulo.
Si existe:
- Calcular el perimetro
- Calcular el area
- Determinar el tipo: equilatero, isoceles, escaleno

*/

import java.util.Scanner;

public class Ejercicio10
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		double a, b, c;

		System.out.print("Lado A: ");
		a = tec.nextDouble();

		System.out.print("Lado B: ");
		b = tec.nextDouble();

		System.out.print("Lado C: ");
		c = tec.nextDouble();

		//(1) EXISTENCIA

		boolean condicionA = (Math.abs(b-c)<a)&&(a<(b+c));
		boolean condicionB = (Math.abs(a-c)<b)&&(b<(a+c));
		boolean condicionC = (Math.abs(b-a)<c)&&(c<(b+a));

		boolean existe = condicionA && condicionB && condicionC;

		//(2) PERIMETRO
		double perimetro;
		if (existe) 
		{
			perimetro = a + b + c;
		}else{
			perimetro = 0;
		}
		//(3) AREA
		double area;
		if(existe)
		{
			double s = perimetro/2;
			area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		}else{
			area = 0;
		}

		//(4) TIPO
		String tipo;
		if(existe)
		{
			if((a==b)&&(b==c)&&(a==c))
			{
				tipo = "Equilatero";
			}else if((a==b)||(b==c)||(a==c)){
				tipo = "Isoceles";
			}else{
				tipo = "Escaleno";
			}
		}else{
			tipo = "No Existe";
		}


		System.out.println("Existe : " + existe);
		System.out.println("Perimetro : " + perimetro);
		System.out.println("Area : " + area);
		System.out.println("Tipo : " + tipo);
	}
}