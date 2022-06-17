package estruturasequencial;
//5. Faça um Programa que converta metros para centímetros.
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um valor inteiro em métros: ");
        int metros = input.nextInt();
        int centimetros = (metros * 100);
        System.out.println("Para o valor digitado em métros o seu valor em centímetros é: " + centimetros);
        input.close();
    }
}
