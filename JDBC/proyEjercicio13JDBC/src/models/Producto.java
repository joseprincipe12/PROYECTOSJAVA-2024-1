package models;

//Importar las clases JDBC
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Producto 
{
    //Propiedades
    private int id;
    private String descripcion;
    private String categoria;
    private double precio;

    //Constructores
    public Producto() {
    }
    
    public Producto(int id, String descripcion, String categoria, double precio) {
        this.id = id;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio = precio;
    }
    
    //Encapsulados

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    //Metodos: CRUD
    public Producto getBuscarById(int idBuscar)
    {
        //Instanciar el modelo Producto
        Producto producto = new Producto();
        try
        {
            //Establecer la conexion
            Connection cnx = Conexion.getConexion();
            //Preparar la instruccion SQL
            PreparedStatement ps = cnx.prepareStatement("select * from producto where id=?");
            //Pasar los valores de los parametros SQL
            ps.setInt(1, idBuscar);
            //Ejecutar la instrcuccion SQL
            ResultSet rs = ps.executeQuery(); //SELECT
            //Desplazar el puntero de registros
            if(rs.next())
            {
                //Leer los valores de la fila
                producto.setId(rs.getInt("id"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setCategoria(rs.getString("categoria"));
                producto.setPrecio(rs.getDouble("precio"));
            }else{
                //Establecer valores predeterminados
                producto.setId(0);
                producto.setDescripcion("");
                producto.setCategoria("");
                producto.setPrecio(0.0);
            }
        }
        catch(Exception e)
        {
            //Establecer valores predeterminados
            producto.setId(-1);
            producto.setDescripcion("-Error de conexion-");
            producto.setCategoria("");
            producto.setPrecio(0.0);            
        }
        //Retornar el objeto "producto"
        return producto;
    }
    
    public int setInsertar(Producto producto)
    {
        int nuevoId;
        try
        {
            //Establecer la conexion
            Connection cnx = Conexion.getConexion();
            //(1) INSERTAR
            //Preparar la instruccion SQL
            PreparedStatement ps = cnx.prepareStatement("insert into producto (descripcion, categoria, precio) values (?,?,?);");
            //Pasar los valores de los parametros SQL
            ps.setString(1, producto.getDescripcion());
            ps.setString(2, producto.getCategoria());
            ps.setDouble(3, producto.getPrecio());
            //Ejecutar la instrcuccion SQL
            ps.executeUpdate(); //INSERT-UPDATE-DELETE
            
            //*********************************************
            //(2) LEER EL NUEVO ID GENERADO
            //Preparar la instruccion SQL
            ps = cnx.prepareStatement("select max(id) as nuevoId from producto");
            //Ejecutar la instrcuccion SQL
            ResultSet rs = ps.executeQuery();
            
            //Desplazar el puntero de registros
            if(rs.next())
            {
                //Leer el nuevo id
                nuevoId =  rs.getInt("nuevoId");

            }else{
                //Establecer valor predeterminado para el nuevo id
                nuevoId = 0;
            }
        }
        catch(Exception e)
        {
            //Establecer valores predeterminados
            nuevoId = -1;            
        }
        //Retornar el nuevo id
        return nuevoId;        
    }
    public void setActualizar(Producto producto)
    {
        try
        {
            //Establecer la conexion
            Connection cnx = Conexion.getConexion();
            //(1) INSERTAR
            //Preparar la instruccion SQL
            PreparedStatement ps = cnx.prepareStatement("update producto set descripcion=?, categoria=?, precio=? where id=?;");
            //Pasar los valores de los parametros SQL
            ps.setString(1, producto.getDescripcion());
            ps.setString(2, producto.getCategoria());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getId());
            //Ejecutar la instrcuccion SQL
            ps.executeUpdate(); //INSERT-UPDATE-DELETE
            
        }
        catch(Exception e)
        {

        }
    }
    public void setEliminar(int idEliminar)
    {
        try
        {
            //Establecer la conexion
            Connection cnx = Conexion.getConexion();
            //(1) INSERTAR
            //Preparar la instruccion SQL
            PreparedStatement ps = cnx.prepareStatement("delete from producto where id=?;");
            //Pasar los valores de los parametros SQL
            ps.setInt(1, idEliminar);
            //Ejecutar la instrcuccion SQL
            ps.executeUpdate(); //INSERT-UPDATE-DELETE
            
        }
        catch(Exception e)
        {

        }
    }

}
