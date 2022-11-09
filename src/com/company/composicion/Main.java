package com.company.composicion;

import com.company.herencia.CuentaCorriente;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta();
        cuenta1.setSaldo(2000.5);
        cuenta1.setNumero(1001);
        cuenta1.setEstrategia(new EstrategiaCuentaAhorro());
        cuenta1.extraer(2100);

        cuenta1.setEstrategia(new EstrategiaCuentaCorriente());
        cuenta1.extraer(2100);

        System.out.println(cuenta1.getSaldo());
    }
}
