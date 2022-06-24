package catalisa.lista03b;

public class SomandoNumerosImpares {
    public static void main(String[] args) {
        int tot = 0;
        double soma = 0;
        int c = 1;
        while (tot <= 50){
            if ( c % 2 == 1){
                System.out.println(c + " é um valor impar");
                tot++;
                soma += c;
            }
            c++;
        }
        System.out.println("A soma de todos os 50 números impares é " + soma);
    }
}
