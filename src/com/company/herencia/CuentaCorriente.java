package com.company.herencia;

import com.company.composicion.Cuenta;

public class CuentaCorriente extends Cuenta {

    @Override
    public void extraer(double monto) {
        if(getSaldo() >= monto){
            setSaldo(getSaldo() - monto);
            System.out.println("Transaccion exitosa. Su nuevo saldo es $"+getSaldo());
        }else if(getSaldo() < monto){
            setSaldo(getSaldo() - monto);
            System.out.println("Transaccion existosa. Su nuevo saldo en crédito es $"+getSaldo());
                            }
        }
    }

