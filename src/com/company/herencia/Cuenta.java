package com.company.herencia;

public abstract class Cuenta {
    private Integer numero;
    private Double saldo;


    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    abstract public void extraer(double monto);
}
