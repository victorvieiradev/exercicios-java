package catalisa.lista03b;

import java.util.Scanner;

public class SomandoNumerosInteiroECalculandoMedia {
    public static void main(String[] args) {
        int soma = 0;
        double media = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a quantidade de valores para somar e calcular a média: ");
        int quantidade = input.nextInt();
        int[] numeros = new  int[quantidade];
        for (int i = 0; i < numeros.length; i++){
            System.out.println((i+1) + "º valor");
            numeros[i] = input.nextInt();
        }
        input.close();
        for (int numero : numeros){
            soma += numero;
        }
        media = soma / quantidade;
        System.out.println("a soma dos valores inseridos é: " + soma + " já a média é " + media);
    }
}
