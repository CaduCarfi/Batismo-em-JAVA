package Desafio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Uchiha> listaNinjas = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n===== SISTEMA NINJA =====");
            System.out.println("1 - Adicionar Uchiha");
            System.out.println("2 - Listar Ninjas");
            System.out.println("3 - Atualizar Habilidade Especial");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Missão: ");
                    String missao = sc.nextLine();

                    System.out.print("Nível da missão: ");
                    String nivel = sc.nextLine();

                    System.out.print("Status da missão: ");
                    String status = sc.nextLine();

                    System.out.print("Habilidade Especial: ");
                    String habilidade = sc.nextLine();

                    Uchiha novo = new Uchiha(nome, idade, missao, nivel, status, habilidade);
                    listaNinjas.add(novo);

                    System.out.println("Uchiha adicionado com sucesso!");
                    break;

                case 2:
                    if (listaNinjas.isEmpty()) {
                        System.out.println("Nenhum ninja cadastrado.");
                    } else {
                        for (int i = 0; i < listaNinjas.size(); i++) {
                            System.out.println("\nNinja #" + (i + 1));
                            listaNinjas.get(i).mostrarInformacoes();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite o número do ninja para atualizar: ");
                    int indice = sc.nextInt() - 1;
                    sc.nextLine();

                    if (indice >= 0 && indice < listaNinjas.size()) {
                        System.out.print("Nova habilidade especial: ");
                        String novaHab = sc.nextLine();
                        listaNinjas.get(indice).atualizarHabilidade(novaHab);
                        System.out.println("Habilidade atualizada!");
                    } else {
                        System.out.println("Ninja inválido.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
