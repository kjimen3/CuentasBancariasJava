package com.company.composicion;

public class EstrategiaCuentaCorriente implements EstrategiaExtraccion {
    @Override
    public void extraer(Cuenta cuenta, double monto) {
        if (cuenta.getSaldo() >= monto) {
            cuenta.setSaldo(cuenta.getSaldo() - monto);
            System.out.println("Transaccion exitosa. Su nuevo saldo es $" + cuenta.getSaldo());
        } else if (cuenta.getSaldo() < monto) {
            cuenta.setSaldo(cuenta.getSaldo() - monto);
            System.out.println("Transaccion existosa. Su nuevo saldo en crédito es $" + cuenta.getSaldo());
        }
    }}
