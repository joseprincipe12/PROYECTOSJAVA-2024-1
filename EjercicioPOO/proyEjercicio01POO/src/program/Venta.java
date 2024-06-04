package program;

//Declarar la clase
public class Venta 
{
    //Propiedades
    public double precio;
    public int cantidad;
    //Metodos
    
    //Metodo SIN retorno de valor 
    public void mostrarResultados()
    {
        double total = this.precio*this.cantidad;
        double igv =  0.18*total;
        double totalIgv = total + igv;
        
        System.out.println("Total S/. " + total);
        System.out.println("IGV S/. " + igv);
        System.out.println("Total IGV S/. " + totalIgv);
    }
    //Metodo CON retorno de valor 
    public double calcularTotal()
    {
        double total = this.precio*this.cantidad;
        return total;
    }

    public double calcularIgv()
    {
        double igv = 0.18*this.calcularTotal();
        return igv;
    }
    public double calcularTotalIgv()
    {
        double totalIgv = this.calcularTotal()+this.calcularIgv();
        return totalIgv;
    }
    
}
