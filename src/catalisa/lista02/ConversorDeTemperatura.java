package catalisa.lista02;

import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("converter Fahrenheit para celcius: ");
        System.out.println("Informe a temperatura em graus Fahrenheit: ");
        double f = input.nextDouble();
        input.close();
        double c = 5 * ((f-32) / 9);
        System.out.printf("%.2f graus Fahrenheit é equivalente a %.2f graus celcius", f, c);
    }
}
