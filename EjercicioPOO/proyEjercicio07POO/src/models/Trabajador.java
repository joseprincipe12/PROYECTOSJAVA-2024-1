package models;

public class Trabajador 
{
    //Propiedades
    private int codigo;
    private String nombre;
    private double sueldo;

    //Encapsulados
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    //Constructores
    public Trabajador() {
    }

    public Trabajador(int codigo, String nombre, double sueldo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    //Metodos
    public double getAFP()
    {
        return (0.10 * this.sueldo);
    }
    public double getSueldoNeto()
    {
        return (this.sueldo - this.getAFP());
    }
    
    public String getInformacion()
    {
        return (this.getCodigo() + " - " + this.getNombre() + " - " + this.getSueldo() + " - AFP: " + this.getAFP() + " - Neto: " + this.getSueldoNeto());
    }
}
