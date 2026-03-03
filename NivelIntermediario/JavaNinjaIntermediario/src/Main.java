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
        String chamandoMetodo = sasuke.euSouUmNinja();
        System.out.println(chamandoMetodo);

        int quantoTempoFalta = sasuke.anosParaSeTornarHokage(70);
        System.out.println("Voce tem: " + sasuke.idade + " entao falta no minimo: " + quantoTempoFalta + " anos para se tornar Hokage");

        // Criar ninja Sakura Haruno - Sakura é um Objeto

        Ninja sakura = new Ninja();
        sakura.nome = "Sakura Haruno";
        sakura.idade = 18;
        sakura.aldeia = "aldeia da folha";
    }
}
