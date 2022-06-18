package estruturasequencial;

import java.util.Scanner;
//10. Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a temperatura em graus celcius:");
        double c = input.nextDouble();
        double f = (c * 9/5) + 32;
        System.out.println("determinado grau informado convertendo ele o  resultado será " + f + " graus Fahrenheit");
        input.close();
    }
}
