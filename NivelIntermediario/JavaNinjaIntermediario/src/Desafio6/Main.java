package Desafio6;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // Iniciar uma Linked List com 7 ninjas
        LinkedList<Ninja> listDeNinjas = new LinkedList<>();

        // Adicionar Ninjas na Lista
        listDeNinjas.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        listDeNinjas.add(new Ninja("Gaara", 17, "Areia"));
        listDeNinjas.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Temari", 18, "Areia"));

        // Listar Ninjas
        System.out.println("----- Lista de Ninjas -----");

        // Complexidade o(n)
        for (Ninja ninja : listDeNinjas) {
            System.out.println(ninja);
        }

        // Adicionar o ninja no inicio da lista
        listDeNinjas.addFirst(new Ninja("Boruto Uzumaki", 9, "Konoha"));

        System.out.println("======================== Ninja Removido ========================");

        // Remover o ninja do inicio da lista
        Ninja removido = listDeNinjas.removeFirst();
        System.out.println("Ninja removido: " + removido);

        System.out.println("======================== Mudanças ========================");

        // Listar os ninjas
        for (Ninja listaDeNinjasAtualizada : listDeNinjas) {
            System.out.println("Lista de ninjas depois das mudanças: " + listaDeNinjasAtualizada);
        }

        // Procurar um ninja por indice
        Ninja terceiroNinja = listDeNinjas.get(3);
        System.out.println("Terceiro ninja: " + terceiroNinja);

    }
}
