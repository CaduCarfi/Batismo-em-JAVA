package AnaliseDaComplexidadeAlgoritmos;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        long inicio;
        long fim;
        long tempo;

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // O(n) - Linear
        for (int i = 0; i < 500; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // O(1) - Constante
        int a = 1;
        int b = 1;
        int solucao = a + b;

        // O(1) - Constante
        int solucaoMultiplicacao = (a + b) * 500;

        // Verificar o numero no index do ARRAYLIST
        inicio = System.nanoTime();
        arrayList.remove(250);

        fim = System.nanoTime();
        tempo = fim - inicio;
        System.out.println("Tempo Array List: " + tempo + "ns");

        tempo = 0;

        // Verificar o numero do index do LINKEDLIST
        inicio = System.nanoTime();
        linkedList.remove(250);

        fim = System.nanoTime();
        tempo = fim - inicio;
        System.out.println("Tempo Linked List: " + tempo + "ns");

    }
}
