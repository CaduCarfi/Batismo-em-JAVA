package Desafio4;

public class NinjaBasico implements Ninja{

    String nome;
    int idade;
    String habilidade;

    @Override
    public void mostrarInformacoes() {
        System.out.println("Meu Nome é " + nome);
        System.out.println("Minha Idade é " + idade);
        System.out.println("Minha Habilidade Ninja é " + habilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Meu nome é " + nome + "! e eu estou utilizando minha habilidade " + habilidade);
    }

    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }
}
