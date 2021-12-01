/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author user
 */
public class EmpPro extends Empleado {
    
    private double bono;

    public EmpPro() {
    }

    public EmpPro(double bono, int id, String nombre, String apellido, double salarioBase, double horasExtras) {
        super(id, nombre, apellido, salarioBase, horasExtras);
        this.bono = bono;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
    
    

    
    
    

}
