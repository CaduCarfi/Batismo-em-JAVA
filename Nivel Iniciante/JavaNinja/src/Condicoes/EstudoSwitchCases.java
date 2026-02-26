package Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {

        /*
        * SwitchCases: Que servem para gerar casos especificos
        * Objetivo: Pedir pro usuario escolher entre os Ninjas
        * switchCase
        * */

        // Pedir para o usuario
        Scanner scanner = new Scanner(System.in);

        // Mostrar opções para o usuario
        System.out.println("Escolha um Personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        // Pedir para o usuario escolher uma das opções
        int escolhaDoUsuario = scanner.nextInt();

        System.out.println("Voce digitou o numero: " + escolhaDoUsuario);

        // Reação ao escolher um personagem

        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("Naruto Uzumaki");
                break;
            case 2:
                System.out.println("Sasuke Uchiha");
                break;
            case 3:
                System.out.println("Sakura Haruno");
                break;
            default:
                System.out.println("Voce nao digitou uma resposta valida! tente denovo ");
                break;
        }

        scanner.close();
    }
}
