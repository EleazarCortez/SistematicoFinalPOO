/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import modelos.EmpOf;
import modelos.Empleado;

/**
 *
 * @author user
 */
public class DaoEmOf implements IOperaciones {
public ArrayList<String>listado = new ArrayList();

    public void agregarReguistros(){
        
    }
@Override
    public void agregarRegistros(Object o) {
      EmpOf OF = new EmpOf();  
      Empleado Em = new Empleado();
      
       OF.setNombre("Carlos");
       OF.setApellido("Jacomino");
       OF.setId(2);
       OF.setSalarioBase(10000);
       OF.setHorasExtras(3);
       
      Em.setSalarioBase(OF.getSalarioBase());
       Em.setHorasExtras(OF.getHorasExtras());
       
       listado.add(0,"Nombre: "+OF.getNombre());
       listado.add(1,"Apellido: "+OF.getApellido());
       listado.add(2,"ID: "+OF.getId());
       listado.add(3,"Horas Extras: "+OF.getHorasExtras());
       listado.add(4,"Salario Base: "+OF.getSalarioBase());
       listado.add(5,"Salario Bruto: "+OF.calcularSalarioBruto());
       listado.add(6,"Salario Neto: "+OF.calcularSalarioNeto());
       listado.add(7,"Seguro: "+OF.Seguro());
       
    }

   
    @Override
    public void mostrarRegistros(){
        System.out.println(listado);
    }
    
    
}
