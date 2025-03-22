/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadsemanal2;
import java.util.ArrayList;
/**
 *
 * @author ag045
 */
public class Banco {
    
    private String nombre;
    private ArrayList<CuentaBancaria> listaCuentas;

    // Constructor
    public Banco(String nombre) {
        this.nombre = nombre;
        this.listaCuentas = new ArrayList<>();
    }

    // Método para agregar una cuenta
    public void agregarCuenta(CuentaBancaria cuenta) {
        listaCuentas.add(cuenta);
        System.out.println("Cuenta agregada exitosamente.");
    }

    // Método para mostrar todas las cuentas
    public void mostrarCuentas() {
        System.out.println("Cuentas en el banco " + nombre + ":");
        for (CuentaBancaria cuenta : listaCuentas) {
            cuenta.mostrarInformacion();
            System.out.println("-----------------------------");
        }
    }
    
}
