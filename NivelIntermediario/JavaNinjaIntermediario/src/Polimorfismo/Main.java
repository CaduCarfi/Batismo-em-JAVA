package Polimorfismo;

public class Main {
    public static void main(String[] args) {

        // Obj ninja nao pode ser criado
        // Obj Uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 17;
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        // Obj Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 17;
        sasuke.habilidadeEspecial();

        // Obj Uchiha 2
        Uchiha itachi = new Uchiha("Itachi Uchiha", 27, "Aldeia da Folha");
        itachi.habilidadeEspecial();
    }
}
