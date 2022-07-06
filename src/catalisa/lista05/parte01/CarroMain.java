package catalisa.lista05.parte01;

import java.util.Scanner;

public class CarroMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a potência:");
        double potencia = input.nextDouble();
        Carro carro1 = new Carro(4, "fox", "qualquer coisa", potencia);
        System.out.println(carro1.marca);
        System.out.println(carro1.modelo);
        System.out.println(carro1.potencia);
        Carro carro2 = new Carro(2, "fiat", "não sei nada de carro");
        System.out.println("A potencia do corro 2 é " + carro2.potencia);

    }
}
