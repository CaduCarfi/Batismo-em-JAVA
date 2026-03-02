package Desafio2;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] nomeNinjas = new String[2];
        int opcao;


        do {


            System.out.println("Bem vindo ao cadastro de ninjas!");
            System.out.println("1 - Cadastrar Ninja");
            System.out.println("2 - Mostrar Ninjas");
            System.out.println("3 - Sair");


            opcao = sc.nextInt();
            sc.nextLine();


            switch (opcao) {


                case 1:
                    for (int i = 0; i < nomeNinjas.length; i++) {


                        if (nomeNinjas[i] != null) {
                            System.out.println("Nao tem mais espaco para cadastrar ninjas");
                            break;
                        }


                        System.out.print("Digite o nome do ninja: ");
                        nomeNinjas[i] = sc.nextLine();
                        System.out.println("Ninja cadastrado com sucesso!");


                        System.out.print("Deseja cadastrar mais ninjas? (s/n): ");
                        if (!sc.nextLine().equalsIgnoreCase("s")) {
                            break;
                        }
                    }
                    break;


                case 2:
                    boolean vazio = true;


                    for (int i = 0; i < nomeNinjas.length; i++) {
                        if (nomeNinjas[i] != null) {
                            vazio = false;
                            System.out.println("Ninja cadastrado: " + nomeNinjas[i]);
                        }
                    }


                    if (vazio) {
                        System.out.println("Nenhum ninja cadastrado!");
                    }
                    break;


                case 3:
                    System.out.println("Saindo...");
                    break;


                default:
                    System.out.println("Opcao invalida!");
            }


        } while (opcao != 3);
        sc.close();
    }
}
