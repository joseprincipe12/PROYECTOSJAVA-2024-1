package program;

import java.util.Scanner;
import models.Triangulo;

public class Principal 
{    
    public static void main(String[] args) 
    {
        //Instanciar las clase Scanner
        Scanner tec = new Scanner(System.in);
        
        /*
        //Forma 1:
        //Instanciar la clase Triangulo
        Triangulo tri = new Triangulo();

        //Leer los valores y asignar a las propiedades
        //a traves de sus encapsulados
        System.out.print("Lado A: ");
        tri.setA(tec.nextDouble());
        System.out.print("Lado B: ");
        tri.setB(tec.nextDouble());
        System.out.print("Lado C: ");
        tri.setC(tec.nextDouble());
        */

        //Instanciar la clase Triangulo utilizando el constructor con parametros
        //Forma 2:
        System.out.println("Ingresar los Lados:");
        Triangulo tri = new Triangulo(tec.nextDouble(),tec.nextDouble(),tec.nextDouble());
        
        //Mostrar resultados
        System.out.println("Existe : " + (tri.getExiste()?"SI":"NO"));
        System.out.println("Perimetro : " + tri.getPerimetro());
        System.out.println("Area : " + tri.getArea());
        System.out.println("Tipo : " + tri.getTipo());
    }
}
