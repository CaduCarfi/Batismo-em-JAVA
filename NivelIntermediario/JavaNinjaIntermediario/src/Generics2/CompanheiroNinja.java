package Generics2;

public class CompanheiroNinja {
    private String nomeDoAnimal;

    public CompanheiroNinja(String nomeDoAnimal) {
        this.nomeDoAnimal = nomeDoAnimal;
    }

    public String getNomeDoAnimal() {
        return nomeDoAnimal;
    }

    @Override
    public String toString() {
        return "Esse é meu companheiro: " + nomeDoAnimal;
    }
}
