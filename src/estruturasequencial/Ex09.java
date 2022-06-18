package estruturasequencial;

import java.util.Scanner;

//9. Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
//C = 5 * ((F-32) / 9).
public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Fahrenheit: ");
        double F = input.nextDouble();
        double C = 5 * ((F-32) / 9);
        System.out.println("Determinado o grau informado convertendo ele o resultado será " + C + " graus celcius.");
        input.close();
    }
}
