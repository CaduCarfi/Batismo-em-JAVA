package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
    // Tudo que for Digitado aqui dentro com o comando PSVM vai ser compilado pelo java

        /*
        *  Dados nao primitivos: String, Array, Class, enum
        * Objetivo: Criar um ninja, e atribuir metodos a ele.
        * */

        // Declarando a Variavel como NARUTO UZUMAKI
        String nome = "Naruto Uzumaki";
        String nomeEmCaixaAlta = nome.toUpperCase(); // ToUppercase vai colocar tudo em CAPSLOCK
        System.out.println("Esse texto esta em CAPSLOCK: " + nomeEmCaixaAlta);
        System.out.println("Esse texto esta normal: " + nome);

        String aldeia = "ALDEIA DA FOLHA";
        String aldeiaEmCaixaBaixa = aldeia.toLowerCase(); // ToLowercase vai colocar tudo em minusculo
        System.out.println(aldeiaEmCaixaBaixa);

    }
}
