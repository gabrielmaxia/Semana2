/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadsemanal2;

/**
 *
 * @author ag045
 */
public class CuentaBancaria {
    
    private String numeroCuenta;
    private double saldo;
    private Cliente propietario;

    // Constructor
    public CuentaBancaria(String numeroCuenta, Cliente propietario) {
        this.numeroCuenta = numeroCuenta;
        this.propietario = propietario;
        this.saldo = 0.0; // Saldo inicial es 0
    }

    // Método para depositar dinero
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Error: El monto debe ser positivo.");
        }
    }

    // Método para retirar dinero
    public void retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Error: Saldo insuficiente o monto inválido.");
        }
    }

    // Método para consultar el saldo
    public double consultarSaldo() {
        return saldo;
    }

    // Método para mostrar la información de la cuenta
    public void mostrarInformacion() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
        propietario.mostrarDatos();
    }
    
}
