package lambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {
        Calculo somar = (a, b) -> { return  a + b; };
        System.out.println("Soma: " + somar.executar(10, 10));
        Calculo multiplicar = (x, y) -> { return x*y;};
        System.out.println("Multiplicando: " + multiplicar.executar(10, 10));
        Calculo dividir = (x, y) -> x / y;
        System.out.println("Dividindo " + dividir.executar(20,10));
        System.out.println(Calculo.muitoLegal());

    }
}
