package estruturasequencial;

import java.util.Scanner;

//7. Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o valor de qualquer lado do seu quadrado: ");
        double lado = input.nextDouble();
        double area = lado *lado;
        double dobro = area*2;
        System.out.println("O valor da sua área é: " + area + "\nJá o dobro dela é: " + dobro);
        input.close();
    }
}
