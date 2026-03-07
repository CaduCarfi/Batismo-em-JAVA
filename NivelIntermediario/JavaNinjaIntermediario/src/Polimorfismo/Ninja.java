package Polimorfismo;

public abstract class Ninja implements EstrategiaDeBatalhaNinja{

    //TODO: Incuir 2 novos atributos: numeroDeMissoesConcluidas, Rank
    //TODO: Rank: Gennin, CHunnin, Jounnin, Hokage

    String nome;
    int idade;
    String aldeia;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;


    public Ninja() {
    }

    // Metodo existente: Primeiro metodo
    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //TODO: Sobrecarga do construtor chamando os novos atributos
    // Sobrecarga de metodos voce nao precisa redeclarar o construtor so os novos atributos
    public Ninja(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, idade, aldeia);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    // Metodo Geral! Todos os ninjas vao ter
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial!");
    }

    // Sobreescrevendo o metodo da interface
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é " + nome + " Essa é minha ESTRATEGIA de combate");
    }

    // Inteligencia de combate - Metodo padrao
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é " + nome + " Essa é minha INTELIGENCIA de combate");
    }

    // Inteligencia de combate - Sobrecarga de metodo
    public void inteligenciaDeCombate(int qi) {

        if (qi > 150) {
            System.out.println("Seu QI é: " + qi + " e voce é um genio");
        } else if (qi >= 130){
            System.out.println("Seu QI é: " + qi + " e voce é um ninja promissor");
        } else {
            System.out.println("Seu QI é: " + qi + " e voce precisa treinar mais suas estrategias");
        }

    }

    // Metodo sem @Override
    public void metodoProvisorio() {
        System.out.println("Teste na classe Ninja");
    }

}
