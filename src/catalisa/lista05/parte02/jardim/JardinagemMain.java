package catalisa.lista05.parte02.jardim;

import java.util.Scanner;

public class JardinagemMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos métros de grama: ");
        int qtdMetrosGrama = input.nextInt();
        System.out.println("Valor do corte por métro da grama: ");
        double valorCorteGrama = input.nextDouble();
        System.out.println("Valor do kg do adubo: ");
        double valorAdubo = input.nextDouble();
        Jardinagem j1 = new Jardinagem(qtdMetrosGrama, valorAdubo, valorCorteGrama);
        System.out.println("Preço do adubo: " + j1.precoAdubo());
        System.out.println("Preço do corte da grama: " + j1.precoCorteGrama());
        System.out.println("Usar adubo: " + j1.usarAdubo());
        input.close();
    }
}
