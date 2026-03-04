package Herança;

public class Main {
    public static void main(String[] args) {
        // Criar o ninja Naruto - Naruto é um Objeto

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Herança.Uzumaki";
        naruto.idade = 18;
        naruto.aldeia = "aldeia da folha";
        naruto.ModoSabioAtivado();

        // Criar ninja Sasuke Herança.Uchiha - Sasuke é um Objeto

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke uchiha";
        sasuke.idade = 18;
        sasuke.aldeia = "aldeia da folha";

        // Aplicando metodos aos meus Objetos
        sasuke.SharinganAtivado();

        // Criar ninja Sakura Herança.Haruno

        Haruno sakura = new Haruno();
        sakura.nome = "Sakura Herança.Haruno";
        sakura.idade = 18;
        sakura.aldeia = "aldeia da folha";
        sakura.AtivarCura();

        // Criar ninja Hinata Herança.Hyuga

        Hyuga hinata = new Hyuga();
        hinata.nome = "Hinata Herança.Hyuga";
        hinata.idade = 18;
        hinata.aldeia = "aldeia da folha";
        hinata.AtivarByakugan();

        Boruto boruto = new Boruto();
        boruto.nome = "Boruto Hyuga Uzumaki";
        boruto.idade = 9;
        boruto.aldeia = "aldeia da folha";
        boruto.ModoSabioAtivado();
        boruto.AtivarOKarma();
        boruto.AtivarJougan();
    }
}
