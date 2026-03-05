package Polimorfismo;

public abstract class Ninja implements EstrategiaDeBatalhaNinja{
    String nome;
    int idade;
    String aldeia;

    public Ninja() {
    }

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // Metodo Geral! Todos os ninjas vao ter
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial!");
    }

    // Sobreescrevendo o metodo da interface
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é " + nome + " Essa é minha estrategia de combate");
    }

}
