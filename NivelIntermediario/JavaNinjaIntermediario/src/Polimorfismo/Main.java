package Polimorfismo;

public class Main {
    public static void main(String[] args) {

        // Obj ninja nao pode ser criado
        // Obj Uzumaki
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", 18, "Aldeia da Folha", 25, NivelNinja.GENIN);
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();
        naruto.tacarKunai();

        // Obj Uchiha
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", 18, "Aldeia da Folha", 20, NivelNinja.GENIN);
        sasuke.habilidadeEspecial();

        // Obj Uchiha 2
        Uchiha itachi = new Uchiha("Itachi Uchiha", 27, "Aldeia da Folha");
        itachi.habilidadeEspecial();
        itachi.metodoProvisorio();

        // Obj Uchiha 3
        Uchiha madara = new Uchiha("Madara Uchiha", 45, "Aldeia da Folha", 999, NivelNinja.KAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalhaNinja();
        // Metodo comum
        madara.inteligenciaDeCombate();
        // Metodo Sobrecarregado
        madara.inteligenciaDeCombate(180);

        // Teste classe FINAL
        Anbu ninjaAnbu = new Anbu();
        ninjaAnbu.nome  = "Ninja Aleatorio";
    }
}
