package catalisa.lista05.parte01;

public class Conta {
    String numeroDaConta;
    String titular;
    double saldo = 0;


    public Conta(String numeroDaConta, String titular, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Conta(String numeroDaConta, String titular) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
    }
}
