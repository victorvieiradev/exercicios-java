package catalisa.lista05.parte02.caixa;

import java.util.Scanner;

public class CaixaMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lembramos que não aceitamos valores igual o abaixo de zero.");
        System.out.println("Quantos lançamentos deseja: ");
        int lancamentos = input.nextInt();
        while (lancamentos<=0){
            System.out.println("valor inválido, digite novamente:");
            lancamentos = input.nextInt();
        }
        Caixa caixa = new Caixa(1000, 1000);
        for (int i = 1; i <= lancamentos; i++){
            System.out.println(i + "º valor:");
            caixa.valor = input.nextDouble();
            while (caixa.valor<=0){
                System.out.println("valor inválido, tente novamente");
                caixa.valor = input.nextDouble();
    }

            System.out.println("Sua operação será no credito ou no débito? \n 1 para crédito ou 2 para débito");
            int resp = input.nextInt();
            if (resp == 1){
                caixa.credito(caixa.valor);
            }else if (resp == 2){
                caixa.debito(caixa.valor);
            }

        }
        caixa.extrato();
        input.close();
    }
}
