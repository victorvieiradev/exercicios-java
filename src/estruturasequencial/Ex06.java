package estruturasequencial;

import java.util.Scanner;

//6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual é o raio do círculo: ");
        double r = input.nextDouble();
        double a = Math.PI * r * r;
        System.out.println("Dado o raio informado a área do seu círculo é: " + a);
        input.close();
    }
}
