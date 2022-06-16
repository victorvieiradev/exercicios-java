package estruturasequencial;

import java.util.Scanner;

//3. Faça um Programa que peça dois números e imprima a soma.
public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Informe o primeiro valor: ");
        double numero1 = input.nextDouble();
        System.out.println("Informe o segundo valor: ");
        double numero2 = input.nextDouble();
        double soma = (numero1 + numero2);

        System.out.println("A soma dos valores informado é: " + soma);
        input.close();
    }
}
