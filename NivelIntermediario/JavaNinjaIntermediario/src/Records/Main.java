package Records;

public class Main {
    public static void main(String[] args) {

        Ninja cadastro = new Ninja("Naruto Uzumaki", "naruto@email.com", 999999999);
        System.out.println("Cadastro do Ninja: " + cadastro);
        System.out.println("Nome Cadastro: " + cadastro.getNome());

        NinjaRecord cadastroUsandoRecord = new NinjaRecord("Sasuke Uchiha", "sasuke@email.com", 111111111);
        System.out.println("Cadastro do Record: " + cadastroUsandoRecord.emailCaixaAlta());
        System.out.println("Nome Cadastro Record: " + cadastroUsandoRecord.nome());
    }
}
