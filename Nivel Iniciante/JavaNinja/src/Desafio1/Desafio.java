package Desafio1;

public class Desafio {
    public static void main(String[] args) {

        System.out.println("--------------------------------------------");
        //Ninja 1
        String ninja1 = "Naruto";
        int idadeN1 = 16;
        String missaoN1 = "Pegar um Bandido";
        char nivelDificuldadeN1 = 'D';
        String statusDaMissao1 = "Em Andamento";

        // Verificar nivel da missao e idade do Ninja
        if (idadeN1 < 15) {
            if (nivelDificuldadeN1 == 'C' || nivelDificuldadeN1 == 'D') {
                statusDaMissao1 = "Concluido";
            } else {
                statusDaMissao1  = "Não Concluido, idade insuficiente";
            }
        } else {
            statusDaMissao1 = "Concluido";
        }

        System.out.println("Ninja : " + ninja1);
        System.out.println("Idade: " + idadeN1);
        System.out.println("Missao: " + missaoN1);
        System.out.println("Nivel dificuldade: " + nivelDificuldadeN1);
        System.out.println("Status da Missao: " + statusDaMissao1);

        System.out.println("--------------------------------------------");

        //Ninja 2
        String ninja2 = "Shikamaru";
        int idadeN2 = 16;
        String missaoN2 = "Espionar inimigos";
        char nivelDificuldadeN2 = 'D';
        String statusDaMissao2 = "Em Andamento";

        // Verificar nivel da missao e idade do Ninja
        if (idadeN2 < 15) {
            if (nivelDificuldadeN2 == 'C' || nivelDificuldadeN2 == 'D') {
                statusDaMissao2 = "Concluido";
            } else {
                statusDaMissao2  = "Não Concluido, idade insuficiente";
            }
        } else {
            statusDaMissao2 = "Concluido";
        }

        System.out.println("Ninja : " + ninja2);
        System.out.println("Idade: " + idadeN2);
        System.out.println("Missao: " + missaoN2);
        System.out.println("Status da Missao: " + statusDaMissao2);
        System.out.println("Nivel dificuldade: " + nivelDificuldadeN2);

        System.out.println("--------------------------------------------");

        //Ninja 3
        String ninja3 = "Jiraya";
        int idadeN3 = 47;
        String missaoN3 = "Ir atras de Pain";
        char nivelDificuldadeN3 = 'S';
        String statusDaMissao3 = "Em Andamento";

        // Verificar nivel da missao e idade do Ninja
        if (idadeN1 < 15) {
            if (nivelDificuldadeN3 == 'C' || nivelDificuldadeN3 == 'D') {
                statusDaMissao3 = "Concluido";
            } else {
                statusDaMissao3  = "Não Concluido, idade insuficiente";
            }
        } else {
            statusDaMissao3 = "Concluido";
        }

        System.out.println("Ninja : " + ninja3);
        System.out.println("Idade: " + idadeN3);
        System.out.println("Missao: " + missaoN3);
        System.out.println("Status da Missao: " + statusDaMissao3);
        System.out.println("Nivel dificuldade: " + nivelDificuldadeN3);

        System.out.println("--------------------------------------------");

        if (nivelDificuldadeN1 <= 15) {
      //      System.out.println(ninja1 + "Missao concluida"
        }
    }
}
