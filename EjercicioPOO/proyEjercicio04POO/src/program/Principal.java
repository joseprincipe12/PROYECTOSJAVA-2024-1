package program;

import models.Persona;
import models.Profesor;
import models.Estudiante;

public class Principal 
{
    public static void main(String[] args) 
    {
        Persona persona1 = new Persona();
        Profesor profesor1 = new Profesor();
        Estudiante estudiante1 = new Estudiante();
        
        persona1.nombre = "Carlos";
        persona1.sexo = "M";
        
        profesor1.especialidad = "Matematica";
        profesor1.estadoCivil = "Casado";
        profesor1.planilla = 666;
        profesor1.sueldo = 2500.0;
        
        estudiante1.codigo = 100;
        estudiante1.grado = 4;
        estudiante1.seccion = 'B';
        
        profesor1.nombre = "Moises";
        profesor1.sexo = "M";
        
        estudiante1.nombre = "Leonel";
        estudiante1.sexo = "M";
        
        persona1.mostrarDatos();
        profesor1.mostrarDatos();
        estudiante1.mostrarDatos();
        
        
    }
}
