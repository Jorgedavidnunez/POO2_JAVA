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
abstract class Tarjeta extends Vehiculo {
    private String no_tarjeta, uso;
    public Tarjeta(){}

    public Tarjeta(String no_tarjeta, String uso, String placa, String chasis, String serie, String motor, String cilindros, String marca, String modelo, String linea, String asientos, String tipo) {
        super(placa, chasis, serie, motor, cilindros, marca, modelo, linea, asientos, tipo);
        this.no_tarjeta = no_tarjeta;
        this.uso = uso;
    }

    public String getNo_tarjeta() {
        return no_tarjeta;
    }

    public void setNo_tarjeta(String no_tarjeta) {
        this.no_tarjeta = no_tarjeta;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }
    
    @Override
    public void agregar(){}
    @Override
    public void mostrar(){}
    @Override
    public void operation(String op){}
}
