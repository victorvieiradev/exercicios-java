package catalisa.lista05.parte01;

import java.util.Scanner;

public class BolaMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vamos criar uma bola...");
        System.out.println("Informe a cor da sua bola: ");
        String cor = input.next();
        System.out.println("Informe qual é o material da sua bola: ");
        String material = input.next();
        System.out.println("Informe a circunferência da bola: ");
        int circunferencia = input.nextInt();
        Bola bola = new Bola(cor, material, circunferencia);
        while (true){
            System.out.println("O que deseja fazer? \n 1= Mostrar cor \n2 Trocar cor \nQual sua opção: ");
            System.out.println("A qualquer momento digite -1 para encerrar o programa");
            int resposta = input.nextInt();
            while (resposta != 1 && resposta != 2 && resposta != -1){
                System.out.println("valor inválido, por favor digite apenas as seguintes opções: 1- mostrar cor \n 2 - trocar cor \n -1 sair do programa");
                resposta = input.nextInt();
            }
            if (resposta == 1){
                System.out.println("Cor: " + bola.getCor());
            }else if (resposta == 2){
                System.out.println("Qual é a nova cor para por na bola: ");
                cor = input.next();
                bola.setCor(cor);
            }else if (resposta == -1){
                System.out.println("Tchau!");
                break;
            }
        }
        input.close();
    }
}
