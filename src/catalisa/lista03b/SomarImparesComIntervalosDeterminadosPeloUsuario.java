package catalisa.lista03b;

import java.util.Scanner;

public class SomarImparesComIntervalosDeterminadosPeloUsuario {
    public static void main(String[] args) {
        int soma = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o valor de início: ");
        int inicio = input.nextInt();
        System.out.println("Informe o valor de parada para realizarmos o calculo: ");
        int parada = input.nextInt();
        while (parada <= inicio){
            System.out.println("Digite novamente o ponto de parada: \nObservação o ponto final não pode ser menor ou igual ao ponto de início");
            parada  = input.nextInt();
        }
        input.close();
        for (int i = inicio; i <= parada; i++){
            if (i % 2 == 1){
                System.out.println(i + " é um valor impar e vou adicionalo a soma ");
                soma += i;
            }
        }
        System.out.println("A soma de todos os valores impares dentro do intervalo solicitado é: " + soma);
    }
}
