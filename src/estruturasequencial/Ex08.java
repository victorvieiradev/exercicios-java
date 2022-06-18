package estruturasequencial;

import java.util.Scanner;
//8. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
// Calcule e mostre o total do seu salário no referido mês.
public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual é o valor da sua hora trabalhada no mês: R$");
        double valorHora = input.nextDouble();
        System.out.println("Qual é sua quantidade de horas trabalhadas no mês: ");
        double quantidadeDeHorasTrabalhadas = input.nextDouble();
        double salarioMensal = (quantidadeDeHorasTrabalhadas * valorHora);
        System.out.println("Dado as informações informadas o seu salário mensal é: R$" + salarioMensal);
        input.close();
    }
}
