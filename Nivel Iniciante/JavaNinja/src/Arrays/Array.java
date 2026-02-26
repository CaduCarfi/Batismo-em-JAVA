package Arrays;

public class Array {
    public static void main(String[] args) {

        /*
        * String ninja1 = "Naruto Uzumaki";
        *  String ninja2 = "Sasuke Uchiha";
        *  String ninja3 = "Sakura Haruno";
        * */

        // Arrays sao tipos referencias

        // String inicializa como null
        String[] ninja = new String[6];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hatake";
        System.out.println(ninja[5]);

        // Int inicializa como 0
        int[] idade = new int[2];
        idade[0] = 16;
        System.out.println(idade[1]);

        // Boolean inicializa como false
        boolean[] verdadeiroOuFalso = new boolean[1];
        System.out.println(verdadeiroOuFalso[0]);

        // Double inicializa como 0.0
        double[] flutuante = new double[1];
        System.out.println(flutuante[0]);


    }
}
