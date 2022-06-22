package catalisa.lista02;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculadora de média aritimetica");
        System.out.println("Informe sua primeira nota: ");
        double nota1 = input.nextDouble();
        System.out.println("Informe sua segunda nota: ");
        double nota2 = input.nextDouble();
        System.out.println("Informe sua terceira nota: ");
        double nota3 = input.nextDouble();
        System.out.println("Informe sua quarta nota: ");
        double nota4 = input.nextDouble();
        input.close();
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        String msg = String.format("1º nota: %.2f \n2º nota: %.2f \n3º nota: %.2f \n4º nota: %.2f \nDeterminadas as notas informadas sua mé dia é \nMédia: %.2f", nota1, nota2, nota3, nota4, media);
        System.out.println(msg);
    }
}
