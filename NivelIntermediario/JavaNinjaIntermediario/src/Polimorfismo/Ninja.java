package Polimorfismo;

public abstract class Ninja implements EstrategiaDeBatalhaNinja{
    String nome;
    int idade;
    String aldeia;

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
