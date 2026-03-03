public class Ninja {

    String nome;
    int idade;
    String aldeia;

    // Criar um metodo publico personalizado

    /*
    * O metodo VOID nao retorna valor nenhum
    * */
    //public void SharinganAtivado() {
    //    System.out.println("Meu nome é " + nome + " O Sharingan Ativou, eu sou um Uchiha!");
    //}

    /*
    * Metodo String vai ter que retornar uma String
    * */
    public String euSouUmNinja() {
        return "Oi, eu sou um Ninja!";
    }

    /*
    * Metodo Int vai ter que retornar Int
    * */
    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage) {
        return idadeMinimaParaSerHokage - idade;
    }
}
