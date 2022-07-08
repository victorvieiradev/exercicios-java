package catalisa.lista05.parte02.jardinagem;

public class Caixa {
    public double saldo;
    public double credito;
    public double valor;

    public Caixa(double saldo, double credito) {
        this.saldo = saldo;
        this.credito = credito;
    }

    public void credito(double valor) {
        this.credito -= valor;
    }
    public void debito(double valor) {
        this.saldo -= valor;
    }

    public void extrato() {
        System.out.println("valor disponível no crédito: " + this.credito);
        System.out.println("Valor disponível no débito: " + this.saldo);
    }
}
