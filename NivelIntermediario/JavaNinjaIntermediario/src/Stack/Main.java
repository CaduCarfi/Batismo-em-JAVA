package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Array
        // Sao estaticos e tem referencia de memoria
        String[] ninjaArray = new String[3];
        ninjaArray[0] = "Naruto Uzumaki";

        // Listas
        // Sao dinamicas e tamanho aumenta e diminui conforme precisa
        List<String> ninjaList = new ArrayList<>();
        ninjaList.add("Naruto Uzumaki");

        // Stack
        // O ultimo elemento que entrou é obrigatoriamente o primeiro a sair
        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.add("Naruto Uzumaki");
        System.out.println("Minha Stack Atual: " + ninjaStack);
        ninjaStack.push("Sasuke Uchiha");
        ninjaStack.push("Sakura Haruno");
        ninjaStack.push("Hinata Hyuga");
        ninjaStack.push("Kakashi Hatake");
        System.out.println("Minha Stack Atual: " + ninjaStack);
        ninjaStack.pop();
        System.out.println("Minha Stack Atualizada com POP: " + ninjaStack);
        System.out.println("Minha Stack com proximo elemento do Topo: " + ninjaStack.peek());
        System.out.println("Tamanho da Stack: " + ninjaStack.size() + " elementos.");

    }
}
