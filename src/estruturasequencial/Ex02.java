package estruturasequencial;

import java.util.Scanner;

//2. Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número:");
        double numero = input.nextDouble();
        System.out.println("O número digitado foi: " + numero);
        input.close();
    }
}
