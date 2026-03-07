package Desafio5;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    public void depositar(double valor){
        saldo += valor;
    }
}
