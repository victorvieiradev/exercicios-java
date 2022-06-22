package estruturasequencial;
//13. Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
//a. Para homens: (72.7*h) - 58
//b. Para mulheres: (62.1*h) - 44.7
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe sua altura em métros: ");
        double h = input.nextDouble();
        double pesoIdealHomens = (72.7*h) - 58;
        double pesoIdealMulheres = (62.1*h) - 44.7;
        input.close();
        System.out.printf("Se você for homem o seu peso ideal é: %.2f \nSe você for mulher o seu peso ideal é: %.2f", pesoIdealHomens, pesoIdealMulheres);
    }
}
