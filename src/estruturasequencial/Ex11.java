package estruturasequencial;

import java.util.Scanner;

//11. Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
//a. o produto do dobro do primeiro com metade do segundo .
//b. a soma do triplo do primeiro com o terceiro.
//c. o terceiro elevado ao cubo.
public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um valor inteiro: ");
        int n1 = input.nextInt();
        System.out.println("Digite outro valor inteiro: ");
        int n2 = input.nextInt();
        System.out.println("Informe um número real: ");
        double n3 = input.nextDouble();
        double primeiro = (n1 * 2) + n2 / 2;
        double segundo = (n1 * 3) + n3;
        double terceiro = n3*n3*n3;
        System.out.println("O resultado das operações será: " + primeiro + ", " + segundo + ", " + terceiro);
        input.close();
    }
}
