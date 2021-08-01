/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author david
 */
abstract class Persona extends Tarjeta {
    protected String nombres, apellidos, direccion, fecha_nacimiento;
    protected int telefono;
    public Persona(){}

    public Persona(String nombres, String apellidos, String direccion, String fecha_nacimiento, int telefono, String no_tarjeta, String uso, String placa, String chasis, String serie, String motor, String cilindros, String marca, String modelo, String linea, String asientos, String tipo) {
        super(no_tarjeta, uso, placa, chasis, serie, motor, cilindros, marca, modelo, linea, asientos, tipo);
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.fecha_nacimiento = fecha_nacimiento;
        this.telefono = telefono;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    @Override
    public void agregar(){}
    @Override
    public void mostrar(){}
    @Override
    public void operation(String op){}
    
    public void edad(int nac){}
}
