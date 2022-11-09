package com.company.herencia;


import com.company.composicion.Cuenta;

public class CuentaAhorros extends Cuenta {

    @Override
    public void extraer(double monto) {
        if(getSaldo() >= monto){
            setSaldo(getSaldo() - monto);
            System.out.println("Transaccion realizada. " + " Su nuevo saldo es $" + getSaldo());
        }else{
            System.out.println("Saldo insuficiente, verifique el monto a retirar e intentelo nuevamente. " + " Su saldo es $" + getSaldo());
        }

    }
}
