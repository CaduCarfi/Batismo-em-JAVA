package Condicoes;

public class IfEElse {
    public static void main(String[] args) {

        /*
        * IF e ELSE - condições
        * ELSE IF
        * Objetivo: Passar o ninja de nivel de acordo com numero de missoes
        * */

        // Ninja naruto
        String nome = "Naruto Uzumaki";
        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 14;
        String rank;

        //se (condicao) {faca isso}

        if (numeroDeMissoes == 10 && idade > 15) {
            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennim");
        }

    }
}
