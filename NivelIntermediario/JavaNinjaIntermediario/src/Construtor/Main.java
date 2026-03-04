package Construtor;

public class Main {
    public static void main(String[] args) {

        Hokages hashirama = new Hokages();
        hashirama.idade = 45;

        Hokages tobirama = new Hokages("Tobirama Senju");
        System.out.println(tobirama.nome);

        Hokages hiruzen = new  Hokages(40);
        System.out.println(hiruzen.idade);

        Hokages minato = new  Hokages("Minato Namikaze", 32, false);
        System.out.println(minato.nome);
    }
}
