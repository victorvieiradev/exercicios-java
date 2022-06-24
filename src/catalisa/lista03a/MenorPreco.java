package catalisa.lista03a;

import java.util.Scanner;

public class MenorPreco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] precoProdutos = new double[3];
        double menorPreço = 0;
        for (int i = 0; i < precoProdutos.length; i++){
            System.out.println((i+1) + "º Preço: R$");
            precoProdutos[i] = input.nextDouble();
            if(i == 0){
                menorPreço = precoProdutos[i];
            }else {
                if (precoProdutos[i] < menorPreço){
                    menorPreço = precoProdutos[i];
                }
            }
        }
        input.close();
        System.out.println("Determinado os preços informado você deverá comprar os que contem o menor preço \nAnalisando os valores informado o menor preço é R$" + menorPreço);
    }
}
