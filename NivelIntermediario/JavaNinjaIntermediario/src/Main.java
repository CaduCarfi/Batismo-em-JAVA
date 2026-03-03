public class Main {
    public static void main(String[] args) {
        // Criar o ninja Naruto - Naruto é um Objeto

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 18;
        naruto.aldeia = "aldeia da folha";
        naruto.ModoSabioAtivado();

        // Criar ninja Sasuke Uchiha - Sasuke é um Objeto

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke uchiha";
        sasuke.idade = 18;
        sasuke.aldeia = "aldeia da folha";

        // Aplicando metodos aos meus Objetos
        sasuke.SharinganAtivado();

        // Criar ninja Sakura Haruno

        Haruno sakura = new Haruno();
        sakura.nome = "Sakura Haruno";
        sakura.idade = 18;
        sakura.aldeia = "aldeia da folha";
        sakura.AtivarCura();

        // Criar ninja Hinata Hyuga

        Hyuga hinata = new Hyuga();
        hinata.nome = "Hinata Hyuga";
        hinata.idade = 18;
        hinata.aldeia = "aldeia da folha";
        hinata.AtivarByakugan();
    }
}
