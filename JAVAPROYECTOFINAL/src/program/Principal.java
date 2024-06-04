package program;

import views.FrmCliente;

public class Principal {
    public static void main(String[] args) {
        //Instanciamos la Clase FrmCleinte del paquete views
        FrmCliente frm = new FrmCliente();
        //Llamamos al metodo para dar una localizacion a la ventana
        frm.setLocationRelativeTo(null);
        //Llamamos al metodo para que la ventana se inicialize 
        frm.setVisible(true);
    }
}
