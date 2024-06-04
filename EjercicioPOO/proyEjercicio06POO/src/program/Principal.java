package program;

import java.util.Scanner;
import models.Registro;

public class Principal 
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
        
        Registro reg = new Registro(n1, n2, n3, n4);

        //Mostrar resultados
        System.out.println("menor : " + reg.getMenor());
        System.out.println("MAYOR : " + reg.getMayor());
        System.out.println("Promedio : " + reg.getPromedio());
        System.out.println("Estado : " + reg.getEstado());
        System.out.println("Calificacion : " + reg.getCalificacion());
        
    }
}
