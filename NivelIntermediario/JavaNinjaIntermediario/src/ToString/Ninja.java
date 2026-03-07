package ToString;

public class Ninja {

    String nome;
    String aldeia;
    int idade;

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Meu nome é " + nome  + ", Sou da " + aldeia + ", E tenho " + idade + " anos";
    }
}
