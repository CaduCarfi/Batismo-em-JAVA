package Desafio5;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    public void depositar(double valor){
        double valorComTaxa = valor * 0.99;
        saldo += valorComTaxa;
    }
}