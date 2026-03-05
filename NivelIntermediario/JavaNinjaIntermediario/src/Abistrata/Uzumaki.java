package Abistrata;

import java.sql.SQLOutput;

public class Uzumaki extends Ninja implements NinjaInterface {

    @Override
    public void nomeDoNinja() {
        System.out.println("Meu nome é " + nome);
    }

    @Override
    public void tacarKunai() {
        System.out.println("Eu taquei uma Kunai");
    }

    @Override
    public void tacarUmaShuriken() {
        System.out.println("Eu taquei uma Shuriken");
    }
}
