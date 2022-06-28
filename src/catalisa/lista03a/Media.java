package catalisa.lista03a;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe sua primeira nota: ");
        double nota1 = input.nextDouble();
        while (nota1 < 0 || nota1 > 10){
            System.out.println("Sua nota está inválida, digite um valor entre 0 e 10");
            System.out.println("Informe sua primeira nota: ");
            nota1 = input.nextDouble();
        }
        System.out.println("Informe sua segunda nota: ");
        double nota2 = input.nextDouble();
        while (nota2 < 0 || nota2 > 10){
            System.out.println("Sua nota está inválida, digite um valor entre 0 e 10");
            System.out.println("Informe sua segunda nota: ");
            nota2 = input.nextDouble();
        }
        double media = (nota1 + nota2) / 2;
        if (media == 10){
            System.out.printf("suas notas foram: \n 1º nota %.2f \n 2º nota %.2f \n Média %.2f \n", nota1, nota2, media);
            System.out.println("Aprovado com distinção!");
        }else if (media >= 7){
            System.out.printf("suas notas foram: \n 1º nota %.2f \n 2º nota %.2f \n Média %.2f \n", nota1, nota2, media);
            System.out.println("Aprovado");
        }else {
            System.out.printf("suas notas foram: \n 1º nota %.2f \n 2º nota %.2f \n Média %.2f \n", nota1, nota2, media);
            System.out.println("Reprovado!");
        }
    }
}
