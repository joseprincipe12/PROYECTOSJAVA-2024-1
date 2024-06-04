package program;

import java.util.Scanner;
import models.Rectangulo;

public class Principal 
{
    //Propiedades
    
    //Metodos
    public static void main(String[] args) 
    {
        //Instanciar la clase Scanner
        Scanner objTeclado = new Scanner(System.in);
        //Instanciar la clase Rectangulo
        Rectangulo objRectangulo = new Rectangulo();
        
        System.out.print("Largo: ");
        objRectangulo.largo = objTeclado.nextDouble();
        System.out.print("Ancho: ");
        objRectangulo.ancho = objTeclado.nextDouble();
        
        System.out.println("Perimetro: " + objRectangulo.getPerimetro());
        System.out.println("Area: " + objRectangulo.getArea());
        System.out.println("Diagonal: " + objRectangulo.getDiagonal());
        
    }
}
