package Abistrata;

public abstract class Ninja {

    String nome;
    String aldeia;
    int idade;

    // Metodos Abstratos
    public abstract void nomeDoNinja();

    public void tacarKunai() {
        System.out.println("Eu takei uma Kunai");
    }

}
