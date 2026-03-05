package Polimorfismo;

public class Main {
    public static void main(String[] args) {

        // Obj ninja nao pode ser criado
        // Obj Uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        // Obj Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.habilidadeEspecial();
    }
}
