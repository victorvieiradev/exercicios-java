package catalisa.lista03b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SomandoNumerosPositivosInteiros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um valor inteiro e positivo: ");
        int num = input.nextInt();
        while (num < 1){
            System.out.println("valor inválido, o número digitado precisa ser positivo ");
            System.out.println("Informe um valor inteiro e positivo: ");
            num = input.nextInt();
        }
        ArrayList<Integer> numerosPositivos = new ArrayList<>();
        for (int i = 0; i < num; i++){
            System.out.println((i+1) + "º valor");
            numerosPositivos.add(input.nextInt());
        }
        input.close();
        int soma = 0;
        for (int numero : numerosPositivos){
            soma += numero;
        }

        System.out.println("A soma dos valores é: " + soma);
    }
}
