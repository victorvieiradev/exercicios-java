package catalisa.lista03b;

import java.util.Scanner;

public class CalcularFatorialDeUmNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número para saber o seu fatorial: ");
        int n = input.nextInt();
        int c = n;
        int f = 1;
        while (c > 0){
            f *= c;
            c -= 1;

        }
        input.close();
        System.out.printf("O fatorial de %d é %d", n, f);
    }
}
