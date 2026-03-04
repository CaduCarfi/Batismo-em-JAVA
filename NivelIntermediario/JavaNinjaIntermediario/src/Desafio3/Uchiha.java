package Desafio3;

public class Uchiha extends Ninja{
    private String habilidadeEspecial;

    public Uchiha(String nome, int idade, String missao, String nivelDificuldade,
                  String statusMissao, String habilidadeEspecial) {

        super(nome, idade, missao, nivelDificuldade, statusMissao);
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public void mostrarHabilidadeEspecial() {
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }

    public void atualizarHabilidade(String novaHabilidade) {
        this.habilidadeEspecial = novaHabilidade;
    }

    // Sobrescrita do método
    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }
}
