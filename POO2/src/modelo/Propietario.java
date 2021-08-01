/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author david
 */
public class Propietario extends Persona{
    private String nit;
    private double cui;
    public Propietario(){}

    public Propietario(String nit, double cui, String nombres, String apellidos, String direccion, String fecha_nacimiento, int telefono, String no_tarjeta, String uso, String placa, String chasis, String serie, String motor, String cilindros, String marca, String modelo, String linea, String asientos, String tipo) {
        super(nombres, apellidos, direccion, fecha_nacimiento, telefono, no_tarjeta, uso, placa, chasis, serie, motor, cilindros, marca, modelo, linea, asientos, tipo);
        this.nit = nit;
        this.cui = cui;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public double getCui() {
        return cui;
    }

    public void setCui(double cui) {
        this.cui = cui;
    }
    
    @Override
    public void agregar(){
        System.out.println("---------------Datos del propietario---------------");
        System.out.println("Nit: " +getNit());
        System.out.println("Cui: " +getCui());
        System.out.println("Nombres: " +getNombres());
        System.out.println("Apellidos: " +getApellidos());
        System.out.println("Direccion: " +getDireccion());
        System.out.println("Telefono: " +getTelefono());
        System.out.println("Fecha de nacimiento: " +getFecha_nacimiento());
        System.out.println("No de tarjeta: " +getNo_tarjeta());
        System.out.println("Uso: " +getUso());
        System.out.println("---------------Datos del vehiculo---------------");
        System.out.println("Placa: " +getPlaca());
        System.out.println("Chasis: " +getChasis());
        System.out.println("Serie: " +getSerie());
        System.out.println("Motor: " +getMotor());
        System.out.println("Cilindros: " +getCilindros());
        System.out.println("Marca: " +getMarca());
        System.out.println("Modelo: " +getModelo());
        System.out.println("Linea: " +getLinea());
        System.out.println("Asientos: " +getAsientos());
        System.out.println("Tipo: " +getTipo());
    }
    @Override
    public void mostrar(){}
    
    @Override
    public void edad(int nac){
        Calendar c = new GregorianCalendar();
        int edad = c.get(Calendar.YEAR)- nac;
        System.out.println("---------------Edad del propietario---------------");
        System.out.println("Edad: " +edad);
    }
    
    @Override
    public void operation(String op){
        System.out.println("---------------Reparacion---------------");
        System.out.println("Edad: " +op);
    }
}
