package HerancaMultipla;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface, HokageInterface {

    public void BoasVindas() {
        System.out.println(nome + ": Eu sou um Hatake");
    }

    //Metodo da Interface
    public void sharinganAtivado() {
        System.out.println(nome + ": Ativou o Sharingan");
    }

    public void ninjaDeElite() {
        System.out.println(nome + ": Eu sou um Ninja de Elite da ANBU");
    }

    public void hokageAtivo() {
        System.out.println(nome + ": Eu sou um Hokage");
    }

}
