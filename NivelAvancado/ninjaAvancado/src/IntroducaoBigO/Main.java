package IntroducaoBigO;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // O que é um Algoritmo
        int a = 1;
        int b = 1;
        int c = 2;
        int d = 3;
        int resultado = (a * b) - (c - d);

        /*
        * Algoritmo é tudo que fazemos na programação
        * */

        ArrayList<Ninjas> ninjas = new ArrayList<>();
        ninjas.add(new Ninjas("Naruto Uzumaki", 17));
        ninjas.add(new Ninjas("Sasuke Uchiha", 17));
        ninjas.add(new Ninjas("Sakura Haruno", 17));

        // Algoritmo - o(1) - Complexidade Constante
        System.out.println( ninjas.get(1));

        // Algoritmo - o(n) - Complexidade Linear
        //for (Ninjas ninja : ninjas) {
        //    System.out.println(ninja);
        //}

        System.out.println("==================");

        // o(n²) - Complexidade Quadratica
        for (int i = 0; i < ninjas.size(); i++) {
            for (int j = 0; j < ninjas.size(); j++) {
                System.out.println( ninjas.get(i) + " vs " +  ninjas.get(j));
            }
        }
    }
}
