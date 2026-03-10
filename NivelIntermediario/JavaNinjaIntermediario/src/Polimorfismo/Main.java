package Polimorfismo;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println("------------------ Naruto Uzumaki ------------------");

        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", 18, "Aldeia da Folha", 25, NivelNinja.GENIN, Biju.KURAMA);
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();
        naruto.tacarKunai();
        System.out.println(naruto.biju);

        System.out.println("------------------ Sasuke Uchiha ------------------");

        Uchiha sasuke = new Uchiha("Sasuke Uchiha", 18, "Aldeia da Folha", 20, NivelNinja.GENIN);
        sasuke.habilidadeEspecial();

        System.out.println("------------------ Itachi Uchiha ------------------");

        Uchiha itachi = new Uchiha("Itachi Uchiha", 27, "Aldeia da Folha", 60, NivelNinja.JOUNIN);
        itachi.habilidadeEspecial();
        itachi.metodoProvisorio();

        System.out.println("------------------ Madara Uchiha ------------------");

        Uchiha madara = new Uchiha("Madara Uchiha", 45, "Aldeia da Folha", 999, NivelNinja.KAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalhaNinja();
        madara.inteligenciaDeCombate();
        madara.inteligenciaDeCombate(180);

    }

}
