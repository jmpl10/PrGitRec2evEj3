package org.example;


public class Cliente {
    private String nombre;
    private int edad;
    private Vehiculo [] vehiculos= new Vehiculo[2];
    void anadir(Vehiculo v){
        vehiculos[0]=v;
    }
}
