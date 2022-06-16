package estruturasequencial;

import java.util.Scanner;

//4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.
public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: ");
        double nota1 = input.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        double nota2 = input.nextDouble();
        System.out.println("Digite sua terceira nota: ");
        double nota3 = input.nextDouble();
        System.out.println("Digite a sua quarta nota: ");
        double nota4 = input.nextDouble();
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("De acordo com suas notas informadas sua média é: " + media);
        input.close();
    }
}
