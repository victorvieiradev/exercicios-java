package catalisa.lista03a;

import java.util.Scanner;

public class SalarioComAumento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o seu salário atual: ");
        double salario = input.nextDouble();
        input.close();
        double percentual = 0;
        if (salario <= 280){
            percentual = 20;
            double aumento = (percentual * salario)/100;
            double novoSalario = salario + aumento;
            System.out.printf("Salário atual: R$ %.2f \nVocê ganhou um aumento de %.2f porcento \nSendo assim o seu reajuste é de %.2f \nSeu novo salário é %.2f", salario, percentual, aumento, novoSalario);
        }

        if (salario > 280 && salario <= 700){
            percentual = 15;
            double aumento = (percentual * salario)/100;
            double novoSalario = salario + aumento;
            System.out.printf("Salário atual: R$ %.2f \nVocê ganhou um aumento de %.2f porcento \nSendo assim o seu reajuste é de %.2f \nSeu novo salário é %.2f", salario, percentual, aumento, novoSalario);
        }

        if (salario > 700 && salario < 1500){
            percentual = 10;
            double aumento = (percentual * salario)/100;
            double novoSalario = salario + aumento;
            System.out.printf("Salário atual: R$ %.2f \nVocê ganhou um aumento de %.2f porcento \nSendo assim o seu reajuste é de %.2f \nSeu novo salário é %.2f", salario, percentual, aumento, novoSalario);
        }

        if (salario >= 1500){
    percentual = 5;
            double aumento = (percentual * salario)/100;
            double novoSalario = salario + aumento;
            System.out.printf("Salário atual: R$ %.2f \nVocê ganhou um aumento de %.2f porcento \nSendo assim o seu reajuste é de %.2f \nSeu novo salário é %.2f", salario, percentual, aumento, novoSalario);
        }
    }
}
