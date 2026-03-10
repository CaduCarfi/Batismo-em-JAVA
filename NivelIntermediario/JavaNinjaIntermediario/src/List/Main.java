package List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Array
        // Sao estaticos, nuao alteram de tamanho
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";

        for (int i = 0; i < ninjasArray.length; i++) {
            System.out.println("Ninjas Array: " + ninjasArray[i]);
        }

        // Listas
        // Listas nao sao estaticas, elas podem aumentar ou diminuir
        List<String> ninjasList = new ArrayList<String>();
        ninjasList.add("Naruto Uzumaki"); // Index 0
        ninjasList.add("Sasuke Uchiha");  // Index 1
        ninjasList.add("Sakura Haruno");  // Index 2
        ninjasList.add("Tobirama Senju"); // Index 3

        // Adicionar na Lista
        ninjasList.add("Kakashi Hatake");

        System.out.println("Ninjas List: " + ninjasList);

        // Remover da Lista
        ninjasList.remove("Kakashi Hatake");
        System.out.println("Ninjas List: " + ninjasList);

        // Trocar Elementos
        ninjasList.set(3, "Hashirama Senju");
        System.out.println("Ninjas List: " + ninjasList);

        // Ver o tamanho da Lista
        System.out.println("Tamanho Lista: " + ninjasList.size() + " elementos");

    }
}
