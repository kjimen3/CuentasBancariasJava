package com.company.composicion;

public class EstrategiaCuentaAhorro implements EstrategiaExtraccion {
    @Override
    public void extraer(Cuenta cuenta, double monto) {
        if(cuenta.getSaldo() >= monto){
            cuenta.setSaldo(cuenta.getSaldo() - monto);
            System.out.println("Transaccion realizada. " + " Su nuevo saldo es $" + cuenta.getSaldo());
        }else{
            System.out.println("Saldo insuficiente, verifique el monto a retirar e intentelo nuevamente. " + " Su saldo es $" + cuenta.getSaldo());
        }
    }
}
