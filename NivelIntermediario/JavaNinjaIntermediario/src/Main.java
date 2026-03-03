public class Main {
    public static void main(String[] args) {
        // Criar o ninja Naruto - Naruto é um Objeto

        Ninja naruto = new Ninja();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 18;
        naruto.aldeia = "aldeia da folha";

        // Criar ninja Sasuke Uchiha - Sasuke é um Objeto

        Ninja sasuke = new  Ninja();
        sasuke.nome = "Sasuke uchiha";
        sasuke.idade = 18;
        sasuke.aldeia = "aldeia da folha";

        // Aplicando metodos aos meus Objetos
        sasuke.SharinganAtivado();

        // Criar ninja Sakura Haruno - Sakura é um Objeto

        Ninja sakura = new Ninja();
        sakura.nome = "Sakura Haruno";
        sakura.idade = 18;
        sakura.aldeia = "aldeia da folha";
    }
}
