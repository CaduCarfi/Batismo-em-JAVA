package Streams;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Ninja> ninjas = new ArrayList<>();
        ninjas.add(new Ninja("Naruto Uzumaki", "Konoha", 14));
        ninjas.add(new Ninja("Sasuke Uchiha", "Konoha", 47));
        ninjas.add(new Ninja("Sakura Haruno", "Konoha", 9));
        ninjas.add(new Ninja("Kakashi Hatake", "Konoha", 30));
        ninjas.add(new Ninja("Gaara", "Suna", 28));
        ninjas.add(new Ninja("Temari", "Suna", 39));
        ninjas.add(new Ninja("Rock Lee", "Konoha", 57));

        // .stream
        // filtragem dos ninjas por vila
        ninjas.stream()
                .filter(ninja -> ninja.getVila().equals("Konoha"))
                .forEach(System.out::println) // soutc
        ;

        System.out.println("=======================");

        // ordenação
        ninjas.stream()
                .sorted((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .forEach(System.out::println)
        ;

        System.out.println("=======================");

        // ordenação por nome
        ninjas.stream()
                .sorted((n1, n2) -> String.CASE_INSENSITIVE_ORDER.compare(n1.getNome(), n2.getNome()))
                .forEach(System.out::println)
        ;

    }
}
