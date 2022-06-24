package catalisa.lista03b;

import java.util.Scanner;

public class MenorValoreMaiorValor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] valores = new  double[10];
        double maior = 0;
        double menor = 0;
        for (int i = 0; i < valores.length; i++){
            System.out.println((i+1) + "º valor");
            valores[i] = input.nextDouble();
            if (i == 0){
                maior = valores[i];
                menor = valores[i];
            }else {
                if (valores[i] < menor){
                    menor = valores[i];
                }
                if (valores[i] > maior){
                    maior = valores[i];
                }
            }
        }
        input.close();
        System.out.println("O menor valor é " + menor + "\nO maior valor é " + maior);
    }
}