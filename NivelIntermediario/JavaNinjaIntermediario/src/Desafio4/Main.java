package Desafio4;

public class Main {
    public static void main(String[] args) {
        NinjaBasico Konohamaru = new NinjaBasico("Konohamaru", 13, "Jutsu Sexy");
        NinjaAvancado Naruto = new NinjaAvancado("Naruto", 17, "Ar", "Hasengan");

        Konohamaru.mostrarInformacoes();
        Konohamaru.executarHabilidade();

        System.out.println();

        Naruto.mostrarInformacoes();
        Naruto.executarHabilidade();
    }
}
