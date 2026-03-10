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
            System.out.println(ninjasArray[i]);
        }

        // Listas
        // Listas nao sao estaticas, elas podem aumentar ou diminuir
        List<String> ninjasList = new ArrayList<String>();
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");
        ninjasList.add("Tobirama Senju");

        
    }
}
