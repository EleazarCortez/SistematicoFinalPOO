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
public class Empleado {
    
    protected int id;
    protected String nombre;
    protected String apellido;
    protected double salarioBase;
    protected double horasExtras;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String apellido, double salarioBase, double horasExtras) {
        this.id = id;
        this.apellido = apellido;
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

 
      public double calcularSalarioNeto(){
        double salario;
        
     salario = salarioBase+horasExtras;
     salario=salario - (salario*7)/100;
        
        return salario;
    }
    public float calcularSalarioBruto(){
        double x = salarioBase+horasExtras;
        float salario= (float)x;
         
         return salario;
    }
    public double Seguro(){
    double seguro;
    seguro=(salarioBase+horasExtras)*7/100;
        return seguro;
    }
 
}
