package Desafio5;

public abstract class ContaBancaria implements Conta {

    protected double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public abstract void depositar(double valor);

}