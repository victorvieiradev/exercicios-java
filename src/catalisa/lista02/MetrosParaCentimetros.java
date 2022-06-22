package catalisa.lista02;

import java.util.Scanner;

public class MetrosParaCentimetros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um valor  inteiro em métros: ");
        int metros = input.nextInt();
        input.close();
        int centimetros = metros * 100;
        System.out.printf("%d métros é igual há %d centímetros", metros, centimetros);

    }
}
