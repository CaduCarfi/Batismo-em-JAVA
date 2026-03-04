package Desafio4;

public class NinjaAvancado implements Ninja{

    String nome;
    int idade;
    String habilidade;
    String especialidade;

    @Override
    public void mostrarInformacoes() {
        System.out.println("Meu Nome é " + nome);
        System.out.println("Minha Idade é " + idade);
        System.out.println("Minha Habilidade Ninja é " + habilidade);
        System.out.println("Minha especialidade é jutsu de " + especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Meu nome é " + nome + "! e eu estou utilizando minha habilidade " + habilidade);
    }

    public NinjaAvancado(String nome, int idade, String especialidade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.especialidade = especialidade;
        this.habilidade = habilidade;
    }
}
