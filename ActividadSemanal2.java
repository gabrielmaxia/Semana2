/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividadsemanal2;

/**
 *
 * @author ag045
 */
public class ActividadSemanal2 {

   public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Juan Perez", "123456789", "Calle 123");
        Cliente cliente2 = new Cliente("Maria Lopez", "987654321", "Avenida 456");

        CuentaBancaria cuenta1 = new CuentaBancaria("001", cliente1);
        CuentaBancaria cuenta2 = new CuentaBancaria("002", cliente2);

        Banco banco = new Banco("Banco GYT");

        banco.agregarCuenta(cuenta1);
        banco.agregarCuenta(cuenta2);

        cuenta1.depositar(1000);
        cuenta1.retirar(200);
        cuenta2.depositar(500);
        cuenta2.retirar(100);

        banco.mostrarCuentas();
    }
}
