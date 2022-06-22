package catalisa.lista02;

import java.util.Scanner;

public class SalarioMensal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Saiba o valor mensal dado o valor por horas e o número de horas trabalhadas no mês.");
        System.out.println("Informe o valor da sua hora R$");
        double valorDaHora = input.nextDouble();
        System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
        int horasTrabalhadas = input.nextInt();
        input.close();
        double salarioMensal = horasTrabalhadas * valorDaHora;
        String msg = String.format("%d horas trabalhadas \n%.2f R$ valor da sua hora \nDeterminadas as informações informadas o seu salário será \nSalário R$ %.2f", horasTrabalhadas, valorDaHora, salarioMensal);
        System.out.println(msg);
    }
}
