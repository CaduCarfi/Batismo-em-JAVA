package ArrayxListxStack;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Arrays sao estaticos
        // Exigem tamanho pré definido
        System.out.println("----------------- ARRAYS -----------------");
        String[] nomeNinjaArray = new String[3];
        nomeNinjaArray[0] = "Naruto Uzumaki";
        nomeNinjaArray[1] = "Sasuke Uchiha";
        nomeNinjaArray[2] = "Sakura Haruno";

        System.out.println("nomeNinjaArray: " + nomeNinjaArray);
        System.out.println("nomeNinjaArray: " + nomeNinjaArray[0]);

        // Listas sao dinamicas
        // Aumentam e diminuem de tamanho conforme precisamos
        // Lista é um pouco mais lenta em comparação com Array
        System.out.println("----------------- LISTAS -----------------");
        List<String> nomeNinjaList = new ArrayList<>();
        nomeNinjaList.add("Naruto Uzumaki");
        nomeNinjaList.add("Sasuke Uchiha");
        nomeNinjaList.add("Sakura Haruno");
        nomeNinjaList.add("Itachi Uchiha");
        nomeNinjaList.add("Madara Uchiha");
        System.out.println("nomeNinjaList: " + nomeNinjaList);

        // Stacks sao unicos
        // Exigem uma ordem! O ultimo a entrar é o primeiro a sair!
        System.out.println("----------------- STACKS -----------------");
        Stack<String> nomeNinjaStack = new Stack<>();
        nomeNinjaStack.push("Naruto Uzumaki");
        nomeNinjaStack.push("Sasuke Uchiha");
        nomeNinjaStack.push("Sakura Haruno");
        System.out.println("Mostrar Stack: " + nomeNinjaStack);
        System.out.println("Tirar do Stack: " + nomeNinjaStack.pop());
        System.out.println("Mostrar Stack: " + nomeNinjaStack);
        System.out.println("Tirar do Stack: " + nomeNinjaStack.pop());
        System.out.println("Mostrar Stack: " + nomeNinjaStack);
        nomeNinjaStack.push("Kakashi Hatake");
        System.out.println("Mostrar Stack: " + nomeNinjaStack);
        System.out.println("Ninja no topo (sem remover): " + nomeNinjaStack.peek());
        System.out.println("Mostrar Stack: " + nomeNinjaStack);
    }
}
