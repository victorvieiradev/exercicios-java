package catalisa.lista05.parte01;

public class ContaMain {
    public static void main(String[] args) {
        Conta c1 = new Conta("1234", "Victor Vieira", 1000);
        System.out.println("Número da conta: " + c1.numeroDaConta);
        System.out.println("Nome do titular: " + c1.titular);
        System.out.println("Saldo: " + c1.saldo);
        Conta c2 = new Conta("1345", "Gabriel");
        System.out.println("Número da conta: " + c2.numeroDaConta);
        System.out.println("Nome do titular: " + c2.titular);
        System.out.println("Saldo: " + c2.saldo);
    }
}
