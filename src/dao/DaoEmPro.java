/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import modelos.EmpPro;
import modelos.Empleado;

/**
 *
 * @author user
 */
public class DaoEmPro implements IOperaciones {
public ArrayList<String>registro = new ArrayList();
 

    public void agregarRegitros(){
        
        
    }
       
    
    public void agregarRegistros(Object o) {
        
       EmpPro REG = new EmpPro();
       Empleado Em = new Empleado();
       
       REG.setNombre("Duran");
       REG.setApellido("Martinez");
       REG.setId(1);
       REG.setSalarioBase(10000);
       REG.setHorasExtras(5);
       REG.setBono(10000);
      
       Em.setSalarioBase(REG.getSalarioBase());
       Em.setHorasExtras(REG.getHorasExtras()+REG.getBono());
       
       registro.add(0,"Nombre: "+REG.getNombre());
       registro.add(1,"Apellido: "+REG.getApellido());
       registro.add(2,"Id: "+REG.getId());
       registro.add(3,"Bono: "+REG.getBono());
       registro.add(4,"Horas Extaras: "+REG.getHorasExtras());
       registro.add(5,"Salario Base: "+REG.getSalarioBase());
       registro.add(6,"Salario bruto: "+Em.calcularSalarioBruto());
       registro.add(7,"Salario Neto: "+Em.calcularSalarioNeto());
       registro.add(8,"Seguro: "+Em.Seguro());
      
     
     
    }
    @Override
    public void mostrarRegistros() {
        System.out.println(registro);
    }
    
  
    
}
