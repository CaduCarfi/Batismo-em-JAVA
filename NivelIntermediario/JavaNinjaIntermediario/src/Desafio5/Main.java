package Desafio5;

public class Main {

    public static void main(String[] args) {

        ContaCorrente corrente = new ContaCorrente(1000.00);

        System.out.println("Saldo Conta Corrente: " + corrente.consultarSaldo());
        corrente.depositar(500);
        System.out.println("Saldo Conta Corrente após depósito: " + corrente.consultarSaldo());

        System.out.println("--------------------------------");

        ContaPoupanca poupanca = new ContaPoupanca(1000.00);

        System.out.println("Saldo Conta Poupança: " + poupanca.consultarSaldo());
        poupanca.depositar(500);
        System.out.println("Saldo Conta Poupança após depósito: " + poupanca.consultarSaldo());
    }
}
