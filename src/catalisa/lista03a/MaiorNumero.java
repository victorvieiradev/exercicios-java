package catalisa.lista03a;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        double num1 = input.nextDouble();
        System.out.println("Informe o segundo número: ");
        double num2 = input.nextDouble();
        input.close();
        if (num1 == num2){
            System.out.printf("%.2f e %.2f são iguais.", num1, num2);
        }else if (num1 > num2){
            System.out.printf("O maior número digitado é %.2f", num1);
        }else {
            System.out.printf("O maior número digitado é: %.2f", num2);
        }

    }
}
