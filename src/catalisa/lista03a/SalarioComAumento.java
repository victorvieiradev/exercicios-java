package catalisa.lista03a;

import java.util.Scanner;

public class SalarioComAumento {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o seu salário atual: ");
        double salario = input.nextDouble();
        input.close();
        if (salario <= 280) {
            msg(salario, 20);
        }else if (salario > 280 && salario <= 700){
            msg(salario, 15);
        }else if (salario > 700 && salario < 1500){
            msg(salario, 10);
        }else if (salario >= 1500){
            msg(salario, 5);
        }
    }

    public static void msg(double salario, double aumentoEmPercentual){
        double percentual = aumentoEmPercentual;
        double aumento = (percentual * salario)/100;
        double novoSalario = salario + aumento;
        System.out.printf("Salário atual: R$ %.2f \nVocê ganhou um aumento de %.2f porcento \nSendo assim o seu reajuste é de %.2f \nSeu novo salário é %.2f", salario, percentual, aumento, novoSalario);
    }
}
