package estruturasequencial;

import java.util.Scanner;

//12. Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58
public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a sua altura:");
        double altura = input.nextDouble();
        double peso = (72.7*altura) - 58;
        System.out.println("Dado sua altura informado o seu peso ideal seria de: " + peso + "kg");
        input.close();
    }
}
