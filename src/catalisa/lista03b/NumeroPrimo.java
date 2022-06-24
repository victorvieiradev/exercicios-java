package catalisa.lista03b;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        int total = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número para sabermos se ele é primo: ");
        double numero = input.nextDouble();
        input.close();
        for (int i = 1; i <= numero; i++){
            if (numero % i == 0){
                total += 1;
            }
        }
        if (total == 2){
            System.out.println(numero + " é primo");
        }else {
            System.out.println(numero + " não é primo");
        }
    }
}
