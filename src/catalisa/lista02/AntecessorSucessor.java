package catalisa.lista02;

import java.util.Scanner;

public class AntecessorSucessor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um valor númerico: ");
        double num = input.nextDouble();
        double antecessor = num - 1;
        double sucessor = num + 1;
        System.out.println("Determinado o valor informado o seu antecessor é: " + antecessor + " e o seu sucessor é: " + sucessor);
    }
}
