package lambdas;

public class CalculoTeste1 {
    public static void main(String[] args) {
        Calculo somar = new Somar();
        Calculo multiplicar = new Multiplicar();
        System.out.println("Soma: " + somar.executar(10,10));
        System.out.println("Multiplicar: " + multiplicar.executar(10,10));
        System.out.println(somar.legal());
        System.out.println(multiplicar.legal());
        System.out.println(Calculo.muitoLegal());
    }
}
