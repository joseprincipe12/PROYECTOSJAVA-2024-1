package models;

public class Persona 
{
    //Propiedades
    public String nombre;
    public String sexo;
    
    //Metodos
    
    public void mostrarDatos()
    {
        System.out.println("Nombre :" + this.nombre);
        System.out.println("Sexo :" + this.sexo);
    }
}
