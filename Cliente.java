/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadsemanal2;

/**
 *
 * @author ag045
 */
public class Cliente {
    
    private String nombre;
    private String dpi;
    private String direccion;

    // Constructor
    public Cliente(String nombre, String dpi, String direccion) {
        this.nombre = nombre;
        this.dpi = dpi;
        this.direccion = direccion;
    }

    // Método público para mostrar los datos del cliente
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DPI: " + dpi);
        System.out.println("Dirección: " + direccion);
    }
    
}
