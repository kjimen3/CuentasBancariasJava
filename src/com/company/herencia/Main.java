package com.company.herencia;

import com.company.composicion.Cuenta;

public class Main {
    public static void main(String[] args) {

        Cuenta cuenta1 = new CuentaCorriente();
        cuenta1.setSaldo(1000.0);
        cuenta1.extraer(800.0);

        Cuenta cuenta2 = new CuentaAhorros();
        cuenta2.setSaldo(cuenta1.getSaldo());
        cuenta1 = cuenta2;

        cuenta2.extraer(1000);
        System.out.println(cuenta1.getSaldo());
    }
}
