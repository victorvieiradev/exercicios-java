package catalisa.lista05.parte01;

public class PessoaMain {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Victor", 15, 65.30, 1.67);
        p1.envelhecer();
        p1.engordar(2);
        p1.emagrecer(1);
        p1.pessoaApresentar();

        p1.pessoaApresentar();
    }
}
