/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistematicofinalpoo;

import dao.DaoEmOf;
import dao.DaoEmPro;
import modelos.EmpOf;
import modelos.EmpPro;

/**
 *
 * @author user
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DaoEmPro datos = new DaoEmPro();
        EmpPro data = new EmpPro();
        DaoEmOf mostrar = new DaoEmOf();
        EmpOf ver = new EmpOf ();
        
        
        datos.agregarRegistros(data);
        datos.mostrarRegistros();
       
        mostrar.agregarRegistros(ver);
        mostrar.mostrarRegistros();
        
    }
    
}
