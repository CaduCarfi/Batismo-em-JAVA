package Queue;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Array
        String[] ninjasArray = new String[6];

        // Listas
        List<String> ninjasList = new ArrayList<String>();

        // Stack
        Stack<String> ninjasStack = new Stack<String>();

        // QUEUE / FILAS
        Queue<String> ninjasQueue = new LinkedList<String>();
        ninjasQueue.add("Naruto Uzumaki");
        ninjasQueue.add("Sasuke Uchiha");
        ninjasQueue.add("Sakura Haruno");
        ninjasQueue.add("Kakashi Hatake");
        ninjasQueue.add("Shikamaru Nara");

        // Mostrar a fila
        System.out.println("Ninjas na fila: " + ninjasQueue);

        // Tirar um ninja da fila
        ninjasQueue.poll();
        System.out.println("Ninjas na fila depois do poll: " + ninjasQueue);

        // Como ver quem é o primeiro;
        System.out.println("Primeiro da Queue: " + ninjasQueue.peek());

        // Adicionar a fila
        ninjasQueue.add("Hashirama Senju");
        ninjasQueue.add("Tobirama Senju");
        System.out.println("Ninjas na fila: " + ninjasQueue);

        // Nao da pra deletar o tail

        // Esvaziar fila
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        System.out.println("Ninjas na fila: " + ninjasQueue);

        // Verificar se esta vazia
        if (ninjasQueue.isEmpty()) {
            System.out.println("A fila esta vazia");
        }


    }
}
