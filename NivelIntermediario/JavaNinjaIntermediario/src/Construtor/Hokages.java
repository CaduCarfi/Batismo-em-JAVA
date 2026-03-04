package Construtor;

public class Hokages {

    String nome;
    int idade;
    boolean vivoOuNao;
    String aldeia;
    int missoes;
    double saldoBancario;
    double altura;

    // No Args Constructor
    public Hokages() {
        // Construtor vazio, sem argumentos
    }

    // Criar um construtor com argumentos
    public Hokages(String nome) {
        this.nome = nome;
    }

    public Hokages(int idade) {
        this.idade = idade;
    }

    public Hokages(String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }

    // All args constructor = Construtor com todos os argumentos
    // Voce consegue criar automaticamente os construtores com INTELIJ
    public Hokages(String nome, int idade, boolean vivoOuNao, String aldeia, int missoes, double saldoBancario, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
        this.aldeia = aldeia;
        this.missoes = missoes;
        this.saldoBancario = saldoBancario;
        this.altura = altura;
    }
}
